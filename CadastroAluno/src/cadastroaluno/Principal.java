/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;
import Dado.Aluno;
import Controle.IODado;
import Controle.IOIndice;
import java.util.Scanner;
/**
 *
 * @author d119322
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        Aluno pessoa = new Aluno();
        
//        System.out.println("Digite seu nome:"+'\n');
//        pessoa.setNome(sc.next());
//        System.out.println("Digite seu RA:"+'\n');
//        pessoa.setRA(sc.next());
//        System.out.println("Digite seu CPF:"+'\n');
//        pessoa.setCPF(sc.next());
//        System.out.println("Digite sua Idade:"+'\n');
//        pessoa.setIdade(sc.next());
//        pessoa.setNome("Nome");
//        pessoa.setRA("RA");
//        pessoa.setCPF("CPF");
//        pessoa.setIdade("Idade"); 
        
   //     System.out.println("Digite seu nome:"+'\n');
        pessoa.setNome("Dionys");
   //     System.out.println("Digite seu RA:"+'\n');
        pessoa.setRA("119322");
  //      System.out.println("Digite seu CPF:"+'\n');
        pessoa.setCPF("41685510833");
 //       System.out.println("Digite sua Idade:"+'\n');
        pessoa.setIdade("23");    
        
        
        
        
    }
    
}
