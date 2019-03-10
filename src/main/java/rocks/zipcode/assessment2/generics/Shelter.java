package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> implements Iterable {
    List<Object> items;
    public Shelter() {
        //throw new NullPointerException();
        items = new ArrayList<Object>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return items.size();
    }

    public void add(Object object) {
        items.add(object);
    }

    public Boolean contains(Object object) {
        return items.contains(object);
    }

    public void remove(Object object) {
        items.remove(object);
    }

    public Object get(Integer index) {
        return items.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return items.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}