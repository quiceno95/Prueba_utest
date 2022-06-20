package co.com.choucair.prueba_utest.tasks;

import co.com.choucair.prueba_utest.model.ModelWebUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.prueba_utest.userInterface.UserDataPage.*;

public class UserData implements Task {

    private List<ModelWebUtest> data;

    public UserData(List<ModelWebUtest> userInformations) {
        this.data = userInformations;
    }

    public static UserData UserDataWith(List<ModelWebUtest> userInformations) {
        return Tasks.instrumented(UserData.class, userInformations);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(data.get(0).getName()).into(NAME),
                Enter.theValue(data.get(0).getLastName()).into(LAST_NAME),
                Enter.theValue(data.get(0).getEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getBirthMonth()).from(BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getBirthDay()).from(BIRTH_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getBirthYear()).from(BIRTH_YEAR),
                Click.on(BUTTON_LOCATION)
        );

    }
}