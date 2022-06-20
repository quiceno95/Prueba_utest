package co.com.choucair.prueba_utest.tasks;

import co.com.choucair.prueba_utest.userInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenHomePage implements Task {

    private HomePage Homepage;

    public static OpenHomePage OpenHomePage() {
        return Tasks.instrumented(OpenHomePage.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(Homepage),
                Click.on(HomePage.JOIN_BUTTON));

    }
}