package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MercadolibrePaginaDeCompra extends PageObject {
    public static final Target MENSAJE_OPCIONES_DE_ENVIO = Target.the("Mensaje que indica las opciones de envío").locatedBy("/html/body/main/div/div/div/div/div/div/div/div/div/div/div/div/div/h2");
}
