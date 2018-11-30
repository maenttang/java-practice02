package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] arrayReverse1 = reverse("Hello World");
		printCharArray(arrayReverse1);
		
		char[] arrayReverse2 = reverse("Java Programming!");
		printCharArray(arrayReverse2);
	}

	public static char[] reverse(String str) {
		char[] chars = new char[str.length()];
		
		for(int i=0; i < str.length(); i++) {
			chars[i] = str.charAt(str.length()-i-1);
			//System.out.print(chars[i]);
			
		}
		//System.out.println();////
		return chars;
		
		
	}
		
//		char[] chars = new char[str.length()]; // chars배열생성
//		int strLengths = str.length(); // 배열길이
//		
//		for(int i=0; i<strLengths; i++) { 
//			
//			chars[i] = str.charAt(i);
//			System.out.print(chars[i]);
//		}
//		
//		for(int i=0; i<strLengths/2; i++) {
//			char temp = chars[i];
//			chars[i] = chars[strLengths-i-1];
//			chars[strLengths-i-1] = temp;
//		
//		}		
//		return chars;
	
	
	public static void printCharArray(char[] array) {
		for(int i = 0; i < array.length; i++) {
			//출력
			System.out.print(array[i]);
		}
		System.out.println("");
	}
}
