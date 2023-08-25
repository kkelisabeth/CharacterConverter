import java.util.Scanner;
public class ReverseInteger {
	
	public static void reverse (int number)
	{
		int count = 1;
		int rem;
		int oldNum = number;
		
		while (number != 1)
		{
			count++;
			number = number / 10;
		}
						
		for (int i = 0; i < count; i++)
		{
			rem = oldNum % 10; 
			System.out.print(rem);
			oldNum = oldNum / 10; 
		}
		
		
	}
	public static char upperCaseToLowerCase(char ch)
	{
		ch += 32; 
		return ch;
	}

	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in); 
		int userNumber; 
		System.out.println("Enter a number that you want to see reversed: "); 
		userNumber = keyboard.nextInt(); 
		reverse(userNumber);

		char ch;
		System.out.println("\nEnter the uppercase letter, that you want to convert to lowercase: ");
		ch = keyboard.next().charAt(0);
		System.out.println("You entered: " + ch + "\nThe lowercase of this letter will be: " + upperCaseToLowerCase(ch)); 		
		}

	}

