package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ElementsActions {
    public static WebDriverWait webDriverWait = new WebDriverWait(WebDriverSingleton.getInstance().getDriver(), 30);

    public static void clickOnElement(By locator){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
        WebDriverSingleton.getInstance().getDriver().findElement(locator).click();
    }

    public static void fillTextField(By locator, String text){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebDriverSingleton.getInstance().getDriver().findElement(locator).clear();
        WebDriverSingleton.getInstance().getDriver().findElement(locator).sendKeys(text);
    }

    public static String getText(By locator){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return WebDriverSingleton.getInstance().getDriver().findElement(locator).getText();
    }

    public static boolean isElementExistOnPage(By locator){
        try{
            WebDriverSingleton.getInstance().getDriver().findElement(locator);
        } catch(Exception e){
            return false;
        } return true;
    }

    public static void selectElementFromDropdown(By locator,String option){
        Select select = new Select(WebDriverSingleton.getInstance().getDriver().findElement(locator));
        select.selectByValue(option);
    }

    public static void clickOnElementFromListByIndex(int index, By locator){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
        WebDriverSingleton.getInstance().getDriver().findElements(locator).get(index-1).click();
    }

    public static List<String> getElementsText(By locator){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        List<WebElement> elements = WebDriverSingleton.getInstance().getDriver().findElements(locator);
        List<String> elementsText = new ArrayList<>();
        for(int i=0; i<elements.size(); i++){
            elementsText.add(elements.get(i).getText());
        }
        return elementsText;
    }

    public static int getElementsCount(By locator){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return WebDriverSingleton.getInstance().getDriver().findElements(locator).size();
    }
}