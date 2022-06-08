package morningchallenge;

import java.util.Scanner;

public class Challenge5 {
    String reverse(String str){
        StringBuilder obj =new StringBuilder(str);
        obj.reverse();
        return obj.toString();

    }

    public static void main(String[] args) {
        Challenge5 obj1 = new Challenge5();
        System.out.println("Please enter the string you want to reverse");
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println(obj1.reverse(name));

    }
}
