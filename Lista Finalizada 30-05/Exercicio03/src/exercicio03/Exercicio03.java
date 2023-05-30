/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio03;

/**
 *
 * @author Aluno
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicio do código
        int n1, n2, r;

        for (n1 = 1; n1 <= 9; n1++) {

            System.out.println("Tabuada do: " + n1);
            for (n2 = 1; n2 <= 9; n2++) {
                r = 0;
                r = n1 * n2;
                System.out.println(n1 + " X " + n2 + " = " + r);
            }
            System.out.println("--");

        }
    }

}
