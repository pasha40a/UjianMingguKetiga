package addhampashabaihaqqi.ujianketiga;

import addhampashabaihaqqi.ujianketiga.page.ShopDemoQA;
import addhampashabaihaqqi.ujianketiga.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        addhampashabaihaqqi.ujianketiga.DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = addhampashabaihaqqi.ujianketiga.DriverSingleton.getDriver();
        driver.get(Constants.URL);

        driver.findElement(By.xpath("/html/body/p/a")).click();
        System.out.println("Click Dismiss");

        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]")).click();
        System.out.println("Click My Account");

        ShopDemoQA shopDemoQA = new ShopDemoQA();
        shopDemoQA.regis("Addham", "pashabaihaqqi72@gmail.com","123Pasha@");
        System.out.println("Registration");
        shopDemoQA.login("pashabaihaqqi72@gmail.com","123Pasha@");
        System.out.println("Login");







        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}