package ru.innopolis.stc12.homework.ex2;

import java.util.*;

public class MathBox extends ObjectBox {
    private Set<Integer> set = new TreeSet<>();

    public MathBox(Integer[] array) throws WrongObjectArgument {
        super(array);
        set.addAll(super.getSet());
    }

    public Set getSet() {
        return set;
    }

    public int summator() {
        int sum = 0;
        for (Object o : set) {
            sum += (int) o;
        }
        return sum;
    }

    public List splitter(int denominator) {
        List split = new LinkedList<Integer>();
        for (Object o : set) {
            if (denominator != 0) {
                split.add((int) o / denominator);
            }
        }
        return split;
    }

    public void delete(int value) {
        this.set.remove(value);
    }
}
