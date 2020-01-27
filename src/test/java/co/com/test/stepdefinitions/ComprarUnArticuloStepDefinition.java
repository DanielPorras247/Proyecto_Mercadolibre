package co.com.test.stepdefinitions;

import co.com.test.questions.ElMensajeCon;
import co.com.test.tasks.BuscarYAgregar;
import co.com.test.util.Excel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import jline.internal.Log;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarUnArticuloStepDefinition {

    @Cuando("^busca el articulo y lo añade a la compra$")
    public void buscaElArtículoYLoAñadeALaCompra() throws Exception {

        String path =".\\src\\test\\resources\\datadriven\\data_listadoDeArticulosMercadoLibre.xlsx";
        String sheetName ="listadoDeArticulos";
        try {
            Excel.setExcelFile(path, sheetName);
        } catch (Exception e) {
            Log.error("No fue posible cerrar el stamented", e);
        }
        theActorInTheSpotlight().attemptsTo(BuscarYAgregar.unArticuloALaCompra());
        Excel.saveData(path);
        Excel.cerrarBook();
    }

    @Entonces("^el debería ver en pantalla el mensaje con las (.*)$")
    public void elDeberíaVerEnPantallaElMensajeConLasOpcionesDeEnvio(String mensajeValidacion) throws Exception {
        theActorInTheSpotlight().should(seeThat(ElMensajeCon.lasOpcionesDeEnvio(), Matchers.equalTo(mensajeValidacion)));
    }
}
