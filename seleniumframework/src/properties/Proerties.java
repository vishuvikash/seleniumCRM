package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Proerties {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\Vikash\\workspace1\\seleniumframework\\src\\properties\\Proerties.java");
		Properties prop = new Properties();
		prop.load(file);
		System.out.println(prop.getProperty("username"));

	}

}
