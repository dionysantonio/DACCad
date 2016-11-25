/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dado;

/**
 *
 * @author d119322
 */
public class Aluno {
    private String RA;
    private String nome;
    private String idade;
    private String CPF;
    
    public String getNome(){
        return nome;
    }
    
    public String getRA(){
        return RA;
    }
    
    public void setRA(String numero){
        RA = numero;
    }
    
    public void setNome(String name){
        nome = name;
    }
    
    public void setCPF(String numero){
        CPF = numero;
    }
    
    public void setIdade(String numero){
        idade = numero;
    }
    
    public String getIdade(){
        return idade;
    }
    
    public String getCPF(){
        return CPF;
    }
    
}