import java.util.*;
public class palindrome {
	public static void main(String[] args){
		int n,a,c;
		int b=0;
Scanner in=new Scanner(System.in);
		 n=in.nextInt();
		 c=n;
	while(n>0){
			a=n%10;
		b=b*10+a;
		n=n/10;
		}
		if(b==c){
			System.out.println("palindrome");
		}
			else{
				System.out.println("not a palindrome");
			}
		
			
		}
	}


