import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println(userName + " is a nice name");

        System.out.println("\nHow old are you?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");
        //Why doesn't this file work?
    }
}
