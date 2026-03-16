import java.util.*;
public class TWoSum{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr1=new int[n];
       int[] arr2=new int[2];
       for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
       }
       int target=sc.nextInt();
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(arr1[i]+arr1[j]==target){
                   arr2[0]=i;
                   arr2[1]=j;
               }
           }
       }
       for(int i=0;i<arr2.length;i++){
           System.out.print(arr2[i]+" ");
       }
        
    }
}