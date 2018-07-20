import java.util.*;
public class factorial {
	public static void main(String[] args){
		int i,fact=1,n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++){
			fact=fact*i;
			
		}
		System.out.println("factorial is"+fact);
	}

}
