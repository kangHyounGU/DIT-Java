package week02;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ �Է½ÿ� : ");
		int n = scan.nextInt();
		
		System.out.println(n + "�� ����� ������ �����ϴ�. ");
		for(int i = 1; i < n; i++) {
			if(n % i == 0)
				System.out.print(" "+i);
		}

	}

}
