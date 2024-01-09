package example.userInterface;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @AndroidFindBy(accessibility = "test-Usuario")
    @iOSXCUITFindBy(className = "test-Usuario")
    public static WebElementFacade USERNAME_TEXT_FIELD;

    @AndroidFindBy(accessibility = "test-Contraseña")
    @iOSXCUITFindBy(className = "test-Usuario")
    public static WebElementFacade PASSWORD_TEXT_FIELD;

    @AndroidFindBy(accessibility = "test-LOGIN")
    @iOSXCUITFindBy(className = "test-Usuario")
    public static WebElementFacade LOGIN_BUTTON;
}
