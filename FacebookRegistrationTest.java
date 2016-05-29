package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ky on 07.05.2016.
 */
public class FacebookRegistrationTest {

    static WebDriver driver;
    private String url = "https://www.facebook.com/";
    private String firstName = "Nastia";
    private String lastName = "Test";
    private String regEmail = "test@gmail.com";
    private String refEmailConfirm = "test@gmail.com";
    private String password = "1234qwerty";
    private String birthdayDay = "23";
    private Integer birthdayMonthId = 5;
    private String birthdayYear = "1990";


    @BeforeMethod
    public void tearUp(){
        driver = new FirefoxDriver(); //тип класса = тип объекта
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void registrationTest(){
        FacebookRegistration facebookRegistration = new FacebookRegistration(driver);
        facebookRegistration.open(url)
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterRegEmail(regEmail)
                .enterRegConfirmEmail(refEmailConfirm)
                .enterPassword(password)
                .selectBirthdayDay(birthdayDay)
                .selectBirthdayMonth(birthdayMonthId)
                .selectBirthdayYear(birthdayYear)
                .selectFemale()
                .submitButtonClick();
    }
}
