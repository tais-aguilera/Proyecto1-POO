/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tais Aguilera, Ronald Aguirre.
 */
public class Exam {
    private Pregunta[] preguntas;
    private int contador;

    public Exam() {
        preguntas = new Pregunta[10];
        contador = 0;
    }

    public void agregaPregunta(Pregunta p) {
        if (contador < preguntas.length) {
            preguntas[contador] = p;
            contador++;
        } else {
            System.out.println("El examen ha alcanzado su limite.");
        }
    }

    public int darExam() {
        int puntajeTotalPosible = 0;
        int puntajeObtenido = 0;

        for (int i = 0; i < contador; i++) {
            Pregunta p = preguntas[i];
            puntajeTotalPosible += p.getPeso();
            
            boolean acierto = p.buscar();
            if (acierto) {
                puntajeObtenido += p.getPeso();
            }
        }

        if (puntajeTotalPosible == 0) return 0;
        
        System.out.println("\n-----------------------------------");
        System.out.println("Puntaje obtenido: " + puntajeObtenido + " de " + puntajeTotalPosible + " puntos posibles.");
        System.out.println("-----------------------------------");
        
        double porcentaje = ((double) puntajeObtenido / puntajeTotalPosible) * 100;
        return (int) Math.round(porcentaje);
    }
}