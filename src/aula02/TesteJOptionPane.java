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
public class TesteJOptionPane 
{
    public static void main (String[] args)
    {
        //JOptionPane.showMessageDialog(null, "Hello World !");
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        JOptionPane.showMessageDialog(null, "Hello " + nome);
        
        int verifica = JOptionPane.showConfirmDialog(null, "É sua 1ª vez aqui ?");
        
        if (verifica == 0)//Botão Sim = 0
        {
            JOptionPane.showMessageDialog(null, "Então seja bem-vindo !");
        }
        if (verifica == 1)//Botão Não = 1
        {
            JOptionPane.showMessageDialog(null, "Bem-vindo denovo !");
        }
        if (verifica == 2)//Botão Cancelar = 2
        {
            JOptionPane.showMessageDialog(null, "Desculpe !");
        }
    }
}
