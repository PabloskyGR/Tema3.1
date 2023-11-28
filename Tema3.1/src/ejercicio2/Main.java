package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Dime 3 números:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.println(Media.media(num1, num2) + " " + Media.media(num1, num2, num3));
		
		sc.close();

	}

}
