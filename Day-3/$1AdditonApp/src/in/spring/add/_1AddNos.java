package in.spring.add;

import java.util.Scanner;

public class _1AddNos {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = kb.nextInt();
		System.out.println("Enter second number");
		int b = kb.nextInt();
		int c = a + b;
		System.out.println("Their sum is " + c);
		kb.close();
	}

}
