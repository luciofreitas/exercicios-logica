/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.precoproduto;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int i, opcao = 0, opcao2 = 0;
        int n = 3;
        double[] valorCustoVetor = new double[n];
        double[] valorVendaVetor = new double[n];
        double precCusto = 0d, precVenda = 0d, valorResultado = 0d,
                somaPrecCusto = 0d, somaPrecVenda = 0d;
        double mediaPrecCusto = 0d, mediaPrecVenda = 0d;
        do {
            System.out.println("Bem Vindo a Lojinha do Zé");
            System.out.println("");
            System.out.println("1 - Informação sobre a negociação");
            System.out.println("2 - Informação sobre a média");
            System.out.println("3 - Sair");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    for (i = 0; i < n; i++) {
                        System.out.println("Informe o custo do produto");
                        valorCustoVetor[i] = leitor.nextDouble();

                        System.out.println("Informe o valor de venda do produto");
                        valorVendaVetor[i] = leitor.nextDouble();

                        if (valorVendaVetor[i] > valorCustoVetor[i]) {
                            valorResultado = valorVendaVetor[i] - valorCustoVetor[i];
                            System.out.println("O lucro foi de R$ " + valorResultado);
                        } else if (valorVendaVetor[i] == valorCustoVetor[i]) {
                            System.out.println("Você obeteve empate na venda");
                        } else {
                            valorResultado = valorCustoVetor[i] - valorVendaVetor[i];
                            System.out.println("O prejuizo foi de R$ " + valorResultado);
                        }

                    }

                    break;
                case 2:
                    do {
                        System.out.println("Escolha que tipo de média deseja");
                        System.out.println("1 - Média no preço de custo");
                        System.out.println("2 - Média no preço de venda");
                        System.out.println("3 - Voltar para o menu principal");
                        opcao2 = leitor.nextInt();
                        switch (opcao2) {
                            case 1:
                                for (i = 0; i < valorCustoVetor.length; i++) {
                                    System.out.println("Informe o custo do produto");
                                    valorCustoVetor[i] = leitor.nextDouble();
                                }
                                for (i = 0; i < valorCustoVetor.length; i++) {
                                    somaPrecCusto += valorCustoVetor[i];
                                }

                                mediaPrecCusto = somaPrecCusto / valorCustoVetor.length;
                                System.out.println("A media no preço de custo é R$ " + mediaPrecCusto);
                                mediaPrecCusto = 0;
                                break;
                            case 2:
                                for (i = 0; i < valorVendaVetor.length; i++) {
                                    System.out.println("Informe o preço da venda");
                                    valorVendaVetor[i] = leitor.nextDouble();
                                }
                                for (i = 0; i < valorVendaVetor.length; i++) {

                                    somaPrecVenda += valorVendaVetor[i];

                                }
                                mediaPrecVenda = somaPrecVenda / valorVendaVetor.length;
                                System.out.println("A media no preço de venda é R$ " + mediaPrecVenda);
                                mediaPrecVenda = 0;
                                break;
                        }
                    } while (opcao2 != 3);
                    break;
            }
        } while (opcao != 3);

    }

}
