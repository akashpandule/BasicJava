import java.util.*;
public class adition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int Number=sc.nextInt();
        System.out.println("enter the seocnd number");
        int Number2=sc.nextInt();
        System.out.println("1.Addtion \n 2.Subsratcion \n .3Multiplecation \n 4 dividing\n");
        int chose=sc.nextInt();
        switch (chose) {
            case 1:
               int Adition=Number+Number2;
               System.out.println("Your ans here!");
               System.out.println(Adition);
                
                break;
              case 2:
                 int Subsratcion=Number-Number2;
                 System.out.println("Your ans here!");
                 System.out.println(Subsratcion);
                 break;
                 case 3:
                 int Multiplecation=Number*Number2;
                 System.out.println("Your Ans here..!");
                 System.out.println(Multiplecation);
                 break;
                 case 4:
                 int reminder=Number%Number2;
                 System.out.println("Your Ans here!");
                 System.out.println(reminder);

            default:
               System.out.println("Invalid value");
                break;
        }
    }
}
