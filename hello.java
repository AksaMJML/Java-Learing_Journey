import java.util.*;
import java.util.Scanner;

public class hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the result : ");
        String RCB = sc.next();

        if (RCB.equals("win")) {
            System.out.println("RCB won the match");
        } else if (RCB.equals("lose")) {
            System.out.println("RCB lost the match");
        }else {
            System.out.println("match drawn");
        }
    }
}
