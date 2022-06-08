package javacollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> Set = new HashSet<String>();
        Set.add("Prime");
        Set.add("Testing");
        Set.add("java");
        Set.add("selenium");

        for(String var: Set){
            System.out.println(var);
        }
    }
}
