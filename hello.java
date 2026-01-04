import java.util.*;
import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Int: ");
        int i = input.nextInt(); 
        System.out.print("Double: ");
        double d = input.nextDouble();
        System.out.print("String: ");
        String s = input.nextLine();
        input.next();
        
        System.out.println("String : "+s); 
        System.out.println("Double : "+d);
        System.out.println("Int : "+i);
        
    }
}
