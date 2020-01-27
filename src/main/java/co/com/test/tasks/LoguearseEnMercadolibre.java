package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.test.userinterface.MercadolibrePaginaDeLogueo.*;

public class LoguearseEnMercadolibre implements Task {

    private String usuario;
    private String contrasena;

    public LoguearseEnMercadolibre(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(CAMPO_CORREO),
                Click.on(BOTON_CONTINUAR),
                Enter.theValue(contrasena).into(CAMPO_CONTRASENA),
                Click.on(BOTON_INGRESAR));
    }
}
