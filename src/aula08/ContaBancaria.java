/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula08;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String historico;
    
    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.historico = this.historico + "Conta " + numeroConta + " criada.";
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        this.historico = this.historico + "\nDeposito efetuado no valor de: "
         + valor + ". Novo saldo: " + String.valueOf(this.saldo);
    }
    
    public void sacar(double valor){
        if(valor > this.saldo){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
        else{
            this.saldo = this.saldo - valor;
            this.historico = this.historico + "\nSaque efetuado no valor de: "
                    + valor + ". Novo saldo: " + String.valueOf(this.saldo);
        }
    }
    
    public String consultarSaldo(){
        this.saldo = this.saldo - 0.25;
        String mensagem = "Conta numero: "
        + this.numeroConta + ", e saldo: " + this.saldo;
        this.historico =  this.historico + String.valueOf("\nConsulta de saldo (taxa de "
                + "0.25. Novo saldo: " + this.saldo);
        return mensagem;
    }
    
    public void aplicarReajuste(){
        this.saldo = this.saldo + (this.saldo * 2/100);
        this.historico = this.historico + "\nReajuste aplicado. Novo"
                + "saldo: " + String.valueOf(this.saldo);
    }
    
    public String exibirHistorico(){  
        return " Historico da conta " + this.numeroConta + ":\n " + this.historico;
    } 
}
