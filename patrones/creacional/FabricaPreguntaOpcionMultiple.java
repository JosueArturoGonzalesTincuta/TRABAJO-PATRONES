package patrones.creacional;

import patrones.estructural.*;

public class FabricaPreguntaOpcionMultiple implements FabricaPreguntas {
    @Override
    public Pregunta crearPregunta(String texto) {
        return new PreguntaOpcionMultiple(texto);
    }
    
    @Override
    public Validacion crearValidacion() {
        return new ValidacionOpciones();
    }
}