package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cognizant";
		char ch = 'g';
		char[] chars = str.toCharArray();
		//if we want to count with case sensitive
		//char[] chars = str.toLowerCase().toCharArray()
			
		int len= str.length();
		int count = 0;
		
		for (int i = 0; i < chars.length-1; i++) {
			
			if(ch == chars[i]) {
				count++;
				
			}
			
		}
		
		System.out.print(count);	
	}

}
