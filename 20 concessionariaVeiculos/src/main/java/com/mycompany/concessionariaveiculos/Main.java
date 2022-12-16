/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionariaveiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int menu1 = 0, menu2 = 0, n = 3;
        int i, j;

        String nomeCarros[] = new String[n];
        ArrayList<String> listaCarros = new ArrayList<>();
        double descMais2000 = 0.07d, descMenosIgual2000 = 0.12d;
        double valorCarro = 0d;

        do {
            System.out.println("");
            System.out.println("Bem-Vindo a Loja Carango-Velho");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Modelos de carros");
            System.out.println("2 - Descontos");
            System.out.println("3 - Sair");
            System.out.println("");
            menu1 = leitor.nextInt();

            switch (menu1) {
                case 1:
                    for (i = 0; i < n; i++) {
                        System.out.println("Por favor, Informe o nome do carro que deseja inserir");
                        nomeCarros[i] = leitor.next();
                        listaCarros.add(nomeCarros[i]);
                    }
                    System.out.println("Veiculos Cadastrados");
                    for (j = 0; j < n; j++) {
                        Collections.sort(listaCarros);
                    }
                    System.out.println(listaCarros);
                    break;
                case 2:
                    do {
                        System.out.println("Qual o ano do carro que o senhro deseja?");
                        System.out.println("1 - Até ano 2000");
                        System.out.println("2 - Após ano 2000");
                        System.out.println("3 - Voltar ao menu principal");
                        menu2 = leitor.nextInt();
                        switch (menu2) {
                            case 1:
                                System.out.println("Informe o valor do carro desejado");
                                System.out.println("");
                                valorCarro = leitor.nextInt();
                                valorCarro = valorCarro - valorCarro * descMenosIgual2000;
                                System.out.println("");
                                System.out.println("O valor do carro com o nosso desconto para carros até ano 2000 está R$ " + valorCarro);
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Informe o valor do carro desejado");
                                System.out.println("");
                                valorCarro = leitor.nextInt();
                                valorCarro = valorCarro - valorCarro * descMais2000;
                                System.out.println("");
                                System.out.println("O valor do carro com o nosso desconto para carros após ano 2000 está R$ " + valorCarro);
                                System.out.println("");

                                break;
                        }
                    } while (menu2 != 3);
                    break;
            }
        } while (menu1 != 3);
    }
}
