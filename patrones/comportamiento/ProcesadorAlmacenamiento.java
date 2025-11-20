package patrones.comportamiento;

import moduloPrincipal.Encuesta;

public class ProcesadorAlmacenamiento implements ProcesadorRespuesta {
    private ProcesadorRespuesta siguiente;
    
    @Override
    public void setSiguiente(ProcesadorRespuesta siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public void procesar(String respuesta, Encuesta encuesta) {
        encuesta.agregarRespuesta(respuesta);
        System.out.println("Respuesta almacenada: " + respuesta);
        if (siguiente != null) {
            siguiente.procesar(respuesta, encuesta);
        }
    }
}