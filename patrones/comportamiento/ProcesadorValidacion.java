package patrones.comportamiento;

import moduloPrincipal.Encuesta;

public class ProcesadorValidacion implements ProcesadorRespuesta {
    private ProcesadorRespuesta siguiente;
    
    @Override
    public void setSiguiente(ProcesadorRespuesta siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public void procesar(String respuesta, Encuesta encuesta) {
        if (encuesta.getPreguntaActual().validarRespuesta(respuesta)) {
            System.out.println("Respuesta valida");
            if (siguiente != null) {
                siguiente.procesar(respuesta, encuesta);
            }
        } else {
            System.out.println("Respuesta invalida");
        }
    }
}