package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.*;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> implements Iterable{
//    List<T> thisShelter;
//    T obj;
    private List<T> elements;



    public Shelter() {
        elements = new ArrayList<>();
        //throw new NullPointerException();
    }


    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return elements.size();
    }

    public void add(Object object) {
        elements.add((T) object);
    }

    public Boolean contains(Object object) {
        return elements.contains((T) object);
    }

    public void remove(Object object) {
        elements.remove((T) object);
    }

    public Object get(Integer index) {
        return elements.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return elements.indexOf((T) ageable);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}