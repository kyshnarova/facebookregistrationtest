package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Ky on 07.05.2016.
 */
public class FacebookRegistration extends BasePageFacebook {

    public FacebookRegistration(WebDriver driver) {
        super(driver);
    }

    private By firstNameLocator = By.xpath(".//input[@name='firstname']");
    private By lastNameLocator = By.xpath(".//input[@name='lastname']");
    private By regEmailLocator = By.xpath(".//input[@name='reg_email__']");
    private By regEmailConfirmLocator = By.xpath(".//input[@name='reg_email_confirmation__']");
    private By passwordLocator = By.xpath(".//input[@name='reg_passwd__']");
    private By submitButtonLocator = By.xpath(".//button[@name='websubmit']");
    private By birtgdayDayLocator = By.xpath(".//select[@name='birthday_day']");
    private By birthdayMonthLocator = By.xpath(".//select[@name='birthday_month']");
    private By birthdayYearLoctor = By.xpath(".//select[@name='birthday_year']");
    private By femaleLocator = By.xpath(".//input[@value='1'][@type='radio']/..");
    private By maleLocator = By.xpath(".//input[@value='2'][@type='radio']/..");
    private String sexLocator = ".//input[@value='%s'][@type='radio']/..";
    private String sexCommonLocator = ".//input[@value='%s']/..";



    public FacebookRegistration open(String url){
        driver.get(url);

        return this;
    }

    public FacebookRegistration enterFirstName (String firstNameValue){
        /*WebElement firstName = driver.findElement(firstNameLocator);
        firstName.clear();
        firstName.sendKeys(firstNameValue);*/
        sendKeys(firstNameLocator, firstNameValue);

        return this;
    }

    public FacebookRegistration enterLastName (String lastNameValue){
        /*WebElement lastName = driver.findElement(lastNameLocator);
        lastName.clear();
        lastName.sendKeys(lastNameValue);*/
        sendKeys(lastNameLocator, lastNameValue);

        return this;
    }

    public FacebookRegistration enterRegEmail (String regEmailValue){
        /*WebElement regEmail = driver.findElement(regEmailLocator);
        regEmail.clear();
        regEmail.sendKeys(regEmailValue);*/
        sendKeys(regEmailLocator, regEmailValue);

        return this;
    }

    public FacebookRegistration enterRegConfirmEmail (String regEmailConfirmValue){
        /*WebElement regConfirmEmail = driver.findElement(regEmailConfirmLocator);
        regConfirmEmail.clear();
        regConfirmEmail.sendKeys(regEmailConfirmValue);*/
        sendKeys(regEmailConfirmLocator, regEmailConfirmValue);

        return this;
    }

    public FacebookRegistration enterPassword (String passwordValue){
        /*WebElement password = driver.findElement(passwordLocator);
        password.clear();
        password.sendKeys(passwordValue);*/
        sendKeys(passwordLocator,passwordValue);

        return this;
    }

    public FacebookRegistration submitButtonClick(){
        /*WebElement submitButton = driver.findElement(submitButtonLocator);
        submitButton.click();*/
        clickButton(submitButtonLocator);

        return this;
    }

    public FacebookRegistration selectBirthdayDay(String dayValue){
        /*WebElement birthdayDayElement = driver.findElement(birtgdayDayLocator);
        Select birthdayDay = new Select(birthdayDayElement);
        birthdayDay.selectByValue(dayValue);*/
        selectByValue(birtgdayDayLocator, dayValue);

        return this;
    }

    public FacebookRegistration selectBirthdayMonth (Integer monthId){
        /*WebElement birthdayMonthElement = driver.findElement(birthdayMonthLocator);
        Select birthdayMonth = new Select(birthdayMonthElement);
        birthdayMonth.selectByIndex(monthId);*/
        selectByIndex(birthdayMonthLocator, monthId);

        return this;
    }

    public FacebookRegistration selectBirthdayYear (String yearValue){
        /*WebElement birthdayYearElement = driver.findElement(birthdayYearLoctor);
        Select birthdayYear = new Select(birthdayYearElement);
        birthdayYear.selectByValue(yearValue);*/
        selectByValue(birthdayYearLoctor, yearValue);

        return this;
    }

    public FacebookRegistration selectFemale (){
        /*WebElement femaleElement = driver.findElement(femaleLocator);
        femaleElement.click();*/
        clickButton(femaleLocator);

        return this;
    }

    public FacebookRegistration selectMale (){
        /*WebElement MaleElement = driver.findElement(maleLocator);
        MaleElement.click();*/
        clickButton(maleLocator);

        return this;
    }

    public FacebookRegistration chooseSex(Boolean sex) {
        WebElement sexRadioButton = null;

        if (sex){
            sexRadioButton = driver.findElement(By.xpath(String.format(sexCommonLocator, "2")));
        } else {
            sexRadioButton = driver.findElement(By.xpath(String.format(sexCommonLocator, "1")));
        }

        sexRadioButton.click();
        return this;
    }

    public FacebookRegistration chooseSex(String sex) {
        WebElement sexRadioButton = driver.findElement(By.xpath(String.format(sexCommonLocator, sex)));
        sexRadioButton.click();

        return this;
    }

    public FacebookRegistration chooseSex(Sex sex) {
        String index = String.valueOf(sex.getIndex());
        WebElement sexRadioButton =  driver.findElement(By.xpath(String.format(sexCommonLocator, index)));;
        sexRadioButton.click();
        return this;
    }

    /*    public RegistrationPage chooseSex(Sex sex) {
        WebElement sexRadioButton = null;

        if (sex == Sex.Male){
            sexRadioButton = driver.findElement(By.xpath(String.format(sexCommonLocator, "2")));
        } else {
            sexRadioButton = driver.findElement(By.xpath(String.format(sexCommonLocator, "1")));
        }

        sexRadioButton.click();
        return this;
    }*/

}
