package org.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void browser(String browser) {
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

	}

	public static void closebroweser() {
		driver.close();
	}

	public static void geteUrl(String url) {
		driver.get(url);
	}

	public static void maxWindows() {
		driver.manage().window().maximize();
	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println("Title" + title);
	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl" + currentUrl);

	}

	public static void sendValu(WebElement ve, String value) {
		ve.sendKeys(value);

	}

	public static void getDateAndTime() {
		Date d = new Date();
	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static void takeSnap(String screenshot) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File file = tk.getScreenshotAs(OutputType.FILE);
File f = new File("C:\\Users\\lovely lovers M.A\\Desktop\\eclipse oxgen\\CocumbarTesting\\Screenshot\\Screenshot.pgn");
		FileUtils.copyFile(file, f);
		 
	}
	public static void readFromExcel() throws IOException {
File f = new File("C:\\Users\\lovely lovers M.A\\Desktop\\eclipse oxgen\\CocumbarTesting\\datastore\\datadocumant.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sh = book.getSheet("sheet");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
