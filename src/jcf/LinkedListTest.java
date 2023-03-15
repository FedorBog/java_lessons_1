package jcf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        List<Integer> linkList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkList);
        measureTime(arrayList);

    }

    public static void measureTime(List<Integer> list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            list.add(0,i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
