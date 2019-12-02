//prog to display no.of days in a month i/p from user 3 letters of month






class p4{
	public static void main( String ... args){
		String n1=args[0];



	switch(n1){

			case "jan","mar","may","jul","aug","oct","dec"->System.out.println("31");
				
			case "feb" ->System.out.println("28");
				
			case "apr","jun","sep","nov" ->System.out.println("30");
			
				

			
			default ->System.out.println("invalid month");
	}
}
}