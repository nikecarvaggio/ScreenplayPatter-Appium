package example.userInterface;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage extends PageObject {


    //@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Zona de caída del carrito de compras\"]/android.view.ViewGroup/android.widget.TextView")
    //public static WebElementFacade HOMEPAGE_TITLE;

    public static final Target HOMEPAGE_TITLE = Target.the("test").located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Zona de caída del carrito de compras\"]/android.view.ViewGroup/android.widget.TextView"));

}
