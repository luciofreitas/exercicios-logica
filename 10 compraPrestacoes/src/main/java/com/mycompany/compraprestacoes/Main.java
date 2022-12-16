/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compraprestacoes;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double valorCompra=0d, valorParcelado=0d;
        int prestacoes=5;
        
        System.out.println("Insira o valor do produto que você deseja parcelar");
        valorCompra=leitor.nextDouble();
        
        valorParcelado = valorCompra/prestacoes;
        
        System.out.println("O valor das parcelas foram de R$ "+valorParcelado);
    }
       
    
}
