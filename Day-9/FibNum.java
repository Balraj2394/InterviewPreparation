import java.util.*;
public class FibNum{
    public static int fib(int num){
        if (num<=0) 
            return 0;
        if (num==1) 
            return 1;

        return fib(num-1)+fib(num-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}