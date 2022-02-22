public class Employee{

	private String first, last;
	private int age;
	private double salary;

	public Employee(String first, String last, int age, double salary){
		this.first = first;
		this.last = last;
		this.age = age;
		this.salary = salary;
	}

	public void setFirst(String first){
		this.first = first;
	}

	public void setLast(String last){
		this.last = last;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public String toString(){
		String output = first + " " + last + ", " + age + ", " + salary;
		return output;
	}
		

}
		



		