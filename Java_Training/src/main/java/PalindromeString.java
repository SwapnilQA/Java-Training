import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		boolean isPalindrome = stringPalindrome(str, stringReverse(str));
		System.out.println("String is palindrome "+ isPalindrome);
	}

	/**
	 * This method will reverse the string
	 * @param str
	 * @return
	 */
	public static String stringReverse(String str) {
		StringBuffer tmp = new StringBuffer("");
		
		for(int i=str.length();i>0;i--) {
			
			tmp=tmp.append(str.charAt(i-1));
		}
		
		return tmp.toString();
	}

	/**
	 * This method will check if the String is palindrome
	 * @param str
	 * @param reverseString
	 * @return
	 */
	public static boolean stringPalindrome(String str, String reverseString) {
		
		if(str.equalsIgnoreCase(reverseString)) {
			return true;
		} else {
			return false;
		}		
	}
}
