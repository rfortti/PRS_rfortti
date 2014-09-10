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
public class Usuario 
{
    private String nome;
    private String login;
    private String senha;
    
    public void setNome (String nome) // método para definir o nome
    {
        this.nome = nome.toUpperCase();
    }
    
    public String getNome () // recupera (visualiza) o nome
    {
        return this.nome;
    }
    
    public void setLogin (String login) // método para definir o login
    {
        this.login = login.toLowerCase();
    }
    
    public String getLogin()
    {
        return this.login; 
    }
    
    public void setSenha (String senha) // método para definir a senha
    {
        if (senha.length() <= 16)
        {
            this.senha = senha;
        }
        else
        {
            System.out.println("A senha deve ter no máximo 16 caracteres !");
        }
    }
    
    public String getSenha()
    {
        return this.senha; 
    }
}
