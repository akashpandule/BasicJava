import java.util.*;
public class SimpleIntrace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int total=p*t*r;
        int final_Ammount=total/100;
        System.out.println(final_Ammount);
    }
}
