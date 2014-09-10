/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula5;

/**
 *
 * @author Aluno
 */
public class Carro 
{
    private int capacidadeTanque;
    private int qtdCombustivel;
    
    public Carro (int capacidadeTanque)
    {
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public void abastecer (int qtdCombustivel)
    {
        if ((this.qtdCombustivel + qtdCombustivel) > this.capacidadeTanque)
        {
            System.out.println("Quantidade excede o limite do tanque !");
        }
        else
        {
            this.qtdCombustivel = this.qtdCombustivel + qtdCombustivel;
            System.out.println("Carro abastecido. Quantidade: " + this.qtdCombustivel + " litros");
        }
    }
}
