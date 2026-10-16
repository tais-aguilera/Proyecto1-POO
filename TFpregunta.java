/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tais Aguilera, Ronald Aguirre.
 */
public class TFpregunta extends Pregunta {
    private boolean RCorrecta;
    
    public TFpregunta(String texto, boolean respuestaCorrecta, int peso) {
        super(peso, texto);
        this.RCorrecta = respuestaCorrecta;
    }

    @Override
    public boolean buscar() {
        System.out.print(this.texto + " (Ingrese T para verdadero o F para falso): ");
        while (true) {
            try {
                String input = scanner.nextLine().trim().toLowerCase();
                
                if (input.equals("t")) {
                    boolean correcta = (RCorrecta == true);
                    imprimirResultado(correcta);
                    return correcta;
                } else if (input.equals("f")) {
                    boolean correcta = (RCorrecta == false);
                    imprimirResultado(correcta);
                    return correcta;
                } else {
                    System.out.print("Entrada invalida. Ingrese solo T o F: ");
                }
            } catch (Exception e) {
                System.out.print("Error. Intente nuevamente con T o F: ");
            }
        }
    }
    
    private void imprimirResultado(boolean correcta) {
        if (correcta) {
            System.out.println("Correcta!");
        } else {
            System.out.println("No, la respuesta es falsa");
        }
    }
}