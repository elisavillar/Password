import java.util.Random;

public class Password {
	private int length = 8;
	private String password;
	
	//A default constructor.
	Password (){
		this.password = this.generate(length);
	}
	
	//A constructor with the length that we send as parameter.
	Password (int length){
		this.password = this.generate(length);
	}
	
	//Setters and getters
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/* isStrong (): return a boolean if it is strong or not, to be strong you must have more than 2 upper case, 
	 more than 1 lower case and more than 5 numbers.*/
	
	public Boolean isStrong(String password) {
		int upper = 0, lower = 0, num = 0;
		
		for (int n = 0; n < password.length (); n++) { 
			char c = password.charAt (n); 
			upper = (Character.isUpperCase(c)) ? (upper + 1) : upper;
			lower = (Character.isLowerCase(c)) ? (lower + 1) : lower;
			num = (Character.isDigit(c)) ? (num + 1) : num;
		}
		
		if ((upper > 2) && (lower > 1) && (num > 5)) {
			return true;
		} else {
			return false;
		}
	}
	
	/* GeneratePassword (): Generates the password of the object with the defined length. 
	 * Get method for password and length. Set method for length. 
	 */
	public String generate(int length){
		Random aleatory = new Random();
       
		 final char[] characters =
                {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
                        'Q','R','S','T','U','V','W','X', 'Y','Z',
                        'a','b','c','d','e','f','g','e','h','i','j','l','k','m',
                        'n','o','p','r','s','t','u','v','w','x','y','z',
                        '1','2','3','4','5','6','7','8','9','0',
                        '@','#','!','$','€','&','[',']'};
        
		 this.password = "";

		 for(int i = 0; i < length ; i++){
           
			 password += characters[aleatory.nextInt(characters.length)];
		 }

		 return password;
    }

}
