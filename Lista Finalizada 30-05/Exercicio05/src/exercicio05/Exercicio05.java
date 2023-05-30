/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio05;

/**
 *
 * @author Aluno
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicio do código
        int loop, isprim;
        
        
        
        for (loop = 1; loop <= 100;loop++) {
            int soma = 0;
            for (int loop2 = 1; loop2 <= loop; loop2++) {
               
                if (loop%loop2 == 0) {
                    soma += loop2;
                    
                }
                if (soma - loop == 1) {
                    System.out.println(loop+" É primo");
                    
                }
                
            }
            
        }
        }
    }
    
