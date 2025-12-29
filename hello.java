import java.util.*;

class hello{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 01 :");
        int num1 = input.nextInt();
        System.out.print("Enter Number 02 :");
        int num2 = input.nextInt();
        if(num1==num2){
            System.out.println("Both Numbers are Equal");
        }else{
            if (num1>num2) {
                System.out.println("Number 1 is Greater");
            }else{
                System.out.println("Number 2 is Greater");
            }
        }
    }
}