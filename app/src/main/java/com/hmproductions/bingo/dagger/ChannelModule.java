package com.hmproductions.bingo.dagger;

import android.content.Context;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.hmproductions.bingo.utils.Constants;
import com.squareup.okhttp.ConnectionSpec;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import dagger.Module;
import dagger.Provides;
import io.grpc.ManagedChannel;
import io.grpc.okhttp.OkHttpChannelBuilder;

@Module(includes = ContextModule.class)
public class ChannelModule {

    @Provides
    @BingoApplicationScope
    public ManagedChannel getManagedChannel(Context context) {
        try {
            return OkHttpChannelBuilder
                    .forAddress(Constants.SERVER_ADDRESS, Constants.SERVER_PORT)
                    .sslSocketFactory(getSocketFactory(context))
                    .connectionSpec(ConnectionSpec.MODERN_TLS)
                    .hostnameVerifier((hostname, session) -> true)
                    .build();
        } catch (KeyStoreException | CertificateException | IOException | NoSuchAlgorithmException | UnrecoverableKeyException | KeyManagementException | GooglePlayServicesRepairableException | GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        }

        return null;
    }

    private SSLSocketFactory getSocketFactory(Context context) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, KeyManagementException, UnrecoverableKeyException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {

        byte[] der = Constants.SERVER_CERT.getBytes();
        ByteArrayInputStream crtInputStream = new ByteArrayInputStream(der);

        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        trustStore.load(null);

        CertificateFactory cert_factory = CertificateFactory.getInstance("X509");
        Certificate cert = cert_factory.generateCertificate(crtInputStream);
        trustStore.setCertificateEntry("cert", cert);

        TrustManagerFactory trust_manager_factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trust_manager_factory.init(trustStore);
        TrustManager[] trust_manager = trust_manager_factory.getTrustManagers();

        KeyManagerFactory kmf = KeyManagerFactory.getInstance("X509");
        kmf.init(trustStore, null);
        KeyManager[] keyManagers = kmf.getKeyManagers();

        ProviderInstaller.installIfNeeded(context);
        SSLContext tlsContext = SSLContext.getInstance("TLS");
        tlsContext.init(keyManagers, trust_manager, null);

        return tlsContext.getSocketFactory();
    }
}
