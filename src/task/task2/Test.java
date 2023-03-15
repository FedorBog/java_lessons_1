package task.task2;

import org.w3c.dom.ls.LSOutput;

public class Test {

    public static void main(String[] args) {

        Car volga = new Car();
        System.out.println(volga.toString());

        volga.setModel("Siber");
        volga.setYear(1989);
        volga.setColor("Red");
        System.out.println(volga.toString());

    }
}
