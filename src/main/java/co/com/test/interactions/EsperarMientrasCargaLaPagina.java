package co.com.test.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperarMientrasCargaLaPagina implements Interaction {
    private int esperar;

    protected EsperarMientrasCargaLaPagina(int esperar) {
        this.esperar = esperar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(esperar);
    }

    public static EsperarMientrasCargaLaPagina esperarClase (int esperar){
        return instrumented(EsperarMientrasCargaLaPagina.class, esperar);
    }
}
