class Parent{
	public float computePay(double d){
	System.out.print("par");
	return 0.0f;

	}
}
public class Child extends Parent{
	public float computePay(double d){
	System.out.print("chi");
	return 0.0f;
	}

	public static void main(String ... args){
	new Child().computePay(0.0);
	}
}