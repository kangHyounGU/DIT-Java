package week01;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.println("반지름을 입력하시오 : ");
		radius = input.nextDouble();
		area = Math.PI * radius * radius;
		
		System.out.printf("%.1f",area);
		
		
		
		

	}

}
