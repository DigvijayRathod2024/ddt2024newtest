package datadriventesting2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3RealTest2023 {

	static String username;
	static String password;

	@Test
	public void test10() throws IOException {

		FileInputStream file = new FileInputStream("D:\\eclipse wrkbnch\\ddt2023Test1.xlsx");

		XSSFWorkbook wrkbook = new XSSFWorkbook(file);

		XSSFSheet sheet = wrkbook.getSheet("Test10");

		int noofrows = sheet.getLastRowNum();

		for (int row = 0; row <= noofrows; row++) {
			
			XSSFRow currentrow = sheet.getRow(row);

			username = currentrow.getCell(0).getStringCellValue();

			password = currentrow.getCell(1).getStringCellValue();

			//System.out.println(" username is " + username);

			//System.out.println(" password is " + password);

		
			
			System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

			ChromeDriver dd = new ChromeDriver();

			dd.get("https://www.saucedemo.com/");

			dd.findElement(By.id("user-name")).sendKeys(username);

			dd.findElement(By.id("password")).sendKeys(password);

			dd.findElement(By.id("login-button")).click();

			dd.close();

		}

	}

}
