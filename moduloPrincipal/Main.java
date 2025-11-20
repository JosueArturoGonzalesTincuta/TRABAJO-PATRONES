package moduloPrincipal;

import patrones.creacional.*;
import patrones.comportamiento.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("MODULO DE GESTION DE PREGUNTAS Y RESPUESTAS\n");
        
        Encuesta encuesta = new Encuesta();
        
        FabricaPreguntas fabricaAbierta = new FabricaPreguntaAbierta();
        FabricaPreguntas fabricaMultiple = new FabricaPreguntaOpcionMultiple();
        
        encuesta.agregarPregunta(fabricaAbierta.crearPregunta("Que opinas de nuestro servicio?"));
        encuesta.agregarPregunta(fabricaMultiple.crearPregunta("Como Calificarias nuestro producto?"));
        
        ProcesadorRespuesta cadena = new ProcesadorValidacion();
        ProcesadorRespuesta almacenamiento = new ProcesadorAlmacenamiento();
        ProcesadorRespuesta estadisticas = new ProcesadorEstadisticas();
        
        cadena.setSiguiente(almacenamiento);
        almacenamiento.setSiguiente(estadisticas);
        
        System.out.println("=== PROCESANDO ENCUESTA ===");
        
        encuesta.getPreguntaActual().mostrar();
        cadena.procesar("Excelente servicio, muy satisfecho", encuesta);
        encuesta.siguientePregunta();
        
        encuesta.getPreguntaActual().mostrar();
        cadena.procesar("3", encuesta);
        
        encuesta.mostrarResultados();
        
        System.out.println("\nEncuesta respondida exitosamente");
    }
}