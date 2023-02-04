package dxc;

import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num , reverse =0 ,remainder,original;
		Scanner s = new Scanner(System.in);
		System.out.println("enter any number: ");
		num = s.nextInt();
		original=num;
		
		while(num !=0) {
			remainder= num%10;
			reverse = reverse*10+remainder;
			num = num/10;
			}
 if (original==reverse) {
	 System.out.println(original + " is palindrome ");
 }
 else {
	 System.out.println(original + " is  not palindrome ");
 
 }
	}

}
