package com.hmproductions.bingo.utils;

import com.hmproductions.bingo.data.Player;

import java.util.ArrayList;
import java.util.Random;

public class Miscellaneous {

    // Returns an int[size][size] containing numbers 1 to 25 randomly placed
    public static int[] CreateRandomGameArray(int size) {

        int[] randomArray = new int[size * size];
        int randomNumber1, randomNumber2, temp;

        for (int i = 0; i < size * size; ++i)
            randomArray[i] = i + 1;

        // Swapping two random elements of array 100 times
        for (int i = 0; i < 10; ++i)
            for (int j = 0; j < 10; ++j) {

                randomNumber1 = (new Random().nextInt(size * size));
                randomNumber2 = (new Random().nextInt(size * size));

                temp = randomArray[randomNumber1];
                randomArray[randomNumber1] = randomArray[randomNumber2];
                randomArray[randomNumber2] = temp;
            }

        return randomArray;
    }

    public static int nameToIdHash(String name) {
        return ((int)name.charAt(0) * (int)name.charAt(name.length()/2) * (int)name.charAt(name.length() - 1)) % 41;
    }

    public static String getNameFromId(ArrayList<Player> playerArrayList, int id) {
        for (Player player : playerArrayList) {
            if (player.getId() == id)
                return player.getName();
        }

        return null;
    }

    public static String getColorFromId(ArrayList<Player> playerArrayList, int id) {
        for (Player player : playerArrayList) {
            if (player.getId() == id)
                return player.getColor();
        }

        return null;
    }
}