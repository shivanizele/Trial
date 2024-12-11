package javabtech;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("a is great");
		} else if (a == b) {
			System.out.println("equal");
		} else {
			System.out.println("a is small");
		}

	}

}
