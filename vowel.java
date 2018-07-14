import java.util.*;
public class vowels {
	public static void main(String[] args){
		char ch;
		Scanner in=new Scanner(System.in);
		ch=in.next().charAt(0);
		if(ch=='a' ||ch=='A' ||ch=='e' ||ch=='E' ||ch=='i'||ch=='I' ||ch=='o'||ch=='O'||ch=='u' ||ch=='U')
		{
			System.out.println("vowel");
		}
			else{
				System.out.println("invalid");
			}
		}
				
	}
