package SeleniumJava;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMembershipTest {

    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().window().maximize();
        driver.get("https://www.thelocal.se/membership-offer");

        acceptCookies();
        selectMembershipPlans();
        loginTest();
        subscribeNewsletter();

        driver.quit();
    }

    static void acceptCookies() {
        wait.until(ExpectedConditions.elementToBeClickable(By.className("cmptxt_btn_yes"))).click();
    }

    static void selectMembershipPlans() {
        WebElement membershipFrame = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[src*='buy.tinypass.com']"))
        );
        driver.switchTo().frame(membershipFrame);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//section[2]//a"))
        ).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//section[1]//a"))
        ).click();

        driver.switchTo().defaultContent();
    }

    static void loginTest() {
        WebElement firstIframe = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.tagName("iframe"))
        );
        driver.switchTo().frame(firstIframe);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button.btn-login"))
        ).click();

        driver.switchTo().defaultContent();

        WebElement loginIframe = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[src*='id.piano.io']"))
        );
        driver.switchTo().frame(loginIframe);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
                .sendKeys("surafeldesta2489@gmail.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit'] span"))).click();

        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button[aria-label='Close']"))
        ).click();
    }

    static void subscribeNewsletter() {
        WebElement emailInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("form-control"))
        );
        emailInput.sendKeys("vamaso4277@idoidraw.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button[type='submit']"))
        ).click();
    }
}

