import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		boolean is_palindrome = stringPalindrome(str, stringReverse(str));
		System.out.println("String is palindrome "+ is_palindrome);
	}

	public static String stringReverse(String str) {
		String tmp="";
		
		for(int i=str.length();i>0;i--) {
			
			tmp=tmp+str.charAt(i-1);
		}
		
		return tmp;
	}

	public static boolean stringPalindrome(String str, String reverseString) {
		
		if(str.equalsIgnoreCase(reverseString)) {
			return true;
		} else {
			return false;
		}		
	}
}
