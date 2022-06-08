package javacollection;

public class WrapperClassDemo {

    public static void main(String[] args) {
        int i =10;

        Integer wrapper = new Integer(i);
        System.out.println(wrapper);

       int unwrappered = wrapper.intValue();
        System.out.println(unwrappered);
    }
}
