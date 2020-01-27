package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MercadolibrePaginaHome extends PageObject {
    public static final Target BARRA_DE_BUSQUEDA = Target.the("Barra de busqueda").locatedBy("//form[@class='nav-search']//input[@class='nav-search-input']");
    public static final Target BOTON_DE_BUSQUEDA = Target.the("Boton de busqueda").locatedBy("//form[@class='nav-search']//button[@class='nav-search-btn']");
}
