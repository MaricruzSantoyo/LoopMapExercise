import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {				
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);
		
		Scanner userInput = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("Enter a number: ");
			int num = userInput.nextInt();
			numbers.add(num);
		}
		
		
		System.out.println("Here are the numbers you entered: " + numbers);
		
		//Sum
		
		int sum =0;
		for (int i=0; i<numbers.size(); i++) {
			sum += numbers.get(i);
		}
		System.out.println("The sum of the numbers is: " + sum);
		
		//Product
		
		int product =1;
		for (int i=0; i<numbers.size(); i++) {
			product *= numbers.get(i);
		}
		System.out.println("The product of the numbers is: " + product);
		
		//Largest number
			
		Collections.sort(numbers);
		System.out.println("Largest number is: " + Collections.max(numbers));
		
		//Smallest number
		System.out.println("Smallest number is: " + Collections.min(numbers));
		
		

	}

}
