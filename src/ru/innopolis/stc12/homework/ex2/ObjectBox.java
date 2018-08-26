package ru.innopolis.stc12.homework.ex2;

import java.util.*;

public class ObjectBox {
    private Set<Object> set = new TreeSet<>();

    public ObjectBox(Object array[]) throws WrongObjectArgument {
        try {
            if (array != null) {
                for (Object o : array) {
                    set.add(o);
                }
            }
        } catch (Exception e) {
            throw new WrongObjectArgument("Elements of array must be one type");
        }
    }

    public Set getSet() {
        return set;
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
        ObjectBox math = (ObjectBox) obj;
        return set.equals(math.set);
    }

    @Override
    public String toString() {
        return "Array: " + set + "\nhashCode: " + set.hashCode();
    }

    public void addObject(Object elem) throws WrongObjectArgument {
        try {
            if (elem != null) {
                set.add(elem);
            }
        } catch (Exception e) {
            throw new WrongObjectArgument("Elements of array must be one type");
        }
    }

    public boolean deleteObject(Object elem) throws WrongObjectArgument {
        try {
            if (elem != null && set.contains(elem)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            throw new WrongObjectArgument("Elements of array must be one type");
        }
    }

    public void dump() {
        for (Object o : set) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
