import java.util.*;
import java.util.Scanner;

public class hello {
public static void main(String args[]){

      String a = "one";
      String b = new String("one");

      String c=b;

      System.out.println(a==c); //false , because a refers to string literal in string pool and c refers to object in heap memory
    }
}
