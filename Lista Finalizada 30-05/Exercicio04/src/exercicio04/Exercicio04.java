/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio04;

/**
 *
 * @author Aluno
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicio do código
        int l1, l2, som;
        som = 0;
        for (l1 = 1; l1 <= 1000; l1++) {

            for (l2 = 1; l2 <= l1; l2++) {
                if (l1 % l2 == 0 && l2 != l1) {

                    som += l2;
                }

            }
            if (som == l1) {
                System.out.println(l1 + " É perfeito");

            }
            som = 0;
        }
    }

}
