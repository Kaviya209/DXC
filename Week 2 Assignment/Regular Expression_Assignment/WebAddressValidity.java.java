package Aassignment;

class RTester2 {
	
	 public static boolean checkWebAddressValidity(String webAddress) {
		 String regex="^(http|https)(://)(www.)?[a-zA-Z[0-9]]{2,8}\\.(com|org|net)$";
		 if(webAddress.matches(regex)) {
			 return true;
		 }
	 return false; 
	 }
	 
	 public static void main(String[] args) {
	 String webAddress = "http://www.company.com";
	 System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : 
	"invalid!"));
	 }
	}




