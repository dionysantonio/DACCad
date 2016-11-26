/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import java.io.RandomAccessFile;
import java.io.IOException;
import Dado.Aluno;

/**
 *
 * @author d119322
 */
public class IOIndice {

   
    private RandomAccessFile arquivo;
    
    public IOIndice(String caminho){
        try{
        RandomAccessFile file = new RandomAccessFile(caminho, "rwd");
        arquivo = file;
        }catch(IOException e){
            System.out.println(e.getCause());
        }
    }
    
    public long getTam(){
        try{
            return arquivo.length();
        }catch(IOException e){
            System.out.println(e.getCause());
            return 0;
        }
    }
    
    public void escreverIndP(String s){
        try{
            if(arquivo.length()>0)
                arquivo.seek(arquivo.length());
            arquivo.writeBytes(s+"\r\n");
        }catch(IOException e){
            System.out.println(e.getCause());
        }
    }
    
    public void atualiza(String parametro){
        long i;
        long posFim;
        long posIni;
        String[] dado;
        
         
        try{
            arquivo.seek(0); 
            while(arquivo.getFilePointer()<arquivo.length()){
                String linha = arquivo.readLine();
                dado =linha.split("\\|");
                
                if (dado[0].equals(parametro)){
                    posFim = arquivo.getFilePointer();
                    posIni = (arquivo.getFilePointer()-(linha.length()))-2;
                    i= posIni;
                    arquivo.seek(posIni);
                    while(i<posFim-2){
                        arquivo.writeBytes(" ");
                        i++;
                    }
                }
            }
            
        }catch(IOException e){
            System.out.println(e.getCause());
        }
                
    }
    
    public String busca(String parametro){
        String[] dado;
        try{
            
            while(arquivo.getFilePointer()<arquivo.length()){
                String linha = arquivo.readLine();
                dado =linha.split("\\|");
                
                if (dado[0].equals(parametro)){
                    return dado[1];
                }
            }
            return null;
        }catch(IOException e){
            System.out.println(e.getCause());
        }
        return null;
    }
    
    public void finalizar(){
        try{
          arquivo.close();
        }catch(IOException e){
            System.out.println(e.getCause());
        }
        
    }
    public void setPos(long pos){
        
        try{
            arquivo.seek(pos);
        }catch(IOException e){
            System.out.println(e.getCause());
        }
    }
    public long getPos(){
        try{
            return arquivo.getFilePointer();
        }catch(IOException e){
            System.out.println(e.getCause());
            return 0;
        }
    }
    
    public String[] lerLinha(long pos){
        String[] dado;
        try{
            arquivo.seek(pos);
            String linha = arquivo.readLine();
            dado =linha.split("\\|");
            return dado;
        }catch(IOException e){
            System.out.println(e.getCause());
            return null;
        }
    }
}
