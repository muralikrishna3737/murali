package web_driver;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Online_Sbi_appl
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://retail.onlinesbi.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.partialLinkText("Apply SB"));
		Actions ac=new Actions(driver);
		ac.moveToElement(we).perform();
		WebElement we1=driver.findElement(By.partialLinkText("for Resid"));
		Actions ac1=new Actions(driver);
		ac1.moveToElement(we1).perform();
		driver.findElement(By.partialLinkText("Regular SB")).click();
		driver.findElement(By.xpath("//*[@id='btnApply']/a/img")).click();
		driver.findElement(By.xpath("//*[@id='onlineAccountOpeningLanding']/div/div/div/div/div[1]/p[1]/a")).click();
        driver.findElement(By.id("ctype")).click();
        driver.findElement(By.id("rstatus")).click();
        Select s=new Select(driver.findElement(By.id("salutation")));
        s.selectByIndex(0);
        driver.findElement(By.id("firstName")).sendKeys("bobby");
        driver.findElement(By.id("last")).sendKeys("j");
        //driver.findElement(By.className("ui-datepicker-trigger")).click();
        driver.findElement(By.xpath("(//*[contains(@class,'ui-date')])[1]")).click();
        Select s1=new Select(driver.findElement(By.className("ui-datepicker-month")));
        s1.selectByVisibleText("Sep");
        Select s2=new Select(driver.findElement(By.className("ui-datepicker-year")));
        s2.selectByVisibleText("1990");
        driver.findElement(By.xpath("//*[text()='7']")).click();
        Select s3=new Select(driver.findElement(By.id("gender")));
        s3.selectByVisibleText("Male");
        driver.findElement(By.id("countryname")).sendKeys("INDIA");
        Select s4=new Select(driver.findElement(By.id("maritalStatus")));
        s4.selectByVisibleText("Single");
        driver.findElement(By.id("mothername")).sendKeys("");
        Select s5=new Select(driver.findElement(By.id("fathersalutation")));
        s5.selectByIndex(0);
        driver.findElement(By.id("fatherfirstName")).sendKeys("");
        driver.findElement(By.id("fathermiddle")).sendKeys("");
        driver.findElement(By.id("fatherlast")).sendKeys("");
        driver.findElement(By.id("cityofbirth")).sendKeys("VIJAYAWADA");
        driver.findElement(By.id("countryofbirth")).sendKeys("INDIA");
        driver.findElement(By.id("uidnumber")).sendKeys("");
        Select s6=new Select(driver.findElement(By.id("addresstype")));
        s6.selectByIndex(2);
        driver.findElement(By.id("caddress1")).sendKeys("");
        driver.findElement(By.id("caddress2")).sendKeys("");
        driver.findElement(By.id("caddress3")).sendKeys("A S NAGAR");
        driver.findElement(By.id("cdistrict")).sendKeys("KRISHNA");
        Select s7=new Select(driver.findElement(By.id("cstate")));
        s7.selectByIndex(2);
        driver.findElement(By.id("cpin")).sendKeys("520015");
        Select s8=new Select(driver.findElement(By.id("ccity")));
        s8.selectByVisibleText("VIJAYAWADA");
        driver.findElement(By.id("cmobilenum")).sendKeys("9603141400");
        driver.findElement(By.id("cmobilenum1")).sendKeys("9603141400");
        driver.findElement(By.id("officeemail")).sendKeys("@gmail.com");
        driver.findElement(By.id("countryname1")).sendKeys("INDIA");
        Select s9=new Select(driver.findElement(By.id("simillarContact")));
        s9.selectByVisibleText("YES");
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER CAPTCHA");
        String code=scan.nextLine();
        driver.findElement(By.id("captcha")).sendKeys(code);
        driver.findElement(By.className("next_but")).click();        
        Alert a=driver.switchTo().alert();
        a.accept();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='top']/div[2]/input")).click();
        Thread.sleep(3000);
        Select s10=new Select(driver.findElement(By.xpath("//*[@id='religion']")));
        s10.selectByVisibleText("Hindu");
        Select s11=new Select(driver.findElement(By.id("education")));
        s11.selectByVisibleText("Graduate");
        Select s12=new Select(driver.findElement(By.id("category")));
        s12.selectByVisibleText("General");
        Select s13=new Select(driver.findElement(By.id("occupationType")));
        s13.selectByVisibleText("Others");
        Select s14=new Select(driver.findElement(By.id("occupationTypeOthersVal1")));
        s14.selectByVisibleText("Student");
        Select s15=new Select(driver.findElement(By.id("income")));
        s15.selectByVisibleText("Upto INR 20,000");
        driver.findElement(By.id("assets")).sendKeys("15000");
        Select s16=new Select(driver.findElement(By.id("relatedpersontype")));
        s16.selectByVisibleText("Nominee");
        Select s17=new Select(driver.findElement(By.id("salutation1")));
        s17.selectByVisibleText("Mrs.");
        driver.findElement(By.id("firstName1")).sendKeys("");
        driver.findElement(By.id("last1")).sendKeys("");
        driver.findElement(By.xpath("(//*[@id='passport1'])[4]")).click();
        driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[4]")).click();
        Select s18=new Select(driver.findElement(By.className("ui-datepicker-month")));
        s18.selectByVisibleText("Sep");
        Select s19=new Select(driver.findElement(By.className("ui-datepicker-year")));
        s19.selectByVisibleText("2014");
        driver.findElement(By.xpath("//*[text()='7']")).click();
        driver.findElement(By.id("pannumber")).sendKeys("");
        driver.findElement(By.id("documentno1")).sendKeys("");
        driver.findElement(By.id("issuedby1")).sendKeys("GOI");
        driver.findElement(By.id("issueat1")).sendKeys("VIJAYAWADA");
        driver.findElement(By.xpath("(//input[@class='saveproceed-product'])[2]")).click();
       // driver.findElement(By.xpath("//*[@id='passportIDType']")).click();
        Select s20=new Select(driver.findElement(By.xpath("//*[@id='passportIDType']")));
        s20.selectByVisibleText("Adhar Card(UID) with same address");
        driver.findElement(By.id("passportNumber")).sendKeys("123456789101");
        driver.findElement(By.id("passportissueat")).sendKeys("VIJAYAWADA");
        driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[5]")).click();
        Select s21=new Select(driver.findElement(By.className("ui-datepicker-month")));
        s21.selectByVisibleText("Sep");
        Select s22=new Select(driver.findElement(By.className("ui-datepicker-year")));
        s22.selectByVisibleText("2014");
        driver.findElement(By.xpath("//*[text()='7']")).click();
        driver.findElement(By.id("branchName1")).sendKeys("VIJAYAWADA");
        driver.findElement(By.id("accType1")).sendKeys("saving a/c");
        driver.findElement(By.id("accNumber1")).sendKeys("12345678910");
        driver.findElement(By.xpath("//*[@id='identificationDetailsSaveProceed']/input")).click();
        driver.findElement(By.xpath("(//*[@id='addAnotherApplicant'])[2]")).click();
        driver.findElement(By.xpath("//*[@id='identificationDetailsProceed']/a")).click();
        Thread.sleep(3000);
        //driver.findElement(By.).click();
        Select s23=new Select(driver.findElement(By.xpath("//*[@id='typeofsavingaccount']")));
        s23.selectByVisibleText("With Debit Card and without Cheque Book");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER applicant no:");
        String cod=sc.nextLine();
        driver.findElement(By.xpath("//*[@id='primary_tcrn']")).sendKeys(cod);
        driver.findElement(By.xpath("//*[@id='oao_italic']")).click();
        
        ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		driver.switchTo().window(lst.get(0));
		driver.findElement(By.xpath("//*[@id='branchCode']")).sendKeys("09001");
        driver.findElement(By.xpath("//*[@id='first']/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/input[2]")).click();
        /*Alert a2=driver.switchTo().alert();
		a2.accept();
        */
        driver.findElement(By.xpath("//*[@id='domesticAtmFlag']")).click();
        driver.findElement(By.xpath("//*[@id='accountTypeServiceRequestProceed']/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='firstPageRefNoDisplay']/div[2]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='proceedbut']/table/tbody/tr/td[2]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='save_proceed1']/div[2]/a")).click();
        Alert a1=driver.switchTo().alert();
        a1.accept();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
