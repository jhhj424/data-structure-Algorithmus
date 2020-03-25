package demo;

import java.util.Scanner;

public class demo_1 {
	public static void main(String[] args) {
		int a = 0;
		System.out.println("숫자를입력하세요");
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextInt()) {
			System.out.println(a==0?"숫자모름? 숫자를입력하세요":"븅신같은년 숫자입력하라고..ㄱㄱ");
			a = 1;
			scan = new Scanner(System.in);
		}
		a = scan.nextInt();
		for(int i = 1; i<=a; i++) {
			for(int j = i; j<a; j++) {
				System.out.print(" ");
			}
			for(int j = i; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}