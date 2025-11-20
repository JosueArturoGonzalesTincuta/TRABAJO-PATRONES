package patrones.estructural;

public class ValidacionOpciones implements Validacion {
    @Override
    public boolean validar(String respuesta) {
        return respuesta != null && "12345".contains(respuesta);
    }
}