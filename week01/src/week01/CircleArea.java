package week01;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.println("�������� �Է��Ͻÿ� : ");
		radius = input.nextDouble();
		area = Math.PI * radius * radius;
		
		System.out.printf("%.1f",area);
		
		
		
		

	}

}
