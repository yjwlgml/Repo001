package package001;

import java.util.Scanner;

public class class001 {
	static String a = "pass";
	static String b = "fail";
	static int numA;
	static int numB;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		numA = sc.nextInt();
		numB = sc.nextInt();
		result = numA + numB;
		if (result >= 4) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
