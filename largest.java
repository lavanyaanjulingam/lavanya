package string;
import java.util.*;
public class largest {
	public static void main(String[] args){
		int i;
		int n;
		int max=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			}
		for(i=0;i<n;i++){
			
		if(max<a[i]){
			max=a[i];
			
		}}
		System.out.println("maximum value"+max);
	}

}
