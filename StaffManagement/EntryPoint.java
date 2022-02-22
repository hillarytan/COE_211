import java.util.Scanner;

public class EntryPoint{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		Employee emp = new Employee("", "", 0, 0.0);

		int random = (int)(Math.random()*10)+1;

		System.out.println("You have " + random + " insertions left.");

		int[] intArray = new int[random];
		

		for (int i=0; i<intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}


		System.out.println("Please input the employee's first name: ");
		String first = scan.nextLine();
		System.out.println("Please input the employee's last name: ");
		String last = scan.nextLine();
		System.out.println("Please input the employee's age: ");
		int age = scan.nextInt();
		System.out.println("Please input the employee's monthly salary: ");
		double salary = scan.nextDouble();

		emp.setFirst(first);
		emp.setLast(last);
		emp.setAge(age);
		emp.setSalary(salary);

		System.out.println("Employee information: " + emp);

	}
}