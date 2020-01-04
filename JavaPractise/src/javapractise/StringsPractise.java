package javapractise;

public class StringsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to tell the string is palindrome or not
		
		String str = "tes";
		String temp ="";
		for(int i=str.length()-1; i>=0;i--) {
			temp =temp+str.charAt(i);
		}
		System.out.println(temp);
		if(str.equals(temp)) {
			System.out.println("String is palindorm");
		}else {
			System.out.println("String is not palindrome");
		}
		

	}

}
