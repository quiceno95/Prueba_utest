package co.com.choucair.prueba_utest.tasks;


import co.com.choucair.prueba_utest.model.ModelWebUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.prueba_utest.userInterface.UserRegisterPage.*;

public class UserRegister implements Task {

    private List<ModelWebUtest> data;

    public UserRegister(List<ModelWebUtest> userInformations) {
        this.data = userInformations;
    }

    public static UserRegister UserRegisterWith(List<ModelWebUtest> userInformations) {

        return Tasks.instrumented(UserRegister.class, userInformations);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getPass()).into(PASS),
                Enter.theValue(data.get(0).getPass()).into(PASS_VALIDATE),
                Click.on(CHECKBOX_SEND_NEWS),
                Click.on(CHECKBOX_PRIVACY),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(BUTTON_FINISH));
    }
}