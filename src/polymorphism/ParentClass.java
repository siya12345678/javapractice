package polymorphism;

public class ParentClass {

    public void m1(int a, int b){
        System.out.println(a+b);

    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.m1(20,10);//10
    }
}
