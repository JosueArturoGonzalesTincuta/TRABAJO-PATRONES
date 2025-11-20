package patrones.estructural;

public class ValidacionLongitud implements Validacion {
    @Override
    public boolean validar(String respuesta) {
        return respuesta != null && respuesta.length() >= 5;
    }
}