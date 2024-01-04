package exception_example;

public class Main {

	public static void main(String[] args) {
		  
		try {
			InterConnecter.connect("no");
			
		}
		catch(RuntimeException exception) {
			System.out.println("exception -----"+exception.getMessage());
			
		}
System.out.println("Connected");
	}

}