/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;
import Dado.Aluno;
import Controle.IODado;
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
        IODado arquivo = new IODado("C:\\Users\\d119322\\Documents\\NetBeansProjects\\DACCad\\teste.txt");
        Scanner sc = new Scanner( System.in );
        
        System.out.println("Digite seu nome:"+'\n');
        //nome = sc.next();
    }
    
}
