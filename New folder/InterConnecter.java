package exception_example;

public class InterConnecter {
    static void connect(String input) {
    	
    	if(input == "no") {
    		throw new RuntimeException("Input is no hence exception throwing");
    	}
    }
}