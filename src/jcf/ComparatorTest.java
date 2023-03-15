package jcf;

import java.util.*;

public class ComparatorTest {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("Bird");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Alligator");
        animals.add("Cat");
        animals.add("Frog");

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){ return 1;}
                else if (o1.length() < o2.length()) { return -1;}
                else return 0;
            }
        });
        System.out.println(animals);
    }
}

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {

        if (o1.length() > o2.length()){
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else return 0;
    }
}
