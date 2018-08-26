package ru.innopolis.stc12.homework;

/**
 * Создать класс ObjectBox, который будет хранить коллекцию Object.
 * В нем должны быть все методы из MathBox.
 * Методы должны работать корректно когда все элементы коллекции-Number.
 * Если в коллекции есть не Number, должен бросаться Exception, разработанный самостоятельно.
 * У класса должен быть метод addObject, добавляющий объект в коллекцию.
 * У класса должен быть метод deleteObject, проверяющий наличие объекта в коллекции.
 * Должен быть метод dump, выводящий содержимое коллекции в строку.
 */

public class Main {
    public static void main(String[] args) throws WrongObjectArgument {

        int[] array = {1, 2, 3, 4, 4, 5, 6, 7};

        int[] array2 = {1, 2, 3, 4, 4, 5, 6, 8};

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

        Object[] arrayObj = {1, 2, 3, 4, 3};

        Object[] arrayObj2 = null;

        ObjectBox objBox = new ObjectBox(arrayObj);
        objBox.deleteObject(4);
        objBox.addObject(1);
        System.out.println(objBox);

        ObjectBox objBox2 = new ObjectBox(arrayObj2);
        objBox2.dump();
    }
}
