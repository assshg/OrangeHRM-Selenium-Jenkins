package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest {

    @Test
    public void orangeHRMTestSuite() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {

            // TC01 - Login
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

             Thread.sleep(10000);

            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            Thread.sleep(5000);

            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
            System.out.println("TC01 Login : PASS");
            Thread.sleep(10000);

            // TC02 - PIM
            driver.findElement(By.xpath("//span[text()='PIM']")).click();
             Thread.sleep(10000);

            Assert.assertTrue(driver.getCurrentUrl().contains("pim"));
            System.out.println("TC02 PIM Module : PASS");

            // TC03 - Leave
            driver.findElement(By.xpath("//span[text()='Leave']")).click();
            Thread.sleep(10000);

            Assert.assertTrue(driver.getCurrentUrl().contains("leave"));
            System.out.println("TC03 Leave Module : PASS");

            // TC04 - Time
            driver.findElement(By.xpath("//span[text()='Time']")).click();
            Thread.sleep(10000);

            Assert.assertTrue(driver.getCurrentUrl().contains("time"));
            System.out.println("TC04 Time Module : PASS");

            // TC05 - My Info
            driver.findElement(By.xpath("//span[text()='My Info']")).click();
            Thread.sleep(10000);

            Assert.assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"));
            System.out.println("TC05 My Info Module : PASS");

            // TC06 - Recruitment
            driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
            Thread.sleep(10000);

            Assert.assertTrue(driver.getCurrentUrl().contains("recruitment"));
            System.out.println("TC06 Recruitment Module : PASS");

            // TC07 - Directory
            driver.findElement(By.xpath("//span[text()='Directory']")).click();
            Thread.sleep(10000);

            Assert.assertTrue(driver.getCurrentUrl().contains("directory"));
            System.out.println("TC07 Directory Module : PASS");

            // TC09 - Buzz
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a")).click();
            Thread.sleep(10000);
            Assert.assertTrue(driver.getCurrentUrl().contains("buzz"));
            System.out.println("TC09 Buzz Module : PASS");

            // TC10 - Dashboard
            driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
            Thread.sleep(10000);
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
            System.out.println("TC10 Dashboard Module : PASS");

            // TC11 - User Menu
            driver.findElement(By.className("oxd-userdropdown-tab")).click();
            Thread.sleep(10000);
            Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
            System.out.println("TC11 User Menu : PASS");

            // TC12 - Logout
            driver.findElement(By.linkText("Logout")).click();
            Thread.sleep(10000);
            Assert.assertTrue(driver.getCurrentUrl().contains("login"));
            System.out.println("TC12 Logout : PASS");

            System.out.println("\n===== ALL 12 TEST CASES PASSED =====");

        } finally {
            driver.quit();
        }
    }
}