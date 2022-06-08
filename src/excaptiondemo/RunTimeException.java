package excaptiondemo;

public class RunTimeException {

    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 0;

      //  int result = a/b;
      //  System.out.println(result);
        RunTimeException obj =new RunTimeException();
        obj.division();
      /*  try {
            int divide = a / b;
            System.out.println("Result = " + divide);
            //data connection
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Hi");
        }finally {
            System.out.println("Always execute");

        }*/
    }
    public void division() throws Exception{
        int x =10;
        int y=0;
     int result =x/y;
        System.out.println(result);
    }
}