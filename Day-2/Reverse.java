import java.util.*;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int r,rev=0;
        while(num>0){
            r=num%10;
            num=num/10;
            rev=(rev*10)+r;
        }
        System.out.println(rev);
    }
}