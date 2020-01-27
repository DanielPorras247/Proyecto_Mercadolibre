package co.com.test.stepdefinitions;

import co.com.test.builders.Loguearse;
import co.com.test.tasks.AbrirElNavegador;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.test.util.TomarCredencialesDelUsuario.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ConfiguracionDeEscenarios {

    private Loguearse loguearse = new Loguearse();

    @Before
    public void preparar(){
        OnStage.setTheStage(new OnlineCast());
        tomarCredencialesDelUsuario();
        theActorCalled("Daniel").attemptsTo(
                AbrirElNavegador.enMercadolibre(),
                loguearse.conUsuario(usuarioEjecutor()).yContrasena(contrasenaUsuarioEjecutor()));
    }
}
