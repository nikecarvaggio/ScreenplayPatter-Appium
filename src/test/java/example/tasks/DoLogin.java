package example.tasks;

import example.userInterface.LoginPage;
import jdk.internal.net.http.common.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoLogin implements Task {

    private LoginPage loginPage;

    private String username;
    private String password;

    public DoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable successfully(String username, String password) {
        return Tasks.instrumented(DoLogin.class, username, password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_TEXT_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_TEXT_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
