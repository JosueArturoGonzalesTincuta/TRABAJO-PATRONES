package patrones.comportamiento;

import moduloPrincipal.Encuesta;

public class ProcesadorEstadisticas implements ProcesadorRespuesta {
    private ProcesadorRespuesta siguiente;
    
    @Override
    public void setSiguiente(ProcesadorRespuesta siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public void procesar(String respuesta, Encuesta encuesta) {
        encuesta.incrementarContador();
        System.out.println("Total respuestas: " + encuesta.getTotalRespuestas());
        if (siguiente != null) {
            siguiente.procesar(respuesta, encuesta);
        }
    }
}