package Utilities;

public class BrowserActions {
    public static void maximizeBrowser(){
        WebDriverSingleton.getInstance().getDriver().manage().window().maximize();
    }

    public static void closeBrowser(){
        WebDriverSingleton.getInstance().getDriver().close();
    }

    public static void navigateTo(String url){
        WebDriverSingleton.getInstance().getDriver().navigate().to(url);
    }
}
