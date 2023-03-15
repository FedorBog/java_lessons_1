package practice;

import jdk.swing.interop.SwingInterOpUtils;

public class Break_Continue {

    public static void main(String[] args) {
        int i = 0;

        System.out.println("Break");
        while(true){
           if (i == 15) {
               break;
           }
           System.out.println(i);
           i++;
        }

        System.out.println("Continue");
        for (i = 0; i <=15; i++){
           if (i % 2 == 0){
               continue;
           }
            System.out.println(i);
        }
    }
}
