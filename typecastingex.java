package javamy;

public class typecastingex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=66;
		char c;
		c=(char)x;
		System.out.println(c);
		double d=x;
		System.out.println(d);
		double e=12.54;
		int y=(int)e;
		System.out.println(y);
		int product=1;
		int sum=0;
		for(int i=1;i<=5;i++) {
			if(i%2==0) {
				product=product*i;
			}
			else {
				sum=sum+i;
			}
		}
		System.out.println("product of even num is"+product);
		System.out.println("sum of odd num is"+sum);
		
		
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("fibonacci series");
		System.out.println(n1+" "+n2);
		for(int i=1;i<=5;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			{
				
				char c1='L';
				switch(c1) {
				case 'A':System.out.println("inside A");
				break;
				case 'E':System.out.println("inside E");
				break;
				case 'I':System.out.println("inside I");
				break;
				case 'O':System.out.println("inside O");
				break;
				default:System.out.println("default");
				}
				System.out.println("pattern");
				for(int k=1;k<=5;k++) {
					char ch='A';
					for(int j=1;j<=k;j++) {
						System.out.println(ch);
						ch++;
					}
					System.out.println();
				}
				int fact=1;
				for(int l=1;l<=5;l++) {
					fact=fact*i;
				}
				System.out.println("fact is:  " +fact);
					}
				
				
				}
				
		
		
		

	}

}
