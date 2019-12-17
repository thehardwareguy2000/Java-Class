class p3{
	
	public static void main(String ... args){
	try{
	int op1= Integer.parseInt(args[0]);
	String oper=args[1];
	int op2= Integer.parseInt(args[2]);
	int res = 0;
	switch(oper){
		case "plus": res =op1+op2; System.out.println(res); break;
		case "minus": res =op1-op2; System.out.println(res); break;
		case "mul": res =op1*op2; System.out.println(res); break;
		case "div": res =op1/op2; System.out.println(res); break;
		default: System.out.println("Invalid input");
		}//end of switch


	}//end of try

	catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
	System.out.println("abe saale 2 Integer + ek operator enter kar enter kar");
	}
	catch(ArithmeticException e){
	System.out.println("abe saale 0 se divide kare ga");
	}
	catch(Exception e){
	System.out.println("abe saale");
	}


	}

}