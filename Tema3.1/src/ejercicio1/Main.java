package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		double num3, num4;
		
		System.out.println("Dime 4 números:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		
		System.out.println((Suma.suma(num1, num2)) + " " + (Suma.suma(num3, num4)));
		
		sc.close();
		

	}

}
