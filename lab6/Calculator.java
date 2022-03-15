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

    public void add(int a, int b) {
        num1 = a;
	num2 = b;
	num = num1+num2;
	System.out.println(num1 + "+" + num2 + "=" + num);
    }

    public void subtract(int a, int b) {
        num1 = a;
	num2 = b;
	num = num1-num2;
	System.out.println(num1 + "-" + num2 + "=" + num);

    }

    public void multiply(int a, int b) {
        num1 = a;
	num2 = b;
	num = num1*num2;
	System.out.println(num1 + "x" + num2 + "=" + num);
    }

    public void divide(int a, int b) {
        num1 = a;
	num2 = b;
	double num0 = num1/(double)num2;
	System.out.println(num1 + "/" + num2 + "=" + num0);
    }

	/*public String toString(){
		return num1 + operator + num2 + "=" + num;
	}*/
}