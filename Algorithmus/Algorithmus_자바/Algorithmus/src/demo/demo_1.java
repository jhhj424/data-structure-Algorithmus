package demo;

import java.util.Scanner;

public class demo_1 {
	public static void main(String[] args) {
		int a = 0;
		System.out.println("���ڸ��Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextInt()) {
			System.out.println(a==0?"���ڸ�? ���ڸ��Է��ϼ���":"��Ű����� �����Է��϶��..����");
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