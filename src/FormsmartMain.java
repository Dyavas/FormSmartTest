import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormsmartMain  extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement businessRadio= driver.findElement(By.cssSelector("input[id$='4586_0']"));
        businessRadio.click();
        WebElement discoveryRadio= driver.findElement(By.cssSelector("select[id$='4588']"));
        discoveryRadio.click();
        Thread.sleep(1000);
        WebElement discoveryoption=driver.findElement(By.cssSelector("option[Value='Online Advertising']"));
        discoveryoption.click();
        Thread.sleep(1000);
        WebElement EveryRadio= driver.findElement(By.cssSelector("input[value='Every Day']"));
        EveryRadio.click();
        Thread.sleep(1000);
        WebElement goodRadio=driver.findElement(By.cssSelector("input[value='Good']"));
        goodRadio.click();
        Thread.sleep(1000);
        WebElement usingSelect=driver.findElement(By.cssSelector("select[id$='u_IQh_4597']"));
        usingSelect.click();
        Thread.sleep(1000);
        WebElement usingOption=driver.findElement(By.cssSelector("[id$='u_IQh_4597']> *:nth-child(4)"));
        usingOption.click();
        Thread.sleep(2000);
        driver.quit();



    }


}
