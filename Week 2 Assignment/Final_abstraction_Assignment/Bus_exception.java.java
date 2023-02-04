package Aassignment;

class InvalidCouponCodeException extends Exception{
	public InvalidCouponCodeException (String message) {
		super(message);
	}
}
class InvalidDestinationException extends Exception{
	public InvalidDestinationException (String message) {
		super(message);
	}
}
class InvalidTripPackageException extends Exception{
	public InvalidTripPackageException (String message) {
		super(message);
	}
}
class BusBooking{
	private int bookingId;
	private String destination;
	private String tripPackage;
	private double TotalAmount;
	public BusBooking(int bookingId, String destination, String tripPackage) {
		this.bookingId = bookingId;
		this.destination = destination;
		this.tripPackage = tripPackage;
		this.TotalAmount=0;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTripPackage() {
		return tripPackage;
	}
	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public boolean validateCouponCode(String coupenCode,int numberOFMembers)throws InvalidCouponCodeException{

		if((coupenCode.equals("BIGBUS")&& numberOFMembers>+10)||
		(coupenCode.equals("MAGICBUS")&& numberOFMembers>+15))
        return true;

        else throw new InvalidCouponCodeException("Invalide coupen code");
	}
	 public String booking(String coupenCode,int numberOfMembers) {
		 try{
			 if(!(this.destination.equals("Washington DC")||
			      this.destination.equals("Philadelphia ")||
			      this.destination.equals("Orlando")||
			      this.destination.equals("Boston ")||
			      this.destination.equals("Atlanta ")))
				 throw new  InvalidDestinationException("Invalid destination");
			 else if(!(this.tripPackage.equals("Regular")||
					 this.tripPackage.equals("Regular")))
				 throw new InvalidTripPackageException("Invaild package");
			 validateCouponCode(coupenCode,numberOfMembers);
			 if(tripPackage.equals("Regular")) {
				 setTotalAmount(500*numberOfMembers);
				 return "Booking successful";
			 }
			 else  if(tripPackage.equals("Premium")) {
				 setTotalAmount(800*numberOfMembers);
				 return "Booking successful";
			 }
			 else throw new  InvalidTripPackageException("Invaild package");
			 }
		 catch(InvalidTripPackageException|InvalidDestinationException|InvalidCouponCodeException e) {
			 return e.getMessage();
		 }
	 }
}
	class TesterBus{
	 public static void main(String[] args) {
	BusBooking booking = new BusBooking(101,"Toronto", "Regular");
	String result = booking.booking("BIGBUS", 11);
	if(result.equals("Booking successful"))
	{
	System.out.println(result);
	System.out.println("Total amount for the trip: " + booking.getTotalAmount());
	}
	 else  {
	System.out.println(result);
	System.out.println("Your booking was not successful, please try again!");
	}
	}
	}
