import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       /*  System.out.println(4.5 - 2.7);  // gives answer 1.799999999998
        System.out.format("When formatted: %.1f", 4.5 - 2.7);
        System.out.format("I have %d cats, %d dogs, and 1 %s.", 7,2,"panther"); */
        Scanner scanner = new Scanner(System.in);
//        scanner.next();
//        scanner.nextInt();
//        scanner.nextDouble();
//        boolean b = scanner.nextBoolean();
        System.out.println("What is your name?");
        String userName = scanner.next();
        // String name = scanner.nextLine();  This takes the whole line and whatever they type
        System.out.println(userName + " is a nice name");
        System.out.format("Your name has %d characters", userName.length());

        System.out.println("\nHow old are you, " + userName + "?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");
        System.out.format("You've lived %d years.  In another %d years you'll be %d years", userAge, userAge, 2*userAge);

        System.out.println("\nHow tall are you in metres");
        double userHeight = scanner.nextDouble();
        System.out.println("You are " + userHeight + " metres tall.");

        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.62;
        System.out.println("\nThe difference between your height and the average is: ");
        System.out.format("%g.2fm if you are male,", averageMaleHeightDifference);
        System.out.format("%.2fm if you are female.", averageFemaleHeightDifference);


    }
}
