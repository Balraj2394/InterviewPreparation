import java.util.Scanner;
public class StrRev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            rev=rev+ch;
           
        }
         System.out.print(rev);
    }
}