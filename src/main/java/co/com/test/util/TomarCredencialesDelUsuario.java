package co.com.test.util;

public class TomarCredencialesDelUsuario {

    private static String usuarioEjecutor;
    private static String contrasenaUsuarioEjecutor;

    private TomarCredencialesDelUsuario(){
        throw new IllegalStateException("Utility class");
    }

    public static void tomarCredencialesDelUsuario(){
        usuarioEjecutor = System.getProperty("UE");
        contrasenaUsuarioEjecutor = System.getProperty("CUE");
    }

    public static String usuarioEjecutor(){
        return usuarioEjecutor;
    }
    public static String contrasenaUsuarioEjecutor(){
        return contrasenaUsuarioEjecutor;
    }
}
