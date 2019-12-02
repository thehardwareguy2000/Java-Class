//reverse of a given no.


class p6{
	public static void main( String ... args){
		int n1=Integer.parseInt(args[0]);

		int digit=0,n2=0;
	
		while(n1>0){
		digit=n1%10;
		n2=n2*10+digit;
		n1=n1/10;
		}
	System.out.println("reverse ="+n2);
	}
}