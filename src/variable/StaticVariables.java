package variable;

public class StaticVariables {

    static int x =10; // static variable
    static  String name = "Jinal";


    public static void main(String[] args) {
        int  b = 10;
        System.out.println(x);//10 , direct access
        System.out.println(StaticVariables.x);//10
        System.out.println(name);// direct access, Jinal
        System.out.println(StaticVariables.name);//access with class name, Jinal


        myMethod();//10
    }

    public static void myMethod() {
        System.out.println(x); //direct access
        System.out.println(StaticVariables.x); //access with class name
        System.out.println(name);// direct access
        System.out.println(StaticVariables.name);//access with class name

        int c = 11;
    }
}
