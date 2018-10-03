/*  SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10:   10 | Declared three constants in place of numbers, making it clear what each one represented.
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5:  4 | It is clear what each constant represents, providing one knows what the program does.
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5:  5 | Formatted correctly, uppercase with underscores.
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:  10  | It is clear what each variable represents, providing one knows what the program does.
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10:  10 | Variable names are formatted as the coding standard specifies.
   6. Did I indent the code appropriately?
       Mark out of 10:  9 | Code is indented as the IDE instructed.
   7. Did I read the input correctly from the user using (an) appropriate question(s)?
       Mark out of 10:  6 | Used imperatives, not questions, yet these are clear and easily understood.
   8. Did I compute the answer correctly for all cases?
       Mark out of 20:  15 | Error catching is used so that the program continues to run if the user enters a letter. The program closes
		if the user enters a negative integer.  
   9. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10:  10 | The answer is output as in the example.
   10. How well did I complete this self-assessment?
       Mark out of 10:  5 | Unsure of what score to give for certain headings.
   Total Mark out of 100 (Add all the previous marks): 84
*/

import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstAssignment {
	
	public static final int OLD_PENCE_IN_NEW_PENCE = 67;
	public static final int SHILLINGS_IN_NEW_PENCE = 804;
	public static final int OLD_POUNDS_IN_NEW_PENCE = 16080;

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int numberOfOldPounds;
		int numberOfShillings;
		int numberOfOldPennies;
		
		while(true){
			try{
				out.print("Enter the number of old pounds: ");
				numberOfOldPounds = userInput.nextInt();
				
				out.print("Enter the number of shillings: ");
				numberOfShillings = userInput.nextInt();
				
				out.print("Enter the number of old pennies: ");
				numberOfOldPennies = userInput.nextInt();
				
				break;
				
		} catch (InputMismatchException e){
			
			out.println("Wrong; Enter numbers!");
			userInput.next();
			
			}
			
		}
		
		
		if (numberOfShillings < 0 || numberOfOldPennies < 0 || numberOfOldPounds < 0){
			
			out.println("Wrong; Enter neutral or positive numbers!");
			System.exit(0) ; 
	
		}
		
		
		userInput.close();
		
		int answerInNewPence = OLD_PENCE_IN_NEW_PENCE *(numberOfOldPennies) + SHILLINGS_IN_NEW_PENCE *(numberOfShillings)
				+ OLD_POUNDS_IN_NEW_PENCE *(numberOfOldPounds); 
		
		double answerInNewPounds = (double)answerInNewPence / 100;
		
		out.printf (numberOfOldPounds + " old pound(s), " + numberOfShillings + " shilling(s) and " + numberOfOldPennies
				+ " old penny/pence = £%.2f", answerInNewPounds);
		
		
		
	}

}
