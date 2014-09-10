/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula3;

/**
 *
 * @author Multas
 */
import java.util.Scanner;

public class Area 
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        CalculaArea area = new CalculaArea();
        System.out.println("Informe a altura(m) do local:");
        int altura = scan.nextInt();
        System.out.println("Informe a largura(m) do local:");
        int largura = scan.nextInt(); 
                        
        System.out.println("Área do local = " + area.calcularArea(altura,largura) + "m²");
    }
}
