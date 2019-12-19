import java.util.Scanner;

/*
Create an array of Passwords with the size that you indicate by keyboard. 
Create a loop that creates an object for each position in the array. 
It also indicates by keyboard the length of the Passwords (before loop). 
Create another array of booleans where we store if the password of the password array is strong or not (use the previous loop). 
At the end, we show the password and whether or not it is strong (use the previous loop). 
Use this simple format: password1 boolean_value1
password2 boolean_value2
*/
public class testPassword {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner (System.in);
				
		System.out.println("Enter the amount of passwords that you are going to enter:");
		int quantity = myObj.nextInt();
		
		Password [] pass = new Password [quantity];
		Boolean [] strong = new Boolean [quantity]; 
		
		System.out.println("Enter the lenght for the password:");
		int length = myObj.nextInt();
		
		System.out.println("PASSWORD\t STRONG");
		
		for (int pos = 0; pos < pass.length; pos ++) {
			pass[pos] = new Password (length);
			strong[pos] = pass[pos].isStrong(pass[pos].getPassword());
			System.out.println(pass[pos].getPassword() + "\t" + strong[pos]);
		}
						
		myObj.close();

	}

}
