/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dolartoreal;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        
        double mReal=0d, mDolar=0d, mCotacao=0d;
        
        System.out.println("Informe quantos dolars você deseja converter");
        mDolar=leitor.nextDouble();
        
        System.out.println("Informe a cotação atual do Dolar pro Real");
        mCotacao=leitor.nextDouble();
        
        mReal=mDolar*mCotacao;
        
        System.out.println("Seus $ "+mDolar+" equivalem a R$ "+mReal);
    }
    
}
