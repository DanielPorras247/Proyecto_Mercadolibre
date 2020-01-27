package co.com.test.builders;

import co.com.test.tasks.LoguearseEnMercadolibre;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Loguearse {

    private String usuario;

    public Loguearse conUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public Performable yContrasena(String contrasena){
        return instrumented(LoguearseEnMercadolibre.class,usuario,contrasena);
    }



}
