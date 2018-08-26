package ru.innopolis.stc12.homework.ex2;

/**
 * Получившиеся классы MathBox и ObjectBox не имеют связи между собой.
 * Это неправильно. Логичнее было бы сделать MathBox наследником ObjectBox.
 * Необходимо сделать такую связь, правильно распределить поля и методы.
 * Функциональность в целом должна сохраниться.
 */

public class Main {
    public static void main(String[] args) throws WrongObjectArgument {

        Integer[] array = {1, 2, 3, 4, 4, 5, 6, 7};

        Integer[] array2 = {1, 2, 3, 4, 4, 5, 6, 8};


        MathBox mathBox = new MathBox(array);
        MathBox mathBox2 = new MathBox(array2);
        MathBox mathBox3 = new MathBox(array);

        System.out.println("array: " + mathBox.getSet());
        System.out.println("summator: " + mathBox.summator());
        System.out.println("splitter: " + mathBox.splitter(0));
        mathBox.delete(0);
        System.out.println("delete: " + mathBox.getSet());

        System.out.println("equals: " + mathBox.equals(mathBox2));
        System.out.println("equals: " + mathBox.equals(mathBox3));
        System.out.println(mathBox.toString());

    }
}
