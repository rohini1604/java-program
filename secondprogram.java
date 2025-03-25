package javamy;
import java.util.*;
public class secondprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter weight");
		int weight=sc.nextInt();
		if(age<45&&weight<65) {
			System.out.println("eligible for physical test");}
		else {
			System.out.println("not eligible for physical test");}
		
		
		System.out.println("enter char");
		char c=sc.next().charAt(0);
		if(c>'A'&&c<='E') {
			System.out.println("list between a and e");}
			else {
				System.out.println("doesnt not list between a and e");
			}
		}
			
		}
		




