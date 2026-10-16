/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tais Aguilera, Ronald Aguirre.
 */

        
public class ExamDemo {
    public static void main(String args[]) {
        Exam miExam = new Exam();
 
        miExam.agregaPregunta(new TFpregunta("El agua moja", true, 1));
        
        String pesoElec[] = {"Un kilo de plumas", "Un kilo de plomo", "Pesan exactamente lo mismo", "Depende de la balanza"};
        miExam.agregaPregunta(new Selec_Mul_Pregunta("Que pesa mas, un kilo de plumas o un kilo de plomo?", pesoElec, 2, 1));
        
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("De que color era el caballo blanco de Napoleon", "Blanco", 1));
       
        miExam.agregaPregunta(new TFpregunta("Los peces tienen sed y beben agua", false, 1));
        
        String mesesElec[] = {"Solo febrero", "Depende si es bisiesto", "Todos los meses", "Ninguno"};
        miExam.agregaPregunta(new Selec_Mul_Pregunta("Cuantos meses del ano tienen 28 dias?", mesesElec, 2, 1));
        

        miExam.agregaPregunta(new Resp_Cortas_Pregunta("De que color son las cajas negras de los aviones comerciales", "Naranja", 1));

        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cual es la mitad de dos mas dos? (escribe el numero en palabras)", "Tres", 2));

        miExam.agregaPregunta(new TFpregunta("El sol sale de noche para que podamos dormir a oscuras", false, 1));

        String zeldaElec[] = {"Zelda", "Link", "Luigi", "Mario"};
        miExam.agregaPregunta(new Selec_Mul_Pregunta("Como se llama el protagonista del juego The Legend of Zelda?", zeldaElec, 1, 1));

        System.out.println("\n------------------------------------------");
        System.out.println(" El examen mas inutil del mundo :) ");
        System.out.println("------------------------------------------");
        System.out.println(" INSTRUCCIONES: ");
        System.out.println(" Lee atentamente cada pregunta antes de responder.");
        System.out.println(" Que la fuerza te acompanie.");
        System.out.println("------------------------------------------\n");
        System.out.println("Presiona ENTER para comenzar el examen");
        try {
            System.in.read();
        } catch (Exception e) {}
        System.out.println("\nIniciando examen...\n");

        int puntaje = miExam.darExam();
        System.out.println("El examen ha terminado. Su resultado es " + puntaje + "%");
    } 
}