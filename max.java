import java.util.*;
public class maximum {
	public static void main(String[] args){
		int n;
		int i;
	int max;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		max=a[0];
		for(i=0;i<n;i++){
			if(max<a[i]){
				max=a[i];
				
				System.out.println("maximum value"+max);
			}
			
		}
	}
