package moduloPrincipal;

import java.util.*;
import patrones.estructural.Pregunta;

public class Encuesta {
    private List<Pregunta> preguntas = new ArrayList<>();
    private List<String> respuestas = new ArrayList<>();
    private int preguntaActualIndex = 0;
    private int totalRespuestas = 0;
    
    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }
    
    public Pregunta getPreguntaActual() {
        return preguntas.get(preguntaActualIndex);
    }
    
    public void siguientePregunta() {
        if (preguntaActualIndex < preguntas.size() - 1) {
            preguntaActualIndex++;
        }
    }
    
    public void agregarRespuesta(String respuesta) {
        respuestas.add(respuesta);
    }
    
    public void incrementarContador() {
        totalRespuestas++;
    }
    
    public int getTotalRespuestas() {
        return totalRespuestas;
    }
    
    public void mostrarResultados() {
        System.out.println("\nRESULTADOS DE LA ENCUESTA:");
        for (int i = 0; i < respuestas.size(); i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + respuestas.get(i));
        }
    }
}