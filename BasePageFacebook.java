package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Ky on 07.05.2016.
 */
public class BasePageFacebook {
    protected WebDriver driver;

    public BasePageFacebook (WebDriver driver){
        this.driver = driver;
    }

    protected void sendKeys (By locator, String value){
        WebElement input = driver.findElement(locator);
        input.clear();
        input.sendKeys(value);
    }

    protected void clickButton (By buttonLocator){
        WebElement button = driver.findElement(buttonLocator);
        button.click();
    }

    protected void selectByValue (By locator, String value){
        WebElement element = driver.findElement(locator);
        Select selectValue = new Select(element);
        selectValue.selectByValue(value);//selectValue.selectByVisibleText(value);
    }

    protected void selectByIndex (By locator, Integer index){
        WebElement element = driver.findElement(locator);
        Select selectValue = new Select(element);
        selectValue.selectByIndex(index);
    }

}
