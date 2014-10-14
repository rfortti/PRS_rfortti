/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula01;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exemplo2 
{
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        
        /* Pegar um inteiro do teclado. Se for maior que 5
           Imprimir o seu dobro, senão imprimir o seu triplo
        */
        
        System.out.println("Digite um numero inteiro");
        int numero = scan.nextInt();
        
        if (numero > 5)
        {
            System.out.println(numero * 2);
        }
        else
        {
            System.out.println(numero * 3);
        }
    }
}
