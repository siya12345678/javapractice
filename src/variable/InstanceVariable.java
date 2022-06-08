package variable;

public class InstanceVariable {
    int a =100;// instance variable



    public static void main(String[] args){
        //static area
        InstanceVariable obj = new InstanceVariable();// object
        System.out.println(obj.a);// access with object


    }

    public  void test(){
        //instance area
        InstanceVariable t = new InstanceVariable();
        System.out.println(a);
    }
}
