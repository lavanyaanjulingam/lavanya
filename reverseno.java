import java.util.*;
public class reverseno {
	public static void main(String[] args){
		int n;
		int a,b=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		while(n!=0){
			a=n%10;
			n=n/10;
			b=b*10+a;
		}
		System.out.print(b);
	}

}
