/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula8;

/**
 *
 * @author Aluno
 */
public class Funcionario 
{
    private String nome;
    private int horasTrabalhadas;
    private int horasExtras;
    
    
    public Funcionario(String nome){  // construtor
    this.nome = nome;
    }
        //alt + insert
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    
    public double getSalarioTotal(double valorHora, double valorHoraExtra) {
        double salarioTotal = (this.horasTrabalhadas * valorHora) + (this.horasExtras * valorHoraExtra);
        return salarioTotal;
       }
    
    
}
