package morningchallenge;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter getting message");
        String message = scanner.nextLine();
        System.out.println(" Hi " +name);
        System.out.println(message);
        /*
        string name = " Jinal ";
        String message = "Good morning";
        System.out.println(" Hi " +name);
        System.out.println(message);
        */



    }
}
