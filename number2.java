package javamy;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,2,3,3,4,5,6,6};
		for(int i=0;i<=num.length-1;i++) {
		for(int j=i+1;j<=num.length-1;j++) {
		if(num[i]==num[j]) {
			System.out.println(num[i]+"dublicate");
		}
		

		}
		}
	}
}



