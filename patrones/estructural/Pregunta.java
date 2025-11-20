package patrones.estructural;

public abstract class Pregunta {
    protected Validacion validacion;
    protected String texto;
    
    public Pregunta(String texto, Validacion validacion) {
        this.texto = texto;
        this.validacion = validacion;
    }
    
    public abstract void mostrar();
    public abstract boolean validarRespuesta(String respuesta);
}