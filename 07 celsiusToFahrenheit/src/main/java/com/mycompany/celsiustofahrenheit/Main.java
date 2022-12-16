/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celsiustofahrenheit;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double C = 0d, F = 0d;
                
        System.out.println("Informe a temperatura em Celsius que deseja converter em Fahrenheit");
        C=leitor.nextDouble();
        
        F=(9*C+160) / 5;
        
        System.out.println("A temperatura de "+C+" ºC equivale a temperatura de "+F+" ºF");
    }

}
