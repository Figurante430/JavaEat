/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.javaeat.interfaz;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import poo.javaeat.ClaseUtil;
import poo.javaeat.Cliente;

/**
 *
 * @author gonza
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        setLocationRelativeTo(null);
        initComponents();
        ClaseUtil.loadDataRes();
        ClaseUtil.loadDataCom();
        ClaseUtil.loadDataUsu();
        ClaseUtil.loadDataPed();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void getImagen() {
        try {
            labelLogo.setSize(244, 180);
            ImageIcon imagen = new ImageIcon("imagenes/JavaEatLogo.png");
            //Se redimensiona
            ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), 1));
            labelLogo.setIcon(imgRedimensionada);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        logoBG = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        bienvenidaLabel = new javax.swing.JLabel();
        iniSesLabel = new javax.swing.JLabel();
        usuLabel = new javax.swing.JLabel();
        usuText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        iniSesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        logoBG.setBackground(new java.awt.Color(255, 255, 102));

        getImagen();

        bienvenidaLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        bienvenidaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenidaLabel.setText("BIENVENIDO A JAVAEAT");
        bienvenidaLabel.setToolTipText("");

        javax.swing.GroupLayout logoBGLayout = new javax.swing.GroupLayout(logoBG);
        logoBG.setLayout(logoBGLayout);
        logoBGLayout.setHorizontalGroup(
            logoBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bienvenidaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(logoBGLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        logoBGLayout.setVerticalGroup(
            logoBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoBGLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bienvenidaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        iniSesLabel.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        iniSesLabel.setText("INICIAR SESIÓN");

        usuLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        usuLabel.setText("USUARIO");

        usuText.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        usuText.setForeground(new java.awt.Color(204, 204, 204));
        usuText.setText("Ingrese su nombre de usuario");
        usuText.setBorder(null);
        usuText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuTextMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        passLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        passLabel.setText("CONTRASEÑA");

        passText.setForeground(new java.awt.Color(204, 204, 204));
        passText.setText("jPasswordField1");
        passText.setBorder(null);
        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passTextMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        iniSesButton.setBackground(new java.awt.Color(255, 255, 104));
        iniSesButton.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        iniSesButton.setText("ENTRAR");
        iniSesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniSesButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setText("Si no estás registrado, registrate");

        jButton2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton2.setText("AQUÍ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(iniSesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usuText, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passText)
                        .addComponent(jSeparator2))
                    .addComponent(iniSesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(logoBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(iniSesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuText, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iniSesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosing(java.awt.event.WindowEvent evt) { 
        ClaseUtil.guardarDatos();
    }
    /**Se abre la ventana del registro
     * 
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaRegistro v =new VentanaRegistro(this,true);
    }//GEN-LAST:event_jButton2ActionPerformed

    //Botón incio de sesión
    private void iniSesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniSesButtonActionPerformed
        int pos = ClaseUtil.isRegistrado(ClaseUtil.getUsuarios(), usuText.getText());
        System.out.println(pos);
        if (usuText.getText().equals("admin@javaeat.com") && passText.getText().equals("admin")){
            VentanaAdmin vA = new VentanaAdmin (this,true);
        }
        else if (pos == -1) {    
           JOptionPane.showMessageDialog(this, "Este usuario no existe", "usuario no encontrado", JOptionPane.OK_OPTION);
        }
        else {
            if (ClaseUtil.getUsuarios().get(pos).getClave().equals(passText.getText())) {
                VentanaCliente vC = new VentanaCliente(this, true, ClaseUtil.getUsuarios().get(pos));
            }
            else {
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta, inténtalo de nuevo", "Constraseña inválida", JOptionPane.OK_OPTION);
            }
        }
        
    }//GEN-LAST:event_iniSesButtonActionPerformed

    private void usuTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuTextMouseClicked
        // TODO add your handling code here:
        usuText.setText("");
    }//GEN-LAST:event_usuTextMouseClicked

    private void passTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMouseClicked
        // TODO add your handling code here:
        passText.setText("");
    }//GEN-LAST:event_passTextMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel bienvenidaLabel;
    private javax.swing.JButton iniSesButton;
    private javax.swing.JLabel iniSesLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPanel logoBG;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passText;
    private javax.swing.JLabel usuLabel;
    private javax.swing.JTextField usuText;
    // End of variables declaration//GEN-END:variables
}
