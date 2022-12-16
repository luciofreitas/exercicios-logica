/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.precofabricacarro;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double percDistribuidor = 1.28, imposto = 1.45;
        double custoFabrica, custoConsumidor, valorAutomovel;

        System.out.println("Informe o valor do automóvel");
        valorAutomovel = leitor.nextDouble();
        
        System.out.println(imposto);
        System.out.println(percDistribuidor);
        
        custoFabrica = valorAutomovel * imposto;

        custoConsumidor = custoFabrica * percDistribuidor;

        System.out.println("O valor do automóvel é: R$ " + valorAutomovel
                + " o custo de fabrica dele é de R$ " + custoFabrica 
                + " e o custo final para o consumidor será de R$ " + custoConsumidor);

    }

}
