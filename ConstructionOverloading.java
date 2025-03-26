package javamy;

public class ConstructionOverloading {

		int id;
		String name;
		int dep_id;
		public ConstructionOverloading(int a,String b) {
			id=a;
			name=b;
		}
		public ConstructionOverloading(int a,String b,int c) {
			 id=a;
			 name=b;
		  dep_id=c;
		}
		public void display() {
			System.out.println(id+" "+name+" "+dep_id);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ConstructionOverloading c=new ConstructionOverloading(1,"funcode");
			ConstructionOverloading c2=new ConstructionOverloading(1,"rohini",3);
			c.display();
			c2.display();
	}

}
