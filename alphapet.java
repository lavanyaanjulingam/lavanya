import java.util.*;
public class alphapet {
	public static void main(String[] args){
	char ch;
		Scanner in=new Scanner(System.in);
		ch=in.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			System.out.println("alphapet");
		}
		else{
			System.out.println("not alphapet");
		}
			
		
		
		
	}

}
