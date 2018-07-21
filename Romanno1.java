import java.util.*;
public class Romanno {
	public static void main(String[] args){
		String str;
		int i;
Scanner in=new Scanner(System.in);
		str=in.nextLine();
		String s[]={"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
		for(i=0;i<20;i++){
			if(s[i].equals(str)){
				System.out.println(i+1);
				break;
			}
		}}}
