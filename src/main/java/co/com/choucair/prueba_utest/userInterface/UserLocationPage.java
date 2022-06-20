package co.com.choucair.prueba_utest.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserLocationPage extends PageObject {

    public static final Target CITY = Target.the("Field for city")
            .located(By.id("city"));

    public static final Target POSTAL_CODE = Target.the("Field for zip")
            .located(By.id("zip"));

    public static final Target CONTAINER_COUNTRY = Target.the("Field for Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));

    public static final Target COUNTRY = Target.the("Select for choose country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BUTTON_DEVICES = Target.the("Button to go to devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}