package patrones.estructural;

public class PreguntaOpcionMultiple extends Pregunta {
    public PreguntaOpcionMultiple(String texto) {
        super(texto, new ValidacionOpciones());
    }
    
    @Override
    public void mostrar() {
        System.out.println("Pregunta multiple: " + texto + " | 1 | 2 | 3 | 4 | 5 |");
    }
    
    @Override
    public boolean validarRespuesta(String respuesta) {
        return validacion.validar(respuesta);
    }
}