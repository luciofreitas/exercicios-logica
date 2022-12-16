/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consumomedioauto;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double dist=0d, combustivelGasto=0d, media ;
        
        System.out.println("Informe a distancia que irá percorrer em km");
        dist=leitor.nextDouble();
        System.out.println("Informe o total de combustivel gasto");
        combustivelGasto=leitor.nextDouble();
        media=dist/combustivelGasto;
        System.out.println("O consumo médio do combustível do automóvel é: "+media);
    }
}
