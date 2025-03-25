package javamy;
import java.util.*;
public class number10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter theb num");
		int num=sc.nextInt();
		if(num%2!=0) {
			System.out.println("weird");}
		else
			if(num%2==0&& num>=2&&num>=5) {
				System.out.println("not weird");}
			else
				if(num%2==0&&num>=6&&num>=20) {
					System.out.println("wweird");}
				else
					if(num%2==0&&num==20) {
						System.out.println("not weird");}
						else {
							System.out.println("invalid");
						}
		}

	}


