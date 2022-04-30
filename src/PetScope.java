import java.util.Scanner;
public class PetScope {
    public static void main(String[] args) {
        int numPets = -1;
        int x;
        int y;
        Scanner scanner;
        if (true) {
            scanner = new Scanner(System.in);
            System.out.println("Enter the number of pets you own:");
            numPets = scanner.nextInt();
        }
        switch (numPets) {
            case 1:
                System.out.println("You have " + numPets + " pet");
//                System.out.println("You have 1 pet");
                break;
            case 2:
                System.out.println("You have " + numPets + " pets");
                break;
            case -1:
                System.out.println("No number was entered so it was given default number");
                break;
            default:  // if the others are not true it is like else
                System.out.println("Invalid number");
                break; //not necessary but good for consistency or if you add another case it doesnt bleed into next statement
        }

        System.out.println("Enter a number for x:");
        x = scanner.nextInt();
        System.out.println("Enter a number for y:");
        y = scanner.nextInt();
        if (x > y) {
            System.out.println("x is larger than y");
        }
        else if (y > x) {
            System.out.println("y is larger than x");
        }
        else {
            System.out.println("x and y are the same!");

        }

    }
}
