package com.bridgelabz.Logical_Programs;

import java.util.Scanner;

public class PrimeNumber {
	private static void checkPrime(int number) {
		int i, m = 0, num = number, flag = 0;
		m = num / 2;
		if (num == 0 || num == 1)
			System.out.println(num + " is not a prime number");
		else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is a not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println(num + " is a prime number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to check if it is prime or not:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		checkPrime(number);
	}

}
