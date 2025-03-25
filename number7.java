package javamy;
import java.util.*;
public class number7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the msarks");
		int marks=sc.nextInt();
		if(marks>=80) {
			System.out.println("grade A");}
		else
			if(marks<=80&&marks>=60) {
				System.out.println("grade B");}
			else
				if(marks==40) {
					System.out.println("grade C");}
				else {
					System.out.println("grade D");}
	}
}
