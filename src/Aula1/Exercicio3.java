/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aula1;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio3 
{
    /* Crie um algorítmo para receber um número via teclado. Imprima todos os 
       números que estão no intervalo desse número e de 50.
    */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero ");
        int num = scan.nextInt();
                        
            while ((num > 0) && (num < 50))
            {
                System.out.println(num);
                num++;
            }    
    }
}
