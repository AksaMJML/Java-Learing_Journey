import java.lang.System;
import java.util.Scanner;

class hello{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = input.next();
        System.out.print("Enter Score : ");
        double marks = input.nextInt();
        System.out.print("Enter Department : ");
        String dep = input.next();
        double score = marks / 10;
        System.out.println("Your name is : "+name);
        System.out.println("Your department is : "+dep);
        System.out.println("Your score is : "+score+"/10");
    }
}
