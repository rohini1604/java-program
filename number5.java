package javamy;
import java.util.Arrays;
import java.util.Scanner;
public class number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Ramu";
		String str2="Uram";
		 char[] charArray1=str1.toCharArray();
		 char[] charArray2=str2.toCharArray();
		 
		 Arrays.sort(charArray1);
		 Arrays.sort(charArray2);
		 
		 if(Arrays.equals(charArray1,charArray2)) {
			 System.out.println(str1+"and"+str2+"are anagram");}
			 else {
				 System.out.println(str1+"and"+str2+"are not anagram");
				 
			 }
			 
		 }

	}


