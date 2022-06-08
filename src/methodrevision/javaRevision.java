package methodrevision;

public class javaRevision {
   int a = 10;
   String name = "Jinal";
   boolean result = true;
   String []names ={"Jinal", "Patel","Java"};
   String myCarName;

   //constructor
    public javaRevision(String myCarName){
    this.myCarName=myCarName;
        System.out.println("This is a one arg constructor");

   }
   public javaRevision(){
       System.out.println("0 arg constructor");
   }


    public static void main(String[] args) {
        javaRevision obj1 = new javaRevision();//object
        System.out.println(obj1.name);//variable calling
        new javaRevision("Honda");
        System.out.println(obj1.myCarName);
       //calling firstMethod
        obj1.firstMethod();
        new javaRevision().firstMethod();
        obj1.secondMethod("Shiv");
        System.out.println(thirdMethod());//50
        System.out.println(forthMethod("Siya"));
    }

    //No return type , with no parameters
    public void firstMethod(){
        javaRevision javaRevision = new javaRevision();
        new javaRevision();//nameless object
        System.out.println("First Method" +javaRevision.a);//10
        //System.out.println(a);
        System.out.println(new javaRevision().name);//Jinal
    }

    //No return type with parameter
    public void secondMethod(String myName){
        System.out.println(myName);
    }
    //With return type No parameters
    public static int thirdMethod(){
        int x = 20;
        int y = 30;
       int result= x+y;
       return result;
    }

    //with return type with parameters

    private static String forthMethod(String yourName){
        return yourName;
    }


    private void statements(){

        for(int i = 1; i<=5; i++){ //1,2,Hello,4,5
            if(i!=3){
                System.out.println(i);
            }else {
                System.out.println("Hello");
            }

        }
        int a = 1;
        while(a<=5){
            System.out.println("Hi");
            a++;

        }
    }
}
