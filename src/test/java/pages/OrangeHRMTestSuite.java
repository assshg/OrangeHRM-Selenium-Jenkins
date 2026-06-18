package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTestSuite {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // TC01 - Login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000);

        if (driver.getCurrentUrl().contains("dashboard"))
            System.out.println("TC01 Login : PASS");
        else
            System.out.println("TC01 Login : FAIL");

        // TC02 - PIM
        try {
            driver.findElement(By.xpath("//span[text()='PIM']")).click();
            Thread.sleep(3000);

            if (driver.getCurrentUrl().contains("pim"))
                System.out.println("TC02 PIM Module : PASS");
            else
                System.out.println("TC02 PIM Module : FAIL");
        } catch (Exception e) {
            System.out.println("TC02 PIM Module : FAIL");
        }

        // TC03 - Leave
        try {
            driver.findElement(By.xpath("//span[text()='Leave']")).click();
            Thread.sleep(3000);

            if (driver.getCurrentUrl().contains("leave"))
                System.out.println("TC03 Leave Module : PASS");
            else
                System.out.println("TC03 Leave Module : FAIL");
        } catch (Exception e) {
            System.out.println("TC03 Leave Module : FAIL");
        }

        // TC04 - Time
        try {
            driver.findElement(By.xpath("//span[text()='Time']")).click();
            Thread.sleep(3000);

            if (driver.getCurrentUrl().contains("time"))
                System.out.println("TC04 Time Module : PASS");
            else
                System.out.println("TC04 Time Module : FAIL");
        } catch (Exception e) {
            System.out.println("TC04 Time Module : FAIL");
        }

        // TC05 - My Info
        try {
            driver.findElement(By.xpath("//span[text()='My Info']")).click();
            Thread.sleep(5000);

            if (driver.getCurrentUrl().contains("viewPersonalDetails"))
                System.out.println("TC05 My Info Module : PASS");
            else
                System.out.println("TC05 My Info Module : FAIL");
        } catch (Exception e) {
            System.out.println("TC05 My Info Module : FAIL");
        }

        // TC06 - Recruitment
        try {
            driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
            Thread.sleep(3000);

            if (driver.getCurrentUrl().contains("recruitment"))
                System.out.println("TC06 Recruitment Module : PASS");
            else
                System.out.println("TC06 Recruitment Module : FAIL");
        } catch (Exception e) {
            System.out.println("TC06 Recruitment Module : FAIL");
        }

        // TC07 - Directory
        try {
            driver.findElement(By.xpath("//span[text()='Directory']")).click();
            Thread.sleep(3000);

            if (driver.getCurrentUrl().contains("directory"))
                System.out.println("TC07 Directory Module : PASS");
            else
                System.out.println("TC07 Directory Module : FAIL");
        } catch (Exception e) {
            System.out.println("TC07 Directory Module : FAIL");
        }

        // TC08 - Maintenance
        try {
            driver.findElement(By.xpath("//span[text()='Maintenance']")).click();
            Thread.sleep(3000);

            if (driver.getCurrentUrl().contains("maintenance"))
                System.out.println("TC08 Maintenance Module : PASS");
            else
                System.out.println("TC08 Maintenance Module : FAIL");
        } catch (Exception e) {
            System.out.println("TC08 Maintenance Module : FAIL");
        }

        // TC09 - Buzz
        try {
            driver.findElement(By.xpath("//span[text()='Buzz']")).click();
            Thread.sleep(3000);

            if (driver.getCurrentUrl().contains("buzz"))
                System.out.println("TC09 Buzz Module : PASS");
            else
                System.out.println("TC09 Buzz Module : FAIL");
        } catch (Exception e) {
            System.out.println("TC09 Buzz Module : FAIL");
        }

        // TC10 - Dashboard
        try {
            driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
            Thread.sleep(3000);

            if (driver.getCurrentUrl().contains("dashboard"))
                System.out.println("TC10 Dashboard Module : PASS");
            else
                System.out.println("TC10 Dashboard Module : FAIL");
        } catch (Exception e) {
            System.out.println("TC10 Dashboard Module : FAIL");
        }

        // TC11 - Open User Menu
        try {
            driver.findElement(By.className("oxd-userdropdown-tab")).click();
            Thread.sleep(2000);

            if (driver.findElement(By.linkText("Logout")).isDisplayed())
                System.out.println("TC11 User Menu : PASS");
            else
                System.out.println("TC11 User Menu : FAIL");
        } catch (Exception e) {
            System.out.println("TC11 User Menu : FAIL");
        }

        // TC12 - Logout
        try {
            driver.findElement(By.linkText("Logout")).click();
            Thread.sleep(5000);

            if (driver.getCurrentUrl().contains("login"))
                System.out.println("TC12 Logout : PASS");
            else
                System.out.println("TC12 Logout : FAIL");
        } catch (Exception e) {
            System.out.println("TC12 Logout : FAIL");
        }

        System.out.println("\n===== ALL 12 TEST CASES EXECUTED =====");

        driver.quit();
    }
}