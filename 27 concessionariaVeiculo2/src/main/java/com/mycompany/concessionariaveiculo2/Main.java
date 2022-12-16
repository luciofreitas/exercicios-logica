/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionariaveiculo2;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorDesc = 0d, valorCliente = 0d, valorVeiculo = 0d;
        double descAlc = 0.25d, descGas = 0.21d, descDie = 0.14;
        int opcao = 0;

        do {

            System.out.println("Informe o valor do veiculo que deseja");
            valorVeiculo = leitor.nextDouble();
            System.out.println("Informe com combustível do veículo");
            System.out.println("1 - Alcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    valorDesc = valorVeiculo * descAlc;
                    valorCliente = valorVeiculo - valorDesc;
                    System.out.println("O valor do desconto foi de R$ " + valorDesc + ", logo o valor do veiculo ficará: R$ " + valorCliente);
                    break;
                case 2:
                    valorDesc = valorVeiculo * descGas;
                    valorCliente = valorVeiculo - valorDesc;
                    System.out.println("O valor do desconto foi de R$ " + valorDesc + ", logo o valor do veiculo ficará: R$ " + valorCliente);
                    break;
                case 3:
                    valorDesc = valorVeiculo * descDie;
                    valorCliente = valorVeiculo - valorDesc;
                    System.out.println("O valor do desconto foi de R$ " + valorDesc + ", logo o valor do veiculo ficará: R$ " + valorCliente);
                    break;
            }
            break;

        } while (valorVeiculo != 0);
    }

}
