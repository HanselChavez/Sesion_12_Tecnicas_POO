/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Calculadora;
import ExcepcionesPersonalizadas.ExcepcionDividir0;
import ExcepcionesPersonalizadas.ExcepcionFormatoNumerico;

import javax.swing.JOptionPane;

/**
 *
 * @author HanselChavez
 */
public class PantallaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private Calculadora casio;
    public PantallaCalculadora() {
        initComponents();
        agregarBotones();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        lblresultado = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        btnRestar = new javax.swing.JRadioButton();
        btnSumar = new javax.swing.JRadioButton();
        btnMultiplicar = new javax.swing.JRadioButton();
        btnDivir = new javax.swing.JRadioButton();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(41, 78, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalcular.setBackground(new java.awt.Color(18, 179, 18));
        btnCalcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 119, 40));

        lblresultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblresultado.setForeground(new java.awt.Color(255, 255, 255));
        lblresultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblresultado.setText("Resultado");
        lblresultado.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 1, 2, 1)));
        jPanel1.add(lblresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 230, 180, 23));

        txtA.setBackground(new java.awt.Color(41, 78, 226));
        txtA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtA.setForeground(new java.awt.Color(255, 255, 255));
        txtA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        jPanel1.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 162, 35));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 262, -1));

        txtB.setBackground(new java.awt.Color(41, 78, 226));
        txtB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtB.setForeground(new java.awt.Color(255, 255, 255));
        txtB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        jPanel1.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 162, 35));

        btnRestar.setBackground(new java.awt.Color(41, 78, 226));
        btnRestar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestar.setText("Restar");
        btnRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 75, -1));

        btnSumar.setBackground(new java.awt.Color(41, 78, 226));
        btnSumar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(255, 255, 255));
        btnSumar.setText("Sumar");
        btnSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 85, -1));

        btnMultiplicar.setBackground(new java.awt.Color(41, 78, 226));
        btnMultiplicar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btnDivir.setBackground(new java.awt.Color(41, 78, 226));
        btnDivir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDivir.setForeground(new java.awt.Color(255, 255, 255));
        btnDivir.setText("Dividir");
        btnDivir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDivir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 75, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/24wtclose.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 11, -1, -1));

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/24wtminimize-sign.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });
        jPanel1.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 11, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        lblresultado.setText("");
        
        double resultado = 0;
        casio = new Calculadora();           
        try {
            double a= convertirToDouble(txtA.getText());
            double b = convertirToDouble(txtB.getText());
            casio.setValorA(a);
            casio.setValorB(b);    
            if(btnSumar.isSelected())
                resultado = casio.Sumar();
            if(btnRestar.isSelected())
                resultado = casio.Restar();
            if(btnMultiplicar.isSelected())
                resultado = casio.Multiplicar();       
            if(btnDivir.isSelected())
               resultado = casio.Dividir();
            lblresultado.setText("Resultado: "+redondearNumero(resultado));
            lblresultado.setVisible(true);
        } catch (ExcepcionDividir0 | ExcepcionFormatoNumerico | NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setExtendedState(PantallaCalculadora.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel btnClose;
    private javax.swing.JRadioButton btnDivir;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JRadioButton btnMultiplicar;
    private javax.swing.JRadioButton btnRestar;
    private javax.swing.JRadioButton btnSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    // End of variables declaration//GEN-END:variables
    
    private void agregarBotones() {
        lblresultado.setText("");
        lblresultado.setVisible(false);
        btnSumar.setSelected(true);
        Grupo.add(btnDivir);
        Grupo.add(btnMultiplicar);
        Grupo.add(btnSumar);
        Grupo.add(btnRestar);
    }
    private static String redondearNumero(double numero) {
        if (numero % 1 == 0)       
            return String.format("%.0f", numero);
         else       
            return String.format("%.2f", numero);     
    }
    private double convertirToDouble(String dato) 
            throws ExcepcionFormatoNumerico {
        try {
            double datoDouble = Double.parseDouble(dato);
            return datoDouble;
        } catch (NumberFormatException e) {
            throw new ExcepcionFormatoNumerico();       
        }
    }
}