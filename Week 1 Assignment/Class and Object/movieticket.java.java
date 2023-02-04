package dxc;

import java.util.Scanner;

class ticket
{
	private int movieId;
	private int noOfSeat;
	
	public ticket(int id,int seat)
	{
		movieId=id;
		noOfSeat=seat;
	}

	public int getMovieid() {
		return movieId;
	}

	public void setMovieid(int id) {
		this.movieId = id;
	}

	public int getNo_ofseat() {
		return noOfSeat;
	}

	public void setNo_ofseat(int seat) {
		this.noOfSeat= seat;
	}
	public double getCost1()
	{
		
		return((double)noOfSeat*7);	
		
	}
	public double getCost2()
	{
		
		return((double)noOfSeat*8);	
		
	}
	public double getCost3()
	{
		
		return((double)noOfSeat*8.5);	
		
	}
	
}

public class movieticket {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int id,seat;
		System.out.println("Enter MovieId:");
		id=s.nextInt();
		System.out.println("Enter NoOfSeat:");
		seat=s.nextInt();
		ticket t=new ticket(id,seat);
		if(id==111)
		System.out.println("Total amount for booking : $ "+t.getCost1());
		else if(id==112)
			System.out.println("Total amount for booking :$ "+t.getCost2());
		else if(id==113)
			System.out.println("Total amount for booking :  $ "+t.getCost3());
		else
			System.out.println("Sorry!please enter valid movie Id and number of seats");
	}

}


