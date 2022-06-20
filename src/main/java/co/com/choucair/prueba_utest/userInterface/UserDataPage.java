package co.com.choucair.prueba_utest.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserDataPage extends PageObject {

    public static final Target NAME = Target.the("Field for name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Field for last name")
            .located(By.id("lastName"));

    public static final Target EMAIL= Target.the("Field for email")
            .located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("Field for birth month")
            .located(By.id("birthMonth"));

    public static final Target BIRTH_DAY = Target.the("Field for birth day")
            .located(By.id("birthDay"));

    public static final Target BIRTH_YEAR = Target.the("Field for birth year")
            .located(By.id("birthYear"));

    public static final Target BUTTON_LOCATION = Target.the("Button for location")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}