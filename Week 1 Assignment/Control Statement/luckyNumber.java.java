package dxc;

import java.util.Scanner;

public class luckyNumber {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n;
		int r=0,d,pos=1,org,count=0;
		System.out.println("Enter the number:");
		n=s.nextInt();
		org=n;
		while(n!=0)
		{
			d=n%10;
			n=n/10;
			count++;
		}
		while(org!=0)
		{
			d=org%10;
			org=org/10;
			if(count%2==0)
			{
			if(pos%2==1)
			{
				r+=Math.pow(d, 2);
			}
			}
			else
			{
				if(pos%2==0)
					r+=Math.pow(d, 2);	
			}
			pos++;
			
		}
		if(r%9==0)
		System.out.println("The number is lucky number");
		else
			System.out.println("The number is not lucky number");	

	}

}

