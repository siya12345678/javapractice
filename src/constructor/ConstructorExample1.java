package constructor;

import java.util.concurrent.Callable;

public class ConstructorExample1 {

    //This is a constructor
    public ConstructorExample1(){
        System.out.println("I am a Constructor");

    }

    //This is one args constructor
    public ConstructorExample1(int a){
        System.out.println("I am args constructor");

    }
    //This is one constructor
    public ConstructorExample1(String name){

    }

    public ConstructorExample1(int a,int b){
        System.out.println("I am two args constructor");

    }

    public void myMethod(){
     System.out.println("I am a method");

 }

 public static void main(String[] args) {
        ConstructorExample1 obj = new ConstructorExample1(); //I am a constructor
        ConstructorExample1 obj1 = new ConstructorExample1(10);//I am one args constructor
        ConstructorExample1 obj2 = new ConstructorExample1(10,20);//I am two args constructor

     obj.myMethod();//I am a method





         }
     }








