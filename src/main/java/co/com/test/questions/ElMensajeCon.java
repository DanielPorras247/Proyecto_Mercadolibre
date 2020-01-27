package co.com.test.questions;

import co.com.test.userinterface.MercadolibrePaginaDeCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElMensajeCon implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MercadolibrePaginaDeCompra.MENSAJE_OPCIONES_DE_ENVIO).viewedBy(actor).asString();
    }

    public static ElMensajeCon lasOpcionesDeEnvio() {
        return new ElMensajeCon();
    }

}
