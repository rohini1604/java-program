package javamy;
import java.util.*;
public class number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		s1=s1.replaceAll("[aeiouAEIOU]" , "*");
		String s2=sc.next();
		s2=s1.replaceAll("[^aeiouAEIOU]" ,"@");
		String s3=sc.next();
		s3=s3.toUpperCase();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	    
		

	}

}
