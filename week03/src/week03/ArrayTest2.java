package week03;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENTS = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print("������ �Է����ּ��� : ");
			scores[i] = scan.nextInt();
		}
		
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		
		System.out.println("��� ������ : "+ total / STUDENTS + "�Դϴ�.");
		

	}

}
