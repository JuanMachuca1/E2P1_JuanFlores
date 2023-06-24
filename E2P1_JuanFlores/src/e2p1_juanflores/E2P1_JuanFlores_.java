/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e2p1_juanflores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan David
 */

public class E2P1_JuanFlores_ extends javax.swing.JFrame {

    static Scanner leer = new Scanner (System.in);
    static Scanner leer2 = new Scanner (System.in);
     ArrayList<Numero> Lista = new ArrayList<>();   
     
     Numero M = new Numero();
    /**
     * Creates new form E2P1_JuanFlores_
     */
    public E2P1_JuanFlores_() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("EXAMEN II");

        jButton1.setText("Numeros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Operaciones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cont=0;
        boolean Sub = true;
        
        while(Sub){
            System.out.println("""
                               Menu Numeros
                               1.Agregar un numero
                               2.Eliminar numero
                               3.Menu Principal
                               Ingrese una opcion: 
                               """);
            int opcion=leer.nextInt();
           switch(opcion){
               case 1:
                   cont++;
                   System.out.println("Ingrese un numero: ");
                   int num = leer.nextInt();
                   
                   while(num<=1){
                       System.out.println("Ingrese un numero positivo: ");
                       num=leer.nextInt();
                       
                   }
                   
                   System.out.println("Ingrese la base del numero a convertir: ");
                   int bas=leer.nextInt();
                   
                   
                   while(bas<2||bas>35){
                       System.out.println("Ingrese una base correcto [2-35]: ");
                       bas=leer.nextInt(); 
                       
                   }
                   Numero nums = new Numero(bas,num);
                   
                   Lista.add(nums);
                   
                   
                   
                   System.out.println("Numero agregado correctamente");
                   
                   
                   
                   
                   
                   break;
                   
               case 2:
                   if(cont>0){
                   M.Print(Lista);
                   
                   System.out.println("Ingrese el indice del numero que desea eliminar: ");
                   int ind=leer.nextInt();
                   
                   while(ind>Lista.size()){
                       System.out.println("ingrese un indice menor");
                       ind=leer.nextInt();
                       
                   }
                   
                   M.Eliminar(Lista, ind);
                   }else{
                       System.out.println("debes agregar un valor primero...");
                   }
                   break;
                   
               case 3:
                   Sub=false;
                   this.pack();
                   this.setLocationRelativeTo(this);
                   this.setVisible(true);
                   break;
                   
               default:
                   System.out.println("opcion invalida.. ");
                   
                   break;
               
           }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("Menú Operaciones ");
        
        boolean SubM = true;
        
        while(SubM){
            
            System.out.println("""
                               1.Sumar numeros
                               2.Restar numeros
                               3.Multiplicar numeros
                               4.Menu Principal
                               Ingrese una opcion: 
                               """);
            int opcionM=leer.nextInt();
           switch(opcionM){
               case 1:
                   
                   System.out.println("suma");
                   System.out.println("Ingrese");
                   break;
                   
               case 2:
                   System.out.println("restar");
                   
                   break;
                   
               case 3:
                   System.out.println("Multiplicacion");
                   
                   break;
               case 4:
                   
                   SubM=false;
                   this.pack();
                   this.setLocationRelativeTo(this);
                   this.setVisible(true);
                   
                   break;
                   
               default:
                   System.out.println("opcion invalida.. ");
                   
                   break;
               
           }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E2P1_JuanFlores_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
