/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tais Aguilera, Ronald Aguirre.
 */
import java.util.Scanner; 
        
public abstract class Pregunta {
    protected int peso;
    protected String texto;
    protected static Scanner scanner = new Scanner(System.in);

    public Pregunta(int peso, String texto) {
        this.peso = peso;
        this.texto = texto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTexto() {
        return texto;
    }
    
    public abstract boolean buscar();
}