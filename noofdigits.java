import java.util.*;
public class numberofdigits {
	public static void main(String[] args){
	
		int i;
		int count=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n!=0){
			n=n/10;
			count++;
		}
		System.out.println(count);
		
			
		}
	}


