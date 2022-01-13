package ua.lviv.lgs.exceptionTask2;

import java.util.Scanner;

public class Application {
public static void main(String[] args) throws MyException {

	Scanner sc = new Scanner(System.in);

	int a;
	int b;

	System.out.println("Enter a:");

	if (sc.hasNextInt()) {
		a = sc.nextInt();

		System.out.println("Enter b:");

		if (sc.hasNextInt()) {
			b = sc.nextInt();

			Methods calc = new Methods(a, b);

			Methods.Result(calc.plus());
			Methods.Result(calc.minus());
			Methods.Result(calc.multiply());
			Methods.Result(calc.divide());
		}

		

	else
		System.out.println("Error");

	}}
}
