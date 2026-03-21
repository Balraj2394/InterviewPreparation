import java.util.Scanner;
public class TwoSumTar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int l=0,r=n-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==tar){
                System.out.println(l+" "+r);
                break;
            }
            else if(sum<tar){
                l++;
            }
            else{
                r--;
            }
        }
    }
}