package javabtech;
import java.util.Scanner;
public class Switch {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int button=sc.nextInt();
		switch(button) {
		case 1:
			System.out.println("red");
			break;
		case 2:
			System.out.println("yello");
			break;
		case 3:
			System.out.println("green");
			break;
		default:
			System.out.println("na");
		}
		
	}

}
