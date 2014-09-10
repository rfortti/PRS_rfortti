/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula1;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio2 
{
    /*Crie um algorítmo para imprimir todos os números pares de 1 a 100.
    */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
             
        int num = 0;
        
        for (num = 0; num <= 100; num++)
        {
            if (num % 2 == 0)
            {    
                System.out.println(num);
            }
        }
    }
}