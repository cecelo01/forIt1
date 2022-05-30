/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.forit1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Marce
 */
public class ForIt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {1,7,8,6}; 
        Arrays.sort(v); //organiza o array de forma crescente
        
        for(int valor: v){
            System.out.println("Valor "+valor);
        }
    }
    
}
