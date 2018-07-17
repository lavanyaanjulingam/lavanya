import java.util.*;
public class twointervalsodd {
	public static void main(String[] args){
		int n;
		int i=0;
		int d;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		d=in.nextInt();
		for(i=n+1;i<d;i++){
			if(i%2==0){
				System.out.println(i);
			}
			
		}
	}

}
