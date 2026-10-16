/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tais Aguilera, Ronald Aguirre.
 */
public class Selec_Mul_Pregunta extends Pregunta {
    private String[] seleccion;
    private int RCorrecta;

    public Selec_Mul_Pregunta(String texto, String[] elecciones, int RCorrecta, int peso) {
        super(peso, texto);
        this.seleccion = elecciones; 
        this.RCorrecta = RCorrecta;
    }

    @Override
    public boolean buscar() {
        System.out.println(this.texto);
        for (int i = 0; i < seleccion.length; i++) {
            char letra = (char) ('a' + i);
            System.out.println("  " + letra + ". " + seleccion[i]);
        }
        
        System.out.print("Ingrese una alternativa: ");
        
        while (true) {
            try {
                String input = scanner.nextLine().trim().toLowerCase();
                if (input.length() == 1) {
                    char letraIngresada = input.charAt(0);
                    int indiceSeleccionado = letraIngresada - 'a';
                    
                    if (indiceSeleccionado >= 0 && indiceSeleccionado < seleccion.length) {
                        boolean esCorrecta = (indiceSeleccionado == RCorrecta);
                        if (esCorrecta) {
                            System.out.println("Correcta!");
                        } else {
                            System.out.println("Respuesta incorrecta");
                        }
                        return esCorrecta;
                    }
                }
                System.out.print("Entrada invalida. Ingrese una de las alternativas disponibles: ");
            } catch (Exception e) {
                System.out.print("Error. Ingrese una de las alternativas disponibles: ");
            }
        }
    }
}