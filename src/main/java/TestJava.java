import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TestJava {
    WebDriver driver;

    @BeforeMethod
    public void test1() {
        driver = new ChromeDriver();
        driver.navigate();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @Test
    public void ClickPoodlePage() {

        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();

        String url = driver.getCurrentUrl();
        Assert.assertFalse(url.contains("Shopping Cart"));

    }

    }



