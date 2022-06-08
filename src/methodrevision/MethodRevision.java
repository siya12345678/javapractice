package methodrevision;

public class MethodRevision {

    public static void main(String[] args) {
        //static area
        MethodRevision me = new MethodRevision(); //object
        me.additionCalculation();
        me.subtraction(20,10);
        me.subtraction(50,25);
        me.myAddition();//5,10
        int value=  me.myAddition();
        System.out.println(value); //5,10,15
        //System.out.println(me.myAddition());//5,10,15
       String name = myName("prime Test");
        System.out.println(name);
        System.out.println(myName("prime Testing"));



    }

    //1.No return type(void), No parameters(args)
    //instance method  (instance relates to objects)
    public void additionCalculation() {
        //Local variables
        int a = 10;
        int b = 20;
        System.out.println(a + b);

    }

    //2. No return type(void) with parameter(args)
    //instance method
    public void subtraction(int a , int b){

        System.out.println(a-b);


    }
    //3.With return type(data), no parameter(args)
    //instant method
    public int myAddition(){
        int a=5;
        int b=10;
        System.out.println("First value : "+a);
        System.out.println("Second value: "+b);
        return  a+b;
    }
    //4.With return type(data), With parametr(args)
    //static method
    private static String myName(String name){
        return name;
    }



}

