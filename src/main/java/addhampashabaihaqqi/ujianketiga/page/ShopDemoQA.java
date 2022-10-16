package addhampashabaihaqqi.ujianketiga.page;

import addhampashabaihaqqi.ujianketiga.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopDemoQA {
    private WebDriver driver;

    public ShopDemoQA() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "reg_username")
    WebElement reg_username;

    @FindBy(id = "reg_email")
    WebElement reg_email;

    @FindBy(id = "reg_password")
    WebElement reg_password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
    WebElement submit;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement submitLogin;

    public void regis(String reg_username, String reg_email, String reg_password){
        this.reg_username.sendKeys(reg_username);
        this.reg_email.sendKeys(reg_email);
        this.reg_password.sendKeys(reg_password);
        submit.click();
    }

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submitLogin.click();
    }



}
