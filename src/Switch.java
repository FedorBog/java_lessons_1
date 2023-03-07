import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        switch (age){
            case 0:
                System.out.println("Kindergarden");
                break;
            case 7:
                System.out.println("School");
                break;
            case 18:
                System.out.println("University");
                break;

            default:
                System.out.println("Undefined");
        }
    }
}
