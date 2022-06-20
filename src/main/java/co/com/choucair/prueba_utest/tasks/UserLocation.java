package co.com.choucair.prueba_utest.tasks;

import co.com.choucair.prueba_utest.model.ModelWebUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.prueba_utest.userInterface.UserLocationPage.*;

public class UserLocation implements Task {
    private List<ModelWebUtest> data;

    public UserLocation(List<ModelWebUtest> userInformations) {
        this.data = userInformations;
    }

    public static UserLocation UserLocationWith(List<ModelWebUtest> userInformations) {
        return Tasks.instrumented(UserLocation.class, userInformations);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getZip()).into(POSTAL_CODE),
                Click.on(CONTAINER_COUNTRY),
                Enter.theValue(data.get(0).getCountry()).into(COUNTRY),
                Click.on(BUTTON_DEVICES)
        );
    }
}