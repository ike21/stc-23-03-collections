package ru.innopolis.stc12.homework;

import java.util.*;

public class MathBox {
    private Set set = new TreeSet<Integer>();

    public MathBox(List array) {
        set.addAll(array);
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((set == null) ? 0 : set.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        MathBox math = (MathBox) obj;
        return set.equals(math.set);
    }

    @Override
    public String toString() {
        return "Array of integer: " + set + "\nhashCode: " + set.hashCode();
    }

    public void delete(int value) {
        this.set.remove(value);
    }
}
