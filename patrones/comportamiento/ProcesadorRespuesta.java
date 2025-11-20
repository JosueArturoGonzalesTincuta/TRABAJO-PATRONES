package patrones.comportamiento;

import moduloPrincipal.Encuesta;

public interface ProcesadorRespuesta {
    void setSiguiente(ProcesadorRespuesta siguiente);
    void procesar(String respuesta, Encuesta encuesta);
}