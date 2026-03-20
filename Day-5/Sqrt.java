import java.util.*;
public class Sqrt{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=0,r=n;
		while(l<=r) {
			int m=l+(r-l)/2;
			int sqrt=m*m;
			if(sqrt==n) {
				System.out.println(m);
				break;
			} else if(sqrt>n) {
				r=m-1;
			} else {
				l=m+1;
			}
		}
	}
}
