package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com/jms/mco/lgz/msl/login/H4sIAAAAAAAEAy2PX0_CMBTFv0sfeOKfMxJZQkzHQIdEs2GU-LLcdV1X7OhsLxYkfHc74sN9OL9z7rm5Z6K0kPscTy0nIeHHVkkmkfRJqwArbZpclt5olEdWIv-XTHcRMNBw5MaS8NwVCV5G3C91VRUoy30IDljnldLOs-stz4T2okZsbTgaOeeGDTcMSq1kYfiQ6cbP6KEBxNxpU86SvUWJByb1HhS3UfZK497VRq3VbDoNbu-Dm7ueYEqWs_lu_DxPJW1he4yy-IVmiaWPyxKiwcAug_epFHGxqb8Tu1GrdFIEbLx4o7sBbj8mv3X6dFz9bDP4zISN1kkqgIq1WtC1yx2LyKXvP7OYowH2RUI0B375AzHddU9FAQAA/user")
public class MercadolibrePaginaDeLogueo extends PageObject {
    public static final Target CAMPO_CORREO = Target.the("Campo correo electrónico").locatedBy("//div[@class='andes-form-control__control']//input[@id='user_id']");
    public static final Target BOTON_CONTINUAR = Target.the("Boton continuar").locatedBy("//div[@class='login-form__actions']//button[@type='submit']");
    public static final Target CAMPO_CONTRASENA = Target.the("Campo contraseña").locatedBy("//div[@class='andes-form-control__control']//input[@id='password']");
    public static final Target BOTON_INGRESAR = Target.the("Boton ingresar").locatedBy("//div[@class='login-form__actions']//button[@id='action-complete']");
}
