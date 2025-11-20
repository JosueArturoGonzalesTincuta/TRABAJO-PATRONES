package patrones.estructural;

public class PreguntaAbierta extends Pregunta {
    public PreguntaAbierta(String texto) {
        super(texto, new ValidacionLongitud());
    }
    
    @Override
    public void mostrar() {
        System.out.println("Pregunta abierta: " + texto);
    }
    
    @Override
    public boolean validarRespuesta(String respuesta) {
        return validacion.validar(respuesta);
    }
}