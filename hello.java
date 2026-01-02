import java.util.*;

class hello{
    public static void main(String args[]){
      String a1 = "apple";
      String a2 = "apple";

      String f1 = new String("banana");
      String f2 = new String("banana");

      System.out.println(a1 == a2); // true, same reference in string pool
      System.out.println(f1 == f2); // false, different references
    }
}