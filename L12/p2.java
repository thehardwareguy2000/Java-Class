interface B{
	int sub(int a,int b);
}
class p2{
	public static void main(String ...args){
	B a1= (int a,int b)->  a -b;
	System.out.println(a1.sub(20,30));

	B a2= (a,b)-> {return a-b;};
	System.out.println(a2.sub(20,30));


	B a3= ( a, b)-> {return a-b;};
	System.out.println(a3.sub(20,30));


	B a4= (a, b)-> {
						int res=a-b;
						return res;
					};
	System.out.println(a4.sub(20,30));
	}
}