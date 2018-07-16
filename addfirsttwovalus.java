import java.util.*;
public class addingtwovalues {
	public static void main(String[] args){
		int n;
		int i;
		int sum=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=in.nextInt();
			
		}
		for( i=0;i<2;i++){
		
			sum=sum+a[i];
			
		}
		System.out.println(sum);


}}
