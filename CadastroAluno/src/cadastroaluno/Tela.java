/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;

import Controle.IODado;
import Controle.IOIndice;
import Dado.Aluno;
import Controle.IODado;
import Controle.IOIndice;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author d119322
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextCPF = new javax.swing.JTextField();
        jTextNome = new javax.swing.JTextField();
        jTextRA = new javax.swing.JTextField();
        jTextIdade = new javax.swing.JTextField();
        jButtonCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextBusca = new javax.swing.JTextField();
        jButtonCadastro1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("Cadastro");
        jTabbedPane1.setName("Cadastro"); // NOI18N

        jTextCPF.setText("CPF");

        jTextNome.setText("Nome");

        jTextRA.setText("RA");

        jTextIdade.setText("Idade");

        jButtonCadastro.setText("Cadastrar");
        jButtonCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastroMouseClicked(evt);
            }
        });

        jLabel1.setText("Aguardando");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextRA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextCPF)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastro)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastro)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jTextBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscaActionPerformed(evt);
            }
        });

        jButtonCadastro1.setText("Buscar");
        jButtonCadastro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastro1MouseClicked(evt);
            }
        });

        jLabel2.setText("Resultado: ");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Nome", "CPF", "RA" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastro1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jButtonCadastro1))))
                .addGap(72, 72, 72))
        );

        jTabbedPane1.addTab("Busca", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Indice", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Cadastro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastroMouseClicked
        // TODO add your handling code here:
        IODado arquivo = new IODado("src\\dados.txt");
        
        
        //Escrita nos indices
        IOIndice indiceRA = new IOIndice("src\\indiceRA.txt");
        indiceRA.escreverIndP(jTextRA.getText()+'|'+arquivo.getTam());
        IOIndice indiceNome = new IOIndice("src\\IndiceSec.txt");
        indiceNome.escreverIndP(jTextNome.getText()+'|'+jTextRA.getText());
        IOIndice indiceCPF = new IOIndice("src\\indiceCPF.txt");
        indiceCPF.escreverIndP(jTextCPF.getText()+'|'+arquivo.getTam());
        //Escrita no Arquivo
        arquivo.escrever(jTextRA.getText()+"|"+jTextNome.getText()+"|"+jTextIdade.getText()+"|"+jTextCPF.getText()+"#");
        
        jTextRA.setText("");
        jTextNome.setText("");
        jTextIdade.setText("");
        jTextCPF.setText("");
        jLabel1.setText("Cadastrado!");
        
        arquivo.finalizar();
    }//GEN-LAST:event_jButtonCadastroMouseClicked

    private void jButtonCadastro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastro1MouseClicked
        // TODO add your handling code here:
        String aux;
        IODado arquivo = new IODado("src\\dados.txt");
        Aluno aux1 = new Aluno();
        long time1 = System.nanoTime();
        long time2;
        long time3;
        
        switch(jList1.getSelectedIndex()){
            case 0:
                IOIndice indiceNome = new IOIndice("src\\IndiceSec.txt");
                IOIndice indiceRA1 = new IOIndice("src\\indiceRA.txt");
                
                aux = indiceNome.busca(jTextBusca.getText());
                aux= indiceRA1.busca(aux);
                jLabel2.setText(aux);
                if(aux!=null){
                    aux1 = arquivo.ler(Long.parseLong(aux));
                    time2 = System.currentTimeMillis();
                    jLabel2.setText("<html>"+
                            "RA: "+aux1.getRA()+"<br />"+
                            "Nome: "+aux1.getNome()+"<br />"+
                            "CPF: "+aux1.getCPF()+"<br />"+
                            "Idade: "+aux1.getIdade() +                           
                            "<br />Tempo de consulta: " + (time2 - time1)/1000+" milissegundos.</html>");
                }else{
                    time3 = System.nanoTime();
                    
                    jLabel2.setText("<html>Não encontrado!" + "<br />Tempo de consulta: " + (time3 - time1)/1000+" milissegundos.</html>");
                }
                break;
            case 1:
                IOIndice indiceCPF = new IOIndice("src\\indiceCPF.txt");
                
                aux = indiceCPF.busca(jTextBusca.getText());
                jLabel2.setText(aux);
                if(aux!=null){
                    aux1 = arquivo.ler(Long.parseLong(aux));
                    time2 = System.currentTimeMillis();
                    jLabel2.setText("<html>"+
                            "RA: "+aux1.getRA()+"<br />"+
                            "Nome: "+aux1.getNome()+"<br />"+
                            "CPF: "+aux1.getCPF()+"<br />"+
                            "Idade: "+aux1.getIdade() +                           
                            "<br />Tempo de consulta: " + (time2 - time1)/1000+" milissegundos.</html>");
                }else{
                    time3 = System.nanoTime();
                    
                    jLabel2.setText("<html>Não encontrado!<br />Tempo de consulta: " + (time3 - time1)/1000+" milissegundos.</html>");
                }
                break;
            case 2:
                IOIndice indiceRA = new IOIndice("src\\indiceRA.txt");
                
                aux = indiceRA.busca(jTextBusca.getText());
                jLabel2.setText(aux);
                if(aux!=null){
                    aux1 = arquivo.ler(Long.parseLong(aux));
                    time2 = System.currentTimeMillis();
                    jLabel2.setText("<html>"+
                            "RA: "+aux1.getRA()+"<br />"+
                            "Nome: "+aux1.getNome()+"<br />"+
                            "CPF: "+aux1.getCPF()+"<br />"+
                            "Idade: "+aux1.getIdade() +                           
                            "<br />Tempo de consulta: " + (time2 - time1)/1000+" milissegundos.</html>");
                }else{
                    time3 = System.nanoTime();
                    
                    jLabel2.setText("<html>Não encontrado!<br />Tempo de consulta: " + (time3 - time1)/1000+" milissegundos.</html>");
                }
                break;
            default:
                jLabel2.setText("Selectione uma opção e clique no botão buscar.");
                break;
        }
            
        
        
    }//GEN-LAST:event_jButtonCadastro1MouseClicked

    private void jTextBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonCadastro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextBusca;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextIdade;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextRA;
    // End of variables declaration//GEN-END:variables
}
