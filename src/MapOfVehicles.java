import java.util.HashMap;
import java.util.Scanner;

public class MapOfVehicles {

	public static void main(String[] args) {
		
		//Hash map with the model as key and make as value:
		
		HashMap<String, String> vehicle = new HashMap<>();
		vehicle.put("Civic", "Honda");
		vehicle.put("Forester", "Subaru");
		vehicle.put("Camry", "Toyota");
		vehicle.put("Cybertruck", "Tesla");
		vehicle.put("Mustang", "Ford");
		vehicle.put("Soul", "Kia");
		
		//Asking the customer what they're looking for:
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hi!");
		System.out.println("What car model are you looking for?");
		String modelInput = userInput.nextLine();
		String carMake = vehicle.get(modelInput);
		
		
		if(vehicle.containsKey(modelInput)==true) {
			System.out.println("Oh you're looking for a " + modelInput + "?"  + " Our " + carMake + " section is right over here" );
		} else {
			System.out.println("Sorry, we don't currently have " + modelInput + "s");
		}
		
		
	}

}
