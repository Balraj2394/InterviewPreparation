import java.util.Scanner;
public class DupArrNum{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int c=0;
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i]==arr[j]){
	           c++;
	            }
	        }
	        if(c==1)
	        System.out.print(arr[i]+" ");
	        c=0;
	    }
	}
}