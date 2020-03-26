package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddToCartButton extends Utils{
    public void AddToCartButton(){
        List<WebElement> listofItems = driver.findElements(By.xpath("//div[@class=\"product-itme\"]"));

        {
            for (WebElement item : listofItems) {
                if (!item.getAttribute("innerHTML").contains("Add to Cart")) {
                    System.out.println("This item does not have ADD to cart button>>>>>" + item.getText());
                }
            }
        }
    }
}
