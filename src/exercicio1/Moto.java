/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio1;

/**
 *
 * @author Aluno
 */
public class Moto extends Veiculo
{
    public void Andar (int distancia, int velocidade)
    {
       int consumo = 0;
       int combInicial = quantCombustivel;
       
       if (velocidade <= 100)
       {
           consumo = distancia / 25;
       }
       else
       {
           consumo = distancia / 18;
       }
       
       Ligar();
       quantCombustivel = quantCombustivel - consumo;
       exibirInformacoes(combInicial, velocidade, distancia);
    }
}
