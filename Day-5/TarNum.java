import java.util.Scanner;
public class TarNum{
	public static int bS(int[] arr,int tar){
		int low=0,high=arr.length-1,mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(tar==arr[mid]){
				return mid;
			}else if(tar<arr[mid]){
				high=mid-1;
			} else{
				low=mid+1;
			}
		}
		return -1;
	}


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int tar=sc.nextInt();
		System.out.println(bS(arr,tar));
	}
}