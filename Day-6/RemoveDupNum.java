import java.util.Scanner;
public class RemoveDupNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean Dup=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    Dup=true;
                    break;
                }
            }
            if(!Dup){
                System.out.print(arr[i]+" ");
            }
        }
    }
}