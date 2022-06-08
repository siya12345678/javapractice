package stringmethod;

public class StringMethod {

    public static void main(String[] args) {
        String s1 = "This is first string";
        String s2 = "This is second string";

        int l = s1.length();
        System.out.println("Length of the s1 string : "+l);
        System.out.println(s1.contains("First"));//true
        System.out.println(s1.concat("      :Jinal"));
        System.out.println(s1.concat("" +s2));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.isEmpty());
        System.out.println(s1.replace("This" , "Welcome"));
    }
}
