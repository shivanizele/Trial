package javabtech;

import java.util.Scanner;
//java program to check wheather the number is palindrome or not
public class Palindrome {

	public static void main(String[] args) {
		int r, sum = 0, temp, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number you want to check : ");
		n = sc.nextInt();
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("The given number is a palindrome number.");

		} else {
			System.out.println("The given number is not palindrome number.");
		}
	}

}
