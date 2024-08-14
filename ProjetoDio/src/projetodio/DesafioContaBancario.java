/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetodio;

import java.util.Scanner;

/**
 *
 * @author Jonas Santos
 */
public class DesafioContaBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcao, sair;
        Double saldo = 0.0, valor;

        Scanner scString = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco Grana");
       
        do {
             System.out.println("Digite a Opção Desejada \n 1)Saldo \n 2)Deposito \n 3)Saque \n 4)Sair \n");
            opcao = scString.next();
            if (opcao.equals("1")) {
                System.out.println("Seu Saldo é: R$" + saldo);
                System.out.println("Deseja Encerrar a opção? ");
                sair = scString.next();
            } else if (opcao.equals("2")) {
                System.out.println("Quanto deseja Depositar? ");
                valor = scDouble.nextDouble();
                if (valor < 1) {
                    System.out.println("Não é possivel depositar valor abaixo de 1");
                } else {
                    saldo = valor;
                    System.out.println("Deposito realizado com Sucesso!");
                }
                System.out.println("Deseja Encerrar a opção? ");
                sair = scString.next();
            } else if (opcao.equals("3")) {
                System.out.println("Quanto deseja Sacar?");
                valor = scDouble.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não é possivel sacar pois você não tem saldo");
                } else {
                    saldo -= valor;
                    System.out.println("Saque Realizado com Sucesso");
                }

                System.out.println("Deseja Encerrar a opção? ");
                sair = scString.next();
            } else if (opcao.equals("4")) {
                System.out.println("Você encerrou a operação");
                sair = "sim";
            } else {
                System.out.println("Opção Inválida, finalizando a operação");
                sair = "sim";
            }
        } while (sair != "sim" || sair!="SIM");

    }

}
