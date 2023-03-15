package jcf;

import java.util.*;

public class ComparableTest {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        Set<Person> personSet = new TreeSet<Person>();

        fillCollection(personList);
        fillCollection(personSet);

        Collections.sort(personList);

        System.out.println(personList);
        System.out.println(personSet);

    }

    public static void fillCollection(Collection collection) {

        collection.add(new Person(3, "Katy"));
        collection.add(new Person(2, "Bob"));
        collection.add(new Person(4, "Tom"));
        collection.add(new Person(1, "Jack"));
    }
}

class Person implements Comparable<Person> {

    private int id;
    private String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    @Override
    public  String toString(){
        return "Person{" +
                "id=" + id +
                "name=" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Person o) {
        if (this.getId() > o.getId()) {
            return 1;
        } else if (this.getId() < o.getId()) {
            return -1;
        } else return 0;
    }
}

