package co.com.choucair.prueba_utest.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserRegisterPage extends PageObject {

    public static final Target PASS = Target.the("Field of password")
            .located(By.id("password"));

    public static Target PASS_VALIDATE = Target.the("Field validate password")
            .located(By.id("confirmPassword"));

    public static Target CHECKBOX_SEND_NEWS = Target.the("Check for receive news")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static Target CHECKBOX_TERMS_OF_USE = Target.the("Check validate terms")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static Target CHECKBOX_PRIVACY = Target.the("Check for privacy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_FINISH = Target.the("Button for finish")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));

}