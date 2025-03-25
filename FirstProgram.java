package javamy;
import java.util.*;
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("hello world");
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum=sum+1;
		}
		System.out.println(sum);
		
		int num=10;
		if(num >1 && num <10) {
			System.out.println("num is within the range");}
		else {
			System.out.println("num is not within the range");}
		if(num%2==0) {
			System.out.println("even num");}
		else {
			System.out.println("odd num");}
		
		
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println(name);
		
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println(age);
		
		System.out.println("Enter the salary");
		float salary=sc.nextFloat();
		System.out.println(salary);
		
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		System.out.println(c);
			
			
			
			
		}

	}


