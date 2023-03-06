import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some text");
        String inputText = input.nextLine();
        System.out.println("You entered " + inputText);

        System.out.println("Enter number");
        int inputNumb = Integer.parseInt(input.nextLine().toString());
        System.out.println("You entered " + inputNumb);

    }
}
