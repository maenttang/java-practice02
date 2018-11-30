package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("금액:");
		int won = scanner.nextInt(); // 67879
		scanner.close();
		int unit = 50000;
		int mok = 0;
		int na = 0;
		// boolean a = true;

		while (true) {
			
			if (won / unit > 0) { //67879/50000
				mok = won / unit; // 몫 : 1
				na = won % unit; // 나머지 : 17879
				System.out.println(unit + "원" + mok + "개");
				won=na;
				unit = unit / 5; // 10000
				
				if (won / unit > 0) { //17879/10000 =>
					mok = won / unit; // 몫 : 1
					na = won % unit; // 나머지 : 7879
					System.out.println(unit + "원" + mok + "개");
					won = na;
					unit = unit / 2; // 5000					
				}
				
			}else if(won < unit) { // 37879/50000
				unit = unit / 5;  // 10000				
				mok = won / unit; // 몫 : 3
				na = won % unit; // 나머지 : 17879
				System.out.println(unit + "원" + mok + "개");
				won=na;
				unit = unit / 2; 
				
				if(won / unit == 0) { // 3787/50000
					unit = unit / 5;  // 10000				
					mok = won / unit; // 몫 : 3
					na = won % unit; // 나머지 : 17879
					System.out.println(unit + "원" + mok + "개");
					won=na;
					unit = unit / 2; 
				}
			}
		}
	}
}

//Scanner scanner = new Scanner(System.in);
//
//System.out.print("금액:");
//String number = scanner.nextLine();
//
//if(number.length() > 0) {
//	int n = (int)number.length();
//	System.out.println(n);
//	
//	int inputNum = Integer.parseInt(number); //문자열을 숫자로
//	System.out.println(inputNum);
//	
//	int val = 0;
//	int a = inputNum / n;
//	int aa = val * inputNum + number.length();
//	//
//
//	System.out.println(""+a+"개");
//	System.out.println(""+aa+"개");
//	//
//	//if()
//}

//for(int i=0; i < number.length(); i++) {
//	char[] c = number.toCharArray();
//	System.out.println(c[i]);
//	
//	int[] arr = c[i];
//}
