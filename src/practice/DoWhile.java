package practice;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        int inputNumb;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5");

        do {

            inputNumb = Integer.parseInt(input.nextLine());

        }while (inputNumb != 5);
    }
}
