/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.valorvenda;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double valorProduto=0d, valorFinal=0d, acrescimo=0d;
        
        System.out.println("Informe o valor do produto");
        valorProduto=leitor.nextDouble();
        
        System.out.println("Informe o valor do acrescimo");
        acrescimo=leitor.nextDouble();
        
        acrescimo= acrescimo/100;
        valorFinal = valorProduto + valorProduto*acrescimo;
        
        System.out.println("O preço de custo do produto será de R$ "+valorFinal);
        
    }
    
    
}
