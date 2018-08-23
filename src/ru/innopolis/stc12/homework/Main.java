package ru.innopolis.stc12.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List array = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array.add(random.nextInt(100));
        }

        List array2 = new ArrayList<Integer>();
        Random random2 = new Random();
        for (int i = 0; i < 100; i++) {
            array2.add(random2.nextInt(100));
        }

        MathBox mathBox = new MathBox(array);
        MathBox mathBox2 = new MathBox(array2);
        MathBox mathBox3 = new MathBox(array);

        System.out.println("array: " + mathBox.getSet());
        System.out.println("summator: " + mathBox.summator());
        System.out.println("splitter: " + mathBox.splitter(3));
        mathBox.delete(0);
        System.out.println("delete: " + mathBox.getSet());


        System.out.println("equals: " + mathBox.equals(mathBox2));
        System.out.println("equals: " + mathBox.equals(mathBox3));
        System.out.println(mathBox.toString());

    }
}
