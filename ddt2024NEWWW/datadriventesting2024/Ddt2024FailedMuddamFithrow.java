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

public class Ddt2024FailedMuddamFithrow {

	static String user;
	static String pass;

	
	@Test(description = "Muddam fail kartoy because to check file reading ")
	public void test500() throws IOException {
		
		
		FileInputStream file = new FileInputStream("D:\\eclipse wrkbnch\\ddt2023Test1.xlsx");

		XSSFWorkbook wk = new XSSFWorkbook(file);

		XSSFSheet sheet = wk.getSheet("Sheet2024");

		XSSFRow row = sheet.getRow(4);

		
		
		user = row.getCell(0).getStringCellValue();

		pass = row.getCell(1).getStringCellValue();

		
		
		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();

		
		
		dd.get("https://www.saucedemo.com/v1/");

		dd.findElement(By.id("user-name")).sendKeys(user);

		dd.findElement(By.id("password")).sendKeys(pass);

		dd.findElement(By.id("login-button")).click();

		

	}

}
