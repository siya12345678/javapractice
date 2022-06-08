package methodpractice;

public class WithReturnTypeNoParameters {

    public static void main(String[] arg) {
        WithReturnTypeNoParameters t = new WithReturnTypeNoParameters();

        int result = t.addition();

        System.out.println(result);//50
        System.out.println(t.addition());
    }

        //2. With return  type, no parameter

        public int addition(){
            int a =20;
            int b =30;
            String name = "prime";
            int result = a+b;//50
            return result;


        }
    }

