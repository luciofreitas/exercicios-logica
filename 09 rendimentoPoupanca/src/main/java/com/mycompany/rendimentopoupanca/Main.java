/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rendimentopoupanca;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double dinheiroEntrada=0d, dinheiroSaida=0d, jurosFixo=1.0007;
        
        System.out.println("Informe o valor que deseja depositar");
        dinheiroEntrada=leitor.nextDouble();
        
        dinheiroSaida = dinheiroEntrada*jurosFixo;
        
        System.out.println("O dinheiro que o senhor(a) receberá será R$ "+dinheiroSaida);
    }
    
}
