interface A{
	void add(int a,int b);
}
class p1{
	public static void main(String ...args){
	A a1= (int a,int b)-> System.out.println(a+b);
	a1.add(20,30);

	A a2= (a,b)-> System.out.println(a+b);
	a2.add(20,30);


	A a3= ( a, b)-> {System.out.println(a+b);};
	a3.add(20,30);


	A a4= (a, b)-> {
						int res=a+b;
						System.out.println(res);
					};
	a4.add(20,30);
	}
}