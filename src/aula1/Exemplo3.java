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
public class Exemplo3 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        
        int x = 10;
        
        while (x > 0)
        {
            System.out.println(x);
            x--;
        }
    }
    
}
