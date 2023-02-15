import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {



        WebDriver driver = new EdgeDriver();// it creates a browser
        // navigate to google.com
        driver.get("https://www.google.com/");
        //locate the element
        WebElement searchBox = driver.findElement(By.name("q"));

        // enter a search term
        String searchTerm = "chatGPT";
        String expectedTitle = searchTerm + " - Google Search";
        searchBox.sendKeys((expectedTitle), Keys.ENTER);

        // in the results page, verify the title contains the search term;

        String actualTitle = driver.getTitle();// return the title of the current page

        if(actualTitle.contains(expectedTitle)){
            System.out.println("TEST PASSED.");
        }else{
            System.out.println("TEST FAILED. The current title is " + actualTitle + " The expected title was " + expectedTitle);
        }

    }
}
