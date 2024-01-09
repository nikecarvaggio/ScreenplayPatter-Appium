package example.questions;

import example.userInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateLogin implements Question<Boolean> {

    private HomePage homePage;
    public static ValidateLogin successfull() {
        return new ValidateLogin();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(HomePage.HOMEPAGE_TITLE));
    }
}
