package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestCases {

	public static void main(String[] args) throws FileNotFoundException {

		Properties Config = new Properties();

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//PropertiesAll//config.properties");
	    try {
			Config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(Config.getProperty("browser"));
	}

}

