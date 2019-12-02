//sum of digits of given no.


class p5{
	public static void main( String ... args){
		int n1=Integer.parseInt(args[0]);

		int digit=0,sum=0;
	
		while(n1>0){
		digit=n1%10;
		sum=sum+digit;
		n1=n1/10;
		}
	System.out.println("sum of digits ="+sum);
	}
}