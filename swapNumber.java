import java.util.*;
public class swapNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number1=sc.nextInt();
        System.out.println("Enter the seond number");
        int number2=sc.nextInt();
        int temp;
         temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("Swapping the Number");
        System.out.println(number1);
        System.out.println(number2);
    }
}
