/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package poo.javaeat.interfaz;

import java.awt.HeadlessException;
import java.time.Instant;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ImageIcon;
import poo.javaeat.Direccion;
import poo.javaeat.Tarjeta;
import poo.javaeat.Empresa;
import poo.javaeat.Particular;
import poo.javaeat.ClaseUtil;
import poo.javaeat.CestaEmpresa;
import poo.javaeat.CestaParticular;
/**
 *
 * @author gonza
 */
public class VentanaRegistro extends java.awt.Dialog {
    
    /**
     * Creates new form VentanaRegistroD
     */
    public VentanaRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setLocationRelativeTo(null);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCliente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        formularioLabel = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        correoLabel = new javax.swing.JLabel();
        correoText = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        teleLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        calleLabel = new javax.swing.JLabel();
        calleText = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        cpLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        numTarLabel = new javax.swing.JLabel();
        titularLabel = new javax.swing.JLabel();
        titularText = new javax.swing.JTextField();
        fechaCadLabel = new javax.swing.JLabel();
        empresaCheck = new javax.swing.JCheckBox();
        particularCheck = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        dniLabel = new javax.swing.JLabel();
        dniText = new javax.swing.JTextField();
        webLabel = new javax.swing.JLabel();
        webText = new javax.swing.JTextField();
        cifLabel = new javax.swing.JLabel();
        cifText = new javax.swing.JTextField();
        registroButton = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        numTarText = new javax.swing.JFormattedTextField();
        teleText = new javax.swing.JFormattedTextField();
        numberText = new javax.swing.JFormattedTextField();
        cpText = new javax.swing.JFormattedTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formularioLabel.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        formularioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formularioLabel.setText("FORMULARIO DE REGISTRO");
        jPanel2.add(formularioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 290, 40));

        getImagen();
        jPanel2.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 110));

        correoLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        correoLabel.setText("Correo electrónico:");
        jPanel1.add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 20));

        correoText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        correoText.setForeground(new java.awt.Color(204, 204, 204));
        correoText.setText("ingrese su correo electronico");
        correoText.setBorder(null);
        correoText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoTextMouseClicked(evt);
            }
        });
        jPanel1.add(correoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 310, -1));

        passLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        passLabel.setText("Contraseña:");
        jPanel1.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, -1));

        passText.setForeground(new java.awt.Color(204, 204, 204));
        passText.setText("jPasswordField1");
        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passTextMouseClicked(evt);
            }
        });
        jPanel1.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 310, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 440, -1));

        nameLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nameLabel.setText("Nombre:");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, -1));

        teleLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        teleLabel.setText("Teléfono:");
        jPanel1.add(teleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 120, -1));

        nameText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nameText.setForeground(new java.awt.Color(204, 204, 204));
        nameText.setText("ingrese su nombre");
        nameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTextMouseClicked(evt);
            }
        });
        jPanel1.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 310, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 440, 10));

        calleLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        calleLabel.setText("Calle:");
        jPanel1.add(calleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 120, -1));

        calleText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        calleText.setForeground(new java.awt.Color(204, 204, 204));
        calleText.setText("ingrese su calle");
        calleText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calleTextMouseClicked(evt);
            }
        });
        jPanel1.add(calleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 310, 20));

        numberLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        numberLabel.setText("Número:");
        jPanel1.add(numberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        cpLabel.setText("Código Postal:");
        jPanel1.add(cpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 80, 20));

        cityLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cityLabel.setText("Ciudad:");
        jPanel1.add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 20));

        cityText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cityText.setForeground(new java.awt.Color(204, 204, 204));
        cityText.setText("ingrese su ciudad");
        cityText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityTextMouseClicked(evt);
            }
        });
        jPanel1.add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 380, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 367, 440, -1));

        numTarLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        numTarLabel.setText("Número de tarjeta:");
        jPanel1.add(numTarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 20));

        titularLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        titularLabel.setText("Titular:");
        titularLabel.setToolTipText("");
        jPanel1.add(titularLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 20));

        titularText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        titularText.setForeground(new java.awt.Color(204, 204, 204));
        titularText.setText("ingrese el titular de la tarjeta");
        titularText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titularTextMouseClicked(evt);
            }
        });
        jPanel1.add(titularText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 390, -1));

        fechaCadLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fechaCadLabel.setText("Fecha de caducidad:");
        jPanel1.add(fechaCadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, 20));

        grupoCliente.add(empresaCheck);
        empresaCheck.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        empresaCheck.setText("Empresa");
        empresaCheck.setDoubleBuffered(true);
        empresaCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                empresaCheckStateChanged(evt);
            }
        });
        jPanel1.add(empresaCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 140, 30));
        empresaCheck.getAccessibleContext().setAccessibleDescription("");

        grupoCliente.add(particularCheck);
        particularCheck.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        particularCheck.setText("Particular");
        particularCheck.setDoubleBuffered(true);
        particularCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                particularCheckStateChanged(evt);
            }
        });
        jPanel1.add(particularCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 130, 30));
        particularCheck.getAccessibleContext().setAccessibleDescription("");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 440, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("¿Cómo te quieres registrar?");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 250, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 440, -1));

        dniLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dniLabel.setText("DNI:");
        jPanel1.add(dniLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 40, 20));

        dniText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dniText.setForeground(new java.awt.Color(204, 204, 204));
        dniText.setText("ingrese su DNI");
        dniText.setEnabled(false);
        dniText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dniTextMouseClicked(evt);
            }
        });
        jPanel1.add(dniText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 390, -1));

        webLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        webLabel.setText("Web:");
        jPanel1.add(webLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, 20));

        webText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        webText.setForeground(new java.awt.Color(204, 204, 204));
        webText.setText("ingrese la web de su empresa");
        webText.setEnabled(false);
        webText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webTextMouseClicked(evt);
            }
        });
        jPanel1.add(webText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 390, -1));

        cifLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cifLabel.setText("CIF:");
        jPanel1.add(cifLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, 20));

        cifText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cifText.setForeground(new java.awt.Color(204, 204, 204));
        cifText.setText("ingrese el CIF de su empresa");
        cifText.setEnabled(false);
        cifText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cifTextMouseClicked(evt);
            }
        });
        jPanel1.add(cifText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 390, -1));

        registroButton.setBackground(new java.awt.Color(255, 255, 102));
        registroButton.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        registroButton.setText("REGISTRO");
        registroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 690, 160, 40));

        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1717093740000L), new java.util.Date(), null, java.util.Calendar.DAY_OF_WEEK_IN_MONTH));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 150, -1));

        try {
            numTarText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(numTarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 220, 30));

        try {
            teleText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ## ## ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(teleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 220, -1));

        try {
            numberText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(numberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 120, -1));

        try {
            cpText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(cpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 140, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 539, 820));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void getImagen() {
        try {
            labelLogo.setSize(100, 90);
            ImageIcon imagen = new ImageIcon("imagenes/JavaEatLogo.png");
            //Se redimensiona
            ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), 1));
            labelLogo.setIcon(imgRedimensionada);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    /**Si el checkButton de empresa cambia se te habilita o no el cif y la web
     * 
     * @param evt 
     */
    private void empresaCheckStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_empresaCheckStateChanged
        if (cifText.isEnabled() && webText.isEnabled()){
            cifText.setEnabled(false);
            webText.setEnabled(false);
        }
        else{
            cifText.setEnabled(true);
            webText.setEnabled(true);
        }
    }//GEN-LAST:event_empresaCheckStateChanged

    /**Si el checkButton de particular cambia se te habilita o no el dni
     * 
     * @param evt 
     */
    private void particularCheckStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_particularCheckStateChanged
        if (dniText.isEnabled()){
            dniText.setEnabled(false);
        }
        else{
            dniText.setEnabled(true);
        }
    }//GEN-LAST:event_particularCheckStateChanged

    /**Registra un nuevo usuario en la aplicacion
     * 
     * @param evt 
     */
    private void registroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroButtonActionPerformed
        try{
            //restringimos el campo de numero de tarjeta
            /**RestrictedTextField restricted = new RestrictedTextField(numTarText);
            restricted.setLimit(16);
            restricted.setOnlyNums(true);
            */
            //seteamos los valores en las casillas
            String correo=correoText.getText();
            String contrasenna =passText.getText();
            String nombre =nameText.getText();
            String telefono =teleText.getText();
            String calle =calleText.getText();
            Integer numero =Integer.parseInt(numberText.getText());
            String cp = cpText.getText();
            String ciudad = cityText.getText();
            String numeroTar = numTarText.getText();
            String titular = titularText.getText();
            Date fecha2 = (Date) jSpinner1.getValue();
            Instant instant = Instant.ofEpochMilli(fecha2.getTime());
            LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String string =localDate.format(formatoCorto);
            LocalDate fechaCad = LocalDate.parse(string, formatoCorto);
            Direccion d =new Direccion (calle,numero,cp,ciudad);
            Tarjeta t = new Tarjeta (titular,numeroTar,fechaCad);
            if (empresaCheck.isSelected()){
                String cif =cifText.getText();
                String web =webText.getText();
                CestaEmpresa cesta = new CestaEmpresa ();
                Empresa e =new Empresa (cif,web,nombre,d,t,telefono,contrasenna,correo,cesta);
                ClaseUtil.annadirUsuario(e);
            }
            else{ 
                String dni =dniText.getText();
                CestaParticular cesta =new CestaParticular();
                Particular p =new Particular (dni,nombre,d,t,telefono,contrasenna,correo,cesta);
                ClaseUtil.annadirUsuario(p);
            } 
            ClaseUtil.guardarDatos();
            JOptionPane.showMessageDialog(this, "Registro realizado, inicia sesión", "Registro Exitoso", JOptionPane.OK_OPTION);
            this.dispose();
        }
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Excepción al registrar, compruebe los datos", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_registroButtonActionPerformed

    
    
    private void correoTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoTextMouseClicked
        // TODO add your handling code here:
        correoText.setText("");
    }//GEN-LAST:event_correoTextMouseClicked

    private void passTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMouseClicked
        // TODO add your handling code here:
        passText.setText("");
    }//GEN-LAST:event_passTextMouseClicked

    private void nameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTextMouseClicked
        // TODO add your handling code here:
        nameText.setText("");
    }//GEN-LAST:event_nameTextMouseClicked

    private void calleTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calleTextMouseClicked
        // TODO add your handling code here:
        calleText.setText("");
    }//GEN-LAST:event_calleTextMouseClicked

    private void cityTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityTextMouseClicked
        // TODO add your handling code here:
        cityText.setText("");
    }//GEN-LAST:event_cityTextMouseClicked

    private void titularTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titularTextMouseClicked
        // TODO add your handling code here:
        titularText.setText("");
    }//GEN-LAST:event_titularTextMouseClicked

    private void dniTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dniTextMouseClicked
        // TODO add your handling code here:
        dniText.setText("");
    }//GEN-LAST:event_dniTextMouseClicked

    private void cifTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cifTextMouseClicked
        // TODO add your handling code here:
        cifText.setText("");
    }//GEN-LAST:event_cifTextMouseClicked

    private void webTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webTextMouseClicked
        // TODO add your handling code here:
        webText.setText("");
    }//GEN-LAST:event_webTextMouseClicked

    private void numTarText(java.awt.event.KeyEvent evt) {                                    
    if(numTarText.getText().length() >= 16)
    {
        evt.consume();
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calleLabel;
    private javax.swing.JTextField calleText;
    private javax.swing.JLabel cifLabel;
    private javax.swing.JTextField cifText;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityText;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JTextField correoText;
    private javax.swing.JLabel cpLabel;
    private javax.swing.JFormattedTextField cpText;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniText;
    private javax.swing.JCheckBox empresaCheck;
    private javax.swing.JLabel fechaCadLabel;
    private javax.swing.JLabel formularioLabel;
    private javax.swing.ButtonGroup grupoCliente;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel numTarLabel;
    private javax.swing.JFormattedTextField numTarText;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JFormattedTextField numberText;
    private javax.swing.JCheckBox particularCheck;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passText;
    private javax.swing.JButton registroButton;
    private javax.swing.JLabel teleLabel;
    private javax.swing.JFormattedTextField teleText;
    private javax.swing.JLabel titularLabel;
    private javax.swing.JTextField titularText;
    private javax.swing.JLabel webLabel;
    private javax.swing.JTextField webText;
    // End of variables declaration//GEN-END:variables
}
