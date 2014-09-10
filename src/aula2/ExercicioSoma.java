/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ExercicioSoma 
{
    public static void main (String[] args)
    {
        String numero1 = JOptionPane.showInputDialog("Digite um número");
        String numero2 = JOptionPane.showInputDialog("Digite outro número");
     
        try
        {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
        
            JOptionPane.showMessageDialog(null, "A soma é = " + (num1 + num2));
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Número Inválido");
        }
    }
}
