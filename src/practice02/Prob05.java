package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {

		Random r = new Random();
		int ran = (int) r.nextInt(100) + 1;

		Scanner scan = new Scanner(System.in);

		while (true) {
			int num = scan.nextInt();
			if (num < ran) {
				System.out.println("더 높게");
			} else if (num > ran) {
				System.out.println("더 낮게");
			} else if (num == ran) {
				System.out.println("맞았습니다.");
				System.out.println("다시 하시겠습니까(y/n)");
				
				String answer = scan.next();
				
				if (answer.equals("y")) {
					ran = (int) r.nextInt(100) + 1;
				} else {
					break;
				}
				//break;////
			}

		}
		scan.close();

	}

}
