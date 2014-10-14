/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhot1;

/**
 *
 * @author Aluno
 */
public class Estrutura 
{
    private Aluno[] a; // cria a referência para um vetor do tipo Aluno
    private int n = 0; // n controla quantos elementos o vetor terá
    private int ind = 0; // especifica o indice do vetor

    public Estrutura(int qdeAlunos) // método construtor
    {
        n = qdeAlunos;
        a = new Aluno[n]; // cria o vetor ...
    }

    public int size() // retorna o tamanho do vetor Aluno
    {
        return n;
    }
    
    public int indice() // retorna o índice do vetor Aluno
    {
        return ind;
    }
    
    public void insert(String nome, double nE, double nT, double nP) // insere o elemento no vetor (inserção DESORDENADA)
   {      
      Aluno aluno = new Aluno(nome); // insere o elemento na posição necessária
      aluno.setNE(nE); // chama a classe para inserir a nota de exercicio do aluno
      aluno.setNT(nT); // chama a classe para inserir a nota de trabalho do aluno
      aluno.setNP(nP); // chama a classe para inserir a nota de prova do aluno
      a[ind] = aluno;
      ind++; // incrementa a variavel de controle de tamanho
   }
    
    public String getRelatorio()
    {        
        String rel = "";
        
        for (int i = 0; i < ind; i++) 
        {
            rel += a[i].getNome() + "................................." 
                    + Double.toString(a[i].CalculaMedia()) + "\n";
        }
        return rel;
    }
    
    public int getAprovado()
    {
        int cont = 0;
                
        for (int i = 0; i < ind; i++) 
        {
            if (a[i].Aprovado())
                cont++;
        }
        return cont;
    }
    
    public String getAlunoAprovado()
    {
        String nome = "";
                
        for (int i = 0; i < ind; i++) 
        {
            if (a[i].Aprovado())
                nome += a[i].getNome() + "\n";
        }
        return nome;
    }
    
    public int getReprovado()
    {
        int cont = 0;
                
        for (int i = 0; i < ind; i++) 
        {
            if (a[i].Reprovado())
                cont++;
        }
        return cont;
    }
    
    public String getAlunoReprovado()
    {
        String nome = "";
                
        for (int i = 0; i < ind; i++) 
        {
            if (a[i].Reprovado())
                nome += a[i].getNome() + "\n";
        }
        return nome;
    }
    
    public int getRecuperacao()
    {
        int cont = 0;
                
        for (int i = 0; i < ind; i++) 
        {
            if (a[i].Recuperacao())
                cont++;
        }
        return cont;
    }
    
    public String getAlunoRecuperacao()
    {
        String nome = "";
                
        for (int i = 0; i < ind; i++) 
        {
            if (a[i].Recuperacao())
                nome += a[i].getNome() + "\n";
        }
        return nome;
    }
    
    public double getMediaTurma(){
        double cont = 0;
        for (int i = 0; i < ind; i++) {
            cont += a[i].CalculaMedia();
        }
        return cont / ind;
    }
    public String getMaiorNota(){
        double maior = 0;
        for (int i = 0; i < ind; i++) {
            if (a[i].CalculaMedia() > maior)
                maior = a[i].CalculaMedia();
        }
        
        String nomeMaN = "";
        for (int i = 0; i < ind; i++) {
            if (a[i].CalculaMedia() == maior)
                nomeMaN += a[i].getNome() + " - Nota: " + Double.toString(maior) + "\n";
        }
        
        return nomeMaN;
    }
    
    public String getMenorNota(){
        double menor = 10;
        for (int i = 0; i < ind; i++) {
            if (a[i].CalculaMedia() < menor)
                menor = a[i].CalculaMedia();
        }
        
        String nomeMeN = "";
        for (int i = 0; i < ind; i++) {
            if (a[i].CalculaMedia() == menor)
                nomeMeN += a[i].getNome() + " - Nota: " + Double.toString(menor) + "\n";
        }
        
        return nomeMeN;
    }
}
