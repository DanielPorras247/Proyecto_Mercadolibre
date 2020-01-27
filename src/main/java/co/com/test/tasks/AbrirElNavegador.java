package co.com.test.tasks;

import co.com.test.userinterface.MercadolibrePaginaDeLogueo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirElNavegador implements Task {

    private MercadolibrePaginaDeLogueo mercadolibrePaginaDeLogueo;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(mercadolibrePaginaDeLogueo));
    }

    public static AbrirElNavegador enMercadolibre() {
        return Tasks.instrumented(AbrirElNavegador.class);
    }

}
