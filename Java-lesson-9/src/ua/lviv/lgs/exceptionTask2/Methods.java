package ua.lviv.lgs.exceptionTask2;

public class Methods {
private static int a;
private static int b;
public Methods(int a1, int b1) {
	a = a1;
	b = b1;
}
public int plus() throws MyException {
	Methods.check();
	return a + b;
}
public int minus() throws MyException {
	Methods.check();
	return a - b;
}
public int multiply() throws MyException {
	Methods.check();
	return a * b;
}
public int divide() throws MyException {
	Methods.check();
	return a / b;
}
static void check() throws MyException {
	if ((a < 0) && (b < 0)) {
		throw new IllegalArgumentException();
	}
	if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
		throw new ArithmeticException();
	}
	if ((a == 0) && (b == 0)) {
		throw new IllegalArgumentException();
	}
	if ((a > 0) && (b > 0)) {
		throw new MyException("Calculator is broken!");
	}
}
static void Result(double result) {
	System.out.println(result);
}
}
