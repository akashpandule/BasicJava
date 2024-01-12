import java.util.*;
public class WithoutthredSwap {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first Number");
    int Number1=sc.nextInt();
    System.out.println("Enter the second Number");
    int Number2=sc.nextInt();
    Number1=Number1+Number2;
    Number2=Number1-Number2;
    Number1=Number1-Number2;
    System.out.println("Your swaping Number");
    System.out.println(Number1);
    System.out.println(Number2);
  }  
}
