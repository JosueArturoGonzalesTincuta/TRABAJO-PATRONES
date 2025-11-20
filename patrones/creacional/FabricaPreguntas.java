package patrones.creacional;

import patrones.estructural.*;

public interface FabricaPreguntas {
    Pregunta crearPregunta(String texto);
    Validacion crearValidacion();
}