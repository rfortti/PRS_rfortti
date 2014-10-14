/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhot1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Aluno 
{
    private String nomeAluno;
    private double nE, nT, nP;
    
    public Aluno(String nome)// método construtor
    {
        this.nomeAluno = nome;
    }
    public String getNome()
    {
        return nomeAluno;
    }
    
    public double getNE() 
    {
        return nE;
    }

    public void setNE(double notaE) 
    {
        this.nE = notaE;
    }

    public double getNT() 
    {
        return nT;
    }

    public void setNT(double notaT) 
    {
        this.nT = notaT;
    }

    public double getNP() 
    {
        return nP;
    }

    public void setNP(double notaP) 
    {
        this.nP = notaP;
    }
    
    public Double CalculaMedia()
    {
        double mediaFinal = (nE * 0.2) + (nT * 0.3) + (nP * 0.5);
        //String media = ("A media do aluno " + nomeAluno + " é " + mediaFinal);
        return mediaFinal;
    }
    
    public boolean Aprovado() 
    {
        return CalculaMedia() >= 6;
    }
    
    public boolean Reprovado() 
    {
        return CalculaMedia() < 4;
    }
    
    public boolean Recuperacao() 
    {
        return CalculaMedia() >= 4 && CalculaMedia() < 6;
    }
}
