import java.util.Scanner;

public class EntryPoint {
	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		
		
	String answer = "y";	
	while (answer.equals("y")){
		int number = 1;

		while (1<=number && number<=4){	
			System.out.println("\nWhich service would you like to use?" +
				"\n[1]: Basic week visualizer" +
				"\n[2]: Advanced week visualizer" +
				"\n[3]: Basic calculator" + 
				"\n[4]: Employee repertoire\n");

			number = scan.nextInt(); scan.nextLine();
		
			switch(number) {
			case 1:
				BasicWeek bw = new BasicWeek();
				bw.printDays();
				number = 0;
				break;
			case 2:
				AdvancedWeek aw = new AdvancedWeek();
				aw.printDays();
				number = 0;
				break;
			case 3:
				Calculator calc = new Calculator();
				number = 0;
				break;
			case 4:
				Employee emp = new Employee();
				System.out.println(emp);
				number = 0;
				break;
			default:
				System.out.println("Please make sure you pick a number between 1 and 4");
				number = 1;
				break;
			}
		}
		
		

		do{
			System.out.println("\nWould you like to perform another operation? (y/n)");
			answer = scan.nextLine(); 
		
			if(answer.equals("n") || answer.equals("y")) 
				break;
		} while(true);
			
			
	}
		
			
		
    }
}

	