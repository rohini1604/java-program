package javamy;
import java.util.*;
public class number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		System.out.println("Enter any operator");
		char operator=sc.next().charAt(0);
		double result;
		switch(operator) {
		case '+':result=num1+num2;
		System.out.println("result:"+result);
		break;
		case '-':result=num1-num2;
		System.out.println("result:"+result);
		break;
		case '*':result=num1*num2;
		System.out.println("result:"+result);
		break;
		case '/':result=num1/num2;
		System.out.println("result:"+result);
		break;
		
		}
		
		

	}

}
