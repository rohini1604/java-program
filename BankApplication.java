package javamy;

public class BankApplication {
	int BankBalance=10000;
	int id;
	String name;
	BankApplication(int id,String name){
		this.id=id;
		this.name=name;
	}
	void accinfo() {
		System.out.println("acc.id:"+id);
		System.out.println("accholder name:"+name);
		System.out.println("acc.balance:"+BankBalance);
	}
	void accdpt(int dptamt) {
		BankBalance=BankBalance+dptamt;
		System.out.println("dptamt:"+dptamt);
	}
	void accwtd(int amtwtd) {
		BankBalance=BankBalance+amtwtd;
		System.out.println("amtwid:"+amtwtd);
	}
	void checkdet() {
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApplication ob=new BankApplication(41,"Rohini");
		ob.accinfo();
		ob.accdpt(2000);
		ob.accwtd(3000);
		ob.checkdet();

	}

}
