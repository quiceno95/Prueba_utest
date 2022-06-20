package co.com.choucair.prueba_utest.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class HomePage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Button to start registration")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}