package week02;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, r;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수): ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		while( y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("최대 공약수는 " + x);

	}

}
