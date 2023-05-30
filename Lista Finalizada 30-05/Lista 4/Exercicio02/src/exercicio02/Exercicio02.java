/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02;
import java.util.Scanner;
/**
 *
 * @author VejoV
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Início do código
        Scanner ler = new Scanner(System.in);
        int num, tvpb, tvco, insc;
        double salB, salL, salF, coems;
        
        
        coems = 0;
        
        for (num = 0; num < 20; num++) {            
            
            
            System.out.println("\nInsira o número de inscrição: ");
            insc = ler.nextInt();
            
            System.out.println("Insira o salário fixo: ");
            salF = ler.nextDouble();
            
            System.out.println("Insira quantos televisores a cores foram vendidos: ");
            tvco = ler.nextInt();
            
            System.out.println("Insira quantos televisores preto e branco foram vendidos: ");
            tvpb = ler.nextInt();
            
            if (tvco >= 10) {
                coems = (tvco*100.0) + coems;
            }else{
                coems = (tvco*50.0) + coems; 
            }
            if (tvpb >= 20) {
                coems = (tvpb*40.0) + coems;
            }else{
                coems = (tvpb*20.0) + coems; 
            }
            salB = salF + coems;
            salL = salB - (salB * 0.08); 
            
            if (salB >= 3000) {
                salL = (salL * 0.05) + salL;  
            }
            System.out.print("---------------------\n");
            System.out.println("O Funcionario do numero de inscrição: " + insc);
            System.out.println("\nRecebeu R$:"+salB+" de salário Bruto");
            System.out.println("\nRecebeu R$:"+salL+" de salário salário Liquido");
            System.out.print("\n---------------------");
        }
    }
    
}
