abstract class Rbi{
	private int accno;
	private String name;
	 private double amt;

	Rbi(int accno,String name,double amt){
	this.accno=accno;
	this.name=name;
	this.amt=amt;
	}


	void show(){
	System.out.println("account no."+accno+" has "+amt+" balance left");
	}

	abstract void withdraw(double money);
	abstract void deposit(double money);

}



class Nayabank extends Rbi{
	
	//deposit -->chc 10rs
	//with---> chc 20rs
	Nayabank(int accno,String name,double amt){
		super(accno,name,amt);
	}

	void withdraw(double money){
	//amt=amt-money-20;
	}
	void deposit(double money){
	//amt=amt+money-10;
	}

}


class Bank{
	
public static void main(String ... args){
Nayabank n =new Nayabank(101,"gavin",1000.00);
n.show();
//n.deposit(100);
//n.show();
//n.withdraw(200);
//n.show();
}
}