import java.util.Scanner;
public class NonRepChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean r=false;
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    r=true;
                    break;
                }
            }
            if(r==false){
                System.out.println(ch);
                break;
            }
            
        }
    }
}