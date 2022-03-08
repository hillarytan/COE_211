import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private int num;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
	System.out.println("Input the first number: ");
	num1 = scanCalc.nextInt(); scanCalc.nextLine();
	System.out.println("Input the operator: ");
	operator = scanCalc.nextLine();
	System.out.println("Input the second number: ");
	num2 = scanCalc.nextInt();

	
	int num;
	switch(operator){
	case "+":
		add(num1, num2);
		break;
	case "x":
		multiply(num1, num2);
		break;
	case "-":
		subtract(num1, num2);
		break;
	case "/":
		divide(num1, num2);
	default:
		break;
	}
    }

    public String add(int a, int b) {
        num1 = a;
	num2 = b;
	num = num1+num2;
	return num1 + "+" + num2 + "=" + num;
    }

    public String subtract(int a, int b) {
        num1 = a;
	num2 = b;
	num = num1-num2;
	return num1 + "-" + num2 + "=" + num;

    }

    public String multiply(int a, int b) {
        num1 = a;
	num2 = b;
	num = num1*num2;
	return num1 + "x" + num2 + "=" + num;
    }

    public String divide(int a, int b) {
        num1 = a;
	num2 = b;
	num = num1/num2;
	return num1 + "/" + num2 + "=" + num;
    }

	public String toString(){
		return num1 + operator + num2 + "=" + num;
	}
}