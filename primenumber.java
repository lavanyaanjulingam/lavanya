public class prime {
	public static void main(String[] args){
		int n;
		int i;
		int count=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=2;i<=n;i++){
			if(n%i==0){
			count++;
}}
			if(count==1){
				System.out.println("prime number");
			}
			else{
				System.out.println("not a prime number");
			}
			
			
		
	}

	}
