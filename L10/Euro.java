class Money{
	private String country="Canada";
	public String getC(){return country;}

}
class Yen extends Money{
	public String getC(){return super.getC();}

}
public class Euro extends Money{
	public String getC(int x){return super.getC();}
	public static void main(String ... args){
		System.out.print(new Yen().getC()+" "+new Euro().getC());


	}
}