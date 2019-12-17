class A{
	int a;
	A(int a){
	this.a=a;
	}
}
class B extends A{
	int b;
	B(int a,int b){
	super(a);

	//this.a= a;
	this.b=b;
	}
}
class p3{
	public static void main(String ... args){
		B b = new B(10,20);
		System.out.print(b.a+" "+b.b);
	}
}