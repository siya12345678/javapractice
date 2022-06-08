package conditionalstatement;

public class NestedIfElse {
    public static void main(String[] args) {
        int marks = 90;


        if (marks>=90){
            System.out.println("Grade A");
        }else if(marks<80 && marks >=70){
            System.out.println("Grade B");
        }else if(marks<80 && marks >=60){
            System.out.println("Grade c");
        }else {
            System.out.println("Pass");

        }

    }
}
