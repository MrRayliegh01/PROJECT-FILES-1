import java.util.Scanner;	

public class Flow {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Student ID:");
		String studentID = scanner.nextLine();
		
		if (studentID.equals("Enciso")) {
			int mondayscore, tuesdayScore, wednesdayScore, thursdayScore, fridayScore;
			
			System.out.println("Enter your Quiz #1: ");
			mondayscore = scanner.nextInt();
			
			System.out.println("Enter your Quiz #2: ");
			tuesdayScore = scanner.nextInt();
			
			System.out.println("Enter your Quiz #3: ");
			wednesdayScore = scanner.nextInt();
			
			System.out.println("Enter your Quiz #4: ");
			thursdayScore = scanner.nextInt();
			
			System.out.println("Enter your Quiz #5: ");
			fridayScore = scanner.nextInt();
			
			
			int evening = mondayscore+tuesdayScore+wednesdayScore+thursdayScore+fridayScore;
			System.out.println("Total quiz scores: "+evening);	
		} 
		else {
			System.out.println("The Student is not enrollend in this subject.");
			
		}
		scanner.close();
	}

}
