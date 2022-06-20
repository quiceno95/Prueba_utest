package co.com.choucair.prueba_utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro_nuevo_usuario.feature",
        tags = "@UserRegistration",
        glue = "co.com.choucair.prueba_utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}