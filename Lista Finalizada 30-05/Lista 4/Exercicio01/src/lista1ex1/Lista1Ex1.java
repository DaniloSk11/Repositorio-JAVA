/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1ex1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Lista1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicio
        Scanner ler = new Scanner(System.in);
        Scanner lerEnde = new Scanner(System.in);
        int cod;
        int codA;
        int codB;
        int consumo;
        int consumoT;
        int ano;

        double conta;
        double icms;
        double totalSaneago;
        double icmsT;
        double contaA;
        double contaB;
        double consumoMed;

        String nome;
        String nomeA;
        String nomeB;
        String ende;
        String endeA;
        String endeB;

        int classe;

        cod = 0;
        codA = 0;
        codB = 0;
        icmsT = 0;
        consumoT = 0;
        contaA = 200;
        contaB = 0;
        totalSaneago = 0;
        nomeA = "";
        nomeB = "";
        endeA = "";
        endeB = "";

        do {

            cod += 1;

            System.out.print("Insira o nome do consumidor da Conta Nº" + cod + ": ");
            nome = ler.next();

            System.out.print("Insira o endereço do consumidor(a) " + nome + ": ");
            ende = lerEnde.nextLine();

            System.out.print("Insira o consumo dessa conta: ");
            consumo = ler.nextInt();

            System.out.print("Insira o ano da instalação: ");
            ano = ler.nextInt();

            if (consumo < 201) {
                classe = 1;
                System.out.print("Classe A \n");
                conta = 0.5 * consumo;
                conta = conta + (conta * 0.05);
                icms = conta * 0.16;
            } else if (consumo < 401) {
                classe = 2;
                System.out.print("Classe B \n");
                conta = 0.85 * consumo;
                conta = conta + (conta * 0.1);
                icms = conta * 0.16;
            } else {
                classe = 3;
                System.out.print("Classe C \n");
                conta = 1.5 * consumo;
                conta = conta + (conta * 0.20);
                icms = conta * 0.16;
            }
            icmsT = icms + icmsT;
            consumoT = consumo + consumoT;
            totalSaneago = conta + totalSaneago;

            System.out.println("\n ---------------------------------------------------");
            System.out.println("Conta:" + cod + "\nO(a) consumidor(a) " + nome + " Que tem como endereço: " + ende + "\nDeve pagar R$:" + conta + "\nTaxa ICMS: R$:" + String.format("%.2f", icms));
            System.out.println("\n ---------------------------------------------------");

            if (consumo > contaB && classe == 2) {
                nomeB = nome;
                endeB = ende;
                codB = cod;

            }
            if (consumo < contaA && classe == 1) {
                nomeA = nome;
                endeA = ende;
                codA = cod;

            }

        } while (cod < 2);
        consumoMed = consumoT / cod;
        System.out.println("\n ---------------------------------------------------");
        System.out.println("\nO total ICMS arrecadado foi de R$:" + String.format("%.2f", icmsT));
        System.out.println("\nO total arrecadado pela Saneago foi de R$:" + String.format("%.2f", totalSaneago));
        System.out.println("\nO maior consumidor da classe B foi: " + nomeB + "\nDe Endereço:" + endeB + "\nConta:" + codB);
        System.out.println("\nO menor consumidor da classe A foi: " + nomeA + "\nDe Endereço:" + endeA + "\nConta:" + codA);
        System.out.println("\nA média de consumo foi de: " + String.format("%.2f", consumoMed));
    }

}
