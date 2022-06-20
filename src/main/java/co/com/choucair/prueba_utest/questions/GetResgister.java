package co.com.choucair.prueba_utest.questions;


        import co.com.choucair.prueba_utest.model.ModelWebUtest;
        import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Question;
        import net.serenitybdd.screenplay.questions.Text;

        import java.util.List;

        import static co.com.choucair.prueba_utest.userInterface.UserRegisterPage.*;

public class GetResgister implements Question<Boolean> {

    private final List<ModelWebUtest> data;

    public GetResgister(List<ModelWebUtest> data) {
        this.data = data;
    }

    public static GetResgister getResgister(List<ModelWebUtest> data) {
        return new GetResgister(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String textButtonFinal = Text.of(BUTTON_FINISH).viewedBy(actor).asString();

        return data.get(0).getTextFinal().equals(textButtonFinal);
    }
}