import java.util.*;
public class MissingNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("No.of.Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0,x=n+1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int TSum=x*(x+1)/2;
        System.out.println(TSum-sum);

    }
}