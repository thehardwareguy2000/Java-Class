//prog to display feed back message (switch case)






class p1{
	public static void main( String ... args){
		int n1=Integer.parseInt(args[0]);



	switch(n1){

			case 5:System.out.println("Super");
				break;
			case 4:System.out.println("okok");
				break;
			case 3:System.out.println("okok");
				break;
			case 2:System.out.println("poor");
				break;

			case 1:System.out.println("poor");
				break;
			default:System.out.println("invalid rating");
	}
}
}