/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio1 
{
    public static void main (String[] args)
    {
        String data = JOptionPane.showInputDialog("Digite uma data: ");
        // dd/mm/YYYY Ex: 05/08/2014
        
        String dia = data.substring(0,2);
        String mes = data.substring(3,5);
        String ano = data.substring(6,10);
        
        String dataFormatada = ano + "-" + mes + "-" + dia;
                        
        JOptionPane.showMessageDialog(null, "Data Formatada = " + dataFormatada);
    }
}
