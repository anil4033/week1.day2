package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * convert the string to character array
 * get the characters in reverse order and print every character without white space
 */
		String str = "hello";
		char[] chars = str.toCharArray();
		int len = chars.length;
		
		for (int i = len-1; i>=0; i--) {
			
			System.out.print(chars[i] );
			
		}
	}

}
