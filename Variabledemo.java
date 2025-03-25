package javamy;

public class Variabledemo {

	
		
		int id;
		String name;
		static String company="TMF";//static
		void show()
		{
			int x=10;
			System.out.println(id +" "+ name +x+company);
		}
		void show2()
		{
			System.out.println(id +" "+ name +company);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Variabledemo ob1=new  Variabledemo();
			 ob1.id=441;
			 ob1.name="rohini";
			 ob1.show2();
			 ob1.show();
			 
			 Variabledemo ob2=new  Variabledemo();
			 ob2.id=442;
			 ob2.name="bhagya";
			 ob2.show();
			 ob2.show2();
		}
}
