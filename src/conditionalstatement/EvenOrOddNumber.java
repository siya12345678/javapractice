package conditionalstatement;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        int num = 11;

        if (num % 2 == 0) {
            System.out.println("Number is even number");

        } else {
            System.out.println("I am in false body");

        }

        int a = 10;
        int b = 20;

        if (a == b) {
            System.out.println("a is smaller number");
        }
        System.out.println("I am outside if body");

    }
}
