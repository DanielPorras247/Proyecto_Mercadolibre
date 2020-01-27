package co.com.test.tasks;

import co.com.test.interactions.EsperarMientrasCargaLaPagina;
import co.com.test.util.Excel;
import jline.internal.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.test.userinterface.MercadolibrePaginaDeResultados.*;
import static co.com.test.userinterface.MercadolibrePaginaHome.*;

public class BuscarYAgregar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(Enter.theValue(Excel.getCellData(1, 0)).into(BARRA_DE_BUSQUEDA));
            actor.attemptsTo(Click.on(BOTON_DE_BUSQUEDA),
            //actor.attemptsTo((Performable) Hit.the(Keys.ENTER),
                    EsperarMientrasCargaLaPagina.esperarClase(4000));
            actor.attemptsTo(Click.on(PRIMER_RESULTADO),
                    EsperarMientrasCargaLaPagina.esperarClase(4000));
            actor.attemptsTo(Click.on(BOTON_COMPRAR),
                    EsperarMientrasCargaLaPagina.esperarClase(4000));
        } catch (Exception e) {

            Log.error("No fue posible cerrar el stamented", e);
        }
    }

    public static BuscarYAgregar unArticuloALaCompra() {
        return Tasks.instrumented(BuscarYAgregar.class);
    }
}
