package dxc;

public class RemoveSpace{

	public static void main(String[] args) {
		 String str = "Hello  How Are You";
		 System.out.println("original sentance : "+str);
		 //(//s) that finds all the white space character
		 str=str.replaceAll("\\s", "");
		 System.out.println("after replacement : "+str);
		 
		 

	}

}
