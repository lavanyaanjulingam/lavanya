import java.util.*;
public class Romanno {
	public static void main(String[] args){
		String str;
		int i;
		int sum=0;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		int  c1[]=new int[str.length()];
		for(i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c=='I'){
			c1[i]=1;
		}
			if(c=='V'){
				c1[i]=5;
			}
			if(c=='X'){
				c1[i]=10;
			}
			if(c=='L'){
				c1[i]=50;
			}
			if(c=='C'){
				c1[i]=100;
			}
			if(c=='D'){
				c1[i]=500;
			}
			if(c=='M'){
				c1[i]=1000;
				}
			System.out.println(c1[i]);
		}
		for(i=0;i<str.length()-1;i++){
		if(c1[i]==c1[i+1]){
				sum=sum+c1[i];
				}
		 if(c1[i]>c1[i+1]){
			sum=sum+c1[i+1]+c1[i];
			}
		else{
			sum=sum+c1[i+1]-c1[i];
		}
		System.out.println(sum);
			}}}


