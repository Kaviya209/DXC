package dxc;

public class moveCharacter {
	public static String moveSpecialChar(String str){
		int len=str.length();
		String spchar="[a-zA-Z0-9\\s++]";
		String r1="",r2="";
		for(int i=0;i<len;i++) {
			char c=str.charAt(i);
			
			if(String.valueOf(c).matches(spchar)) {
				r1=r1+c;
			}
			else {
				r2=r2+c;
			}
		}
		return r1+r2; 
	}

	public static void main(String[] args) {
		String str = "He@#$llo!*&";
		System.out.println(moveSpecialChar(str));
	}
}


