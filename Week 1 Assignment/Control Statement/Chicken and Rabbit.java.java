package dxc;

import java.util.Scanner;

public class LegsAndHead {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int head,leg,chcount=0,rcount=0;
		System.out.println("Enter the head:");
		head=s.nextInt();
		System.out.println("Enter the leg :");
		leg=s.nextInt();
		if(head>=leg || leg%2!=0)
		{
			System.out.println("The number of chickens and rabbits cannot be found ");
		}
		else
		{
			rcount=(leg-2*head)/2;
			chcount=head-rcount;
			System.out.println("Chicken :"+chcount+" Rabbit :"+rcount);
		}
	}


}



