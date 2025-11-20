package patrones.creacional;

import patrones.estructural.*;

public class FabricaPreguntaAbierta implements FabricaPreguntas {
    @Override
    public Pregunta crearPregunta(String texto) {
        return new PreguntaAbierta(texto);
    }
    
    @Override
    public Validacion crearValidacion() {
        return new ValidacionLongitud();
    }
}