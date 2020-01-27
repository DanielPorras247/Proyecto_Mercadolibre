package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MercadolibrePaginaDeResultados extends PageObject {
    public static final Target PRIMER_RESULTADO =Target.the("Primer resultado").locatedBy("//div[@class='item__info-container highlighted ']//span[@class='main-title']");
    public static final Target BOTON_COMPRAR = Target.the("Boton comprar").locatedBy("//div[@class='vip-actions-wrapper  ']//input[@id='BidButtonTop']");
}
