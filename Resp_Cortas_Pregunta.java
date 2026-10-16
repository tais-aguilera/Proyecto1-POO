/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tais Aguilera, Ronald Aguirre.
 */
public class Resp_Cortas_Pregunta extends Pregunta {
    private String RCorrecta;

    public Resp_Cortas_Pregunta(String texto, String respuestaCorrecta, int peso) {
        super(peso, texto);
        this.RCorrecta = respuestaCorrecta;
    }

    @Override
    public boolean buscar() {
        System.out.print(this.texto + ": ");
        try {
            String input = scanner.nextLine().trim();
            boolean esCorrecta = input.equalsIgnoreCase(RCorrecta);
            
            if (esCorrecta) {
                System.out.println("Correcta!");
            } else {
                System.out.println("No, la respuesta correcta es " + RCorrecta);
            }
            return esCorrecta;
        } catch (Exception e) {
            System.out.println("Error leyendo la respuesta.");
            return false;
        }
    }
}