package javamy;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num[]= {2,43,66,3,5,123,432,44,78};
		int x=sc.nextInt();
		for(int i=0;i<=num.length-1;i++) {
			if(num[i]>x) {
				System.out.println(num[i]);
			}
			}
	}

}
