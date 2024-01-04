package exception_example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {

	public static void readFile(){
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("example.txt")
			);
	
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}