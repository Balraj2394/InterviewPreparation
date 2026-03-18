import java.util.Scanner;
public class paliNum{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int rev=0,rem=0;
	    int temp=num;
	    while(temp>0){
	        rem=temp%10;
	        temp/=10;
	        rev=(rev*10)+rem;
	    }
	    if(num==rev){
	        System.out.println("True");
	    }else{
	        System.out.println("False");
	    }
	}
}
