import java.util.Scanner;
//why is file red with squiggly line

public class Myconditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        int age = scanner.nextInt();


        if(age >=18) {
            System.out.print("Do you have a VIP Pass? yes/no" );
            String vipPassReply = scanner.next();
            if(vipPassReply.equals("yes")) {
                System.out.println("Thanks, go on in. ");
//                System.out.println("sorry, you must either be over 70 or have a VIP Pass: ");
            }
        }
        else {
            System.out.println("Sorry, you must be over 18,");

        }
//        if(age >= 18 && vipPassReply.equals("yes") || age >= 70) {
//            System.out.println("Thanks go in");
//        }
//        else {
//            System.out.println("Sorry, no can do.");
//        }



    }
}
