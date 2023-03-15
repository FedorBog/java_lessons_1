package task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int arrayLength = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[arrayLength];

        int counterBigger8 = 0;
        int counterEqual1 = 0;
        int counterHonest = 0;
        int counterOdd = 0;
        int sum = 0;

        for (int i  = 0; i < arrayLength; i++){
            array[i] = random.nextInt(10);

            if (array[i] > 8){ counterBigger8++; }
            if (array[i] == 1){ counterEqual1++; }
            if (array[i] % 2 == 0){ counterHonest++; }else { counterOdd++; }
            sum += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Length " + arrayLength);
        System.out.println("counterBigger8 " + counterBigger8);
        System.out.println("counterEqual1 " + counterEqual1);
        System.out.println("counterHonest " + counterHonest);
        System.out.println("counterOdd " + counterOdd);
        System.out.println("sum " + sum);

    }
}
