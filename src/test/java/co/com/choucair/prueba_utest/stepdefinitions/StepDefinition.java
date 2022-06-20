package co.com.choucair.prueba_utest.stepdefinitions;

import co.com.choucair.prueba_utest.model.ModelWebUtest;
import co.com.choucair.prueba_utest.questions.GetResgister;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.choucair.prueba_utest.questions.GetResgister.getResgister;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import static co.com.choucair.prueba_utest.tasks.OpenHomePage.OpenHomePage;
import static co.com.choucair.prueba_utest.tasks.UserData.UserDataWith;
import static co.com.choucair.prueba_utest.tasks.UserDivices.UserDeviceWith;
import static co.com.choucair.prueba_utest.tasks.UserLocation.UserLocationWith;
import static co.com.choucair.prueba_utest.tasks.UserRegister.UserRegisterWith;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinition {


    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }


    @Given("^User wants to register$")
    public void user_wants_to_register() {

        theActorCalled("User").wasAbleTo(OpenHomePage());


    }


    @When("^Complete registration information$")
    public void complete_registration_information(List<ModelWebUtest> userData) {

        theActorInTheSpotlight().attemptsTo(UserDataWith(userData),
        UserLocationWith(userData),
        UserDeviceWith(userData),
        UserRegisterWith(userData));

    }

    @Then("^Complete registration$")
    public void complete_registration(List<ModelWebUtest> userData) {

        theActorInTheSpotlight().should(seeThat(getResgister(userData)));

    }
}
