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
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import poo.javaeat.Direccion;
import poo.javaeat.Tarjeta;
import poo.javaeat.Empresa;
import poo.javaeat.Particular;
import poo.javaeat.ClaseUtil;
import poo.javaeat.CestaEmpresa;
import poo.javaeat.CestaParticular;
import poo.javaeat.Cliente;
import poo.javaeat.Comida;
import poo.javaeat.Restaurante;
/**
 *
 * @author gonza
 */
public class vcPedirRestaurante extends javax.swing.JDialog {
    
    /**
     * Creates new form VentanaRegistroD
     */
    
    //Atributos 
    private Restaurante res; //cada vez que se abre una ventana, esta tiene un atributo que es el cliente (referencia al cliente que la abre o del que se trata
    private ArrayList<Comida> comidas;
    private DefaultTableModel dtm = new DefaultTableModel();
    private Cliente cliente = VentanaCliente.getCliente();
    private double precioCesta;
    
    //Constructores
    public vcPedirRestaurante(java.awt.Dialog parent, boolean modal, Restaurante res) {
        super(parent,modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.precioCesta = 0.0;
        this.res = res;
        this.comidas = res.getComidas();
        String columnas[] = {"NOMBRE", "INGREDIENTES", "PRECIO"};
        dtm.setColumnIdentifiers(columnas);
        tablaComidas.setModel(dtm);
        rellenaTabla();
        
        //Seteamos valores en casillas
        nameText.setText(res.getNombre());
        calificacionText.setText(Double.toString(res.getCalificacion())); 
        calleText.setText(res.getDir().getCalle());
        numberText.setText( Integer.toString(res.getDir().getNumero()));
        cpText.setText(res.getDir().getCP());
        cityText.setText(res.getDir().getCiudad());
        precioCestaText.setText(Double.toString(precioCesta));
        
        if (res.isCatering()) {
            cateringText.setText("Sí");
            if (cliente.getClass().getSimpleName().equals("Particular")) {
               pedirCateringButton.setVisible(false);
            }
        }
        else {
            cateringText.setText("No");
            pedirCateringButton.setVisible(false);
        }
        
        this.setVisible(true);
    }
        
    public void rellenaTabla() { 
        limpiaTabla();
        for (Comida comida : comidas) {
            dtm.addRow(new Object [] {comida.getTitulo(),comida.getIngredientes(),comida.getPrecio()});
        }
    }
    public void limpiaTabla() { //revisar
        int filas = dtm.getRowCount();
        for (int i = 0; i < filas; i++) {
            dtm.removeRow(0);
        }   
    }
    
    //Actions
    
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
        vaciarCestaButton = new javax.swing.JButton();
        terminarPedidoButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        calificacionLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        calleLabel = new javax.swing.JLabel();
        calleText = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        numberText = new javax.swing.JTextField();
        cpLabel = new javax.swing.JLabel();
        cpText = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        cateringLabel = new javax.swing.JLabel();
        calificacionText = new javax.swing.JTextField();
        pedirCateringButton = new javax.swing.JButton();
        volverButton = new javax.swing.JButton();
        precioCestaLabel = new javax.swing.JLabel();
        cateringText = new javax.swing.JTextField();
        cityLabel1 = new javax.swing.JLabel();
        verComidaButton1 = new javax.swing.JButton();
        precioCestaText = new javax.swing.JTextField();
        nameLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComidas = new javax.swing.JTable();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formularioLabel.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        formularioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formularioLabel.setText("Restaurante");
        jPanel2.add(formularioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 540, 40));

        vaciarCestaButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vaciarCestaButton.setText("VACIAR CESTA");
        vaciarCestaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarCestaButtonActionPerformed(evt);
            }
        });
        jPanel2.add(vaciarCestaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 60));

        terminarPedidoButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        terminarPedidoButton1.setText("TERMINAR PEDIDO");
        terminarPedidoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarPedidoButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(terminarPedidoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 160, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 110));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 440, -1));

        calificacionLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        calificacionLabel.setText("Calificación:");
        jPanel1.add(calificacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 80, -1));

        nameText.setEditable(false);
        nameText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        jPanel1.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 310, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 440, 10));

        calleLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        calleLabel.setText("Calle:");
        jPanel1.add(calleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, -1));

        calleText.setEditable(false);
        calleText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        calleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calleTextActionPerformed(evt);
            }
        });
        jPanel1.add(calleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 310, 30));

        numberLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        numberLabel.setText("Número:");
        jPanel1.add(numberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        numberText.setEditable(false);
        numberText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        numberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTextActionPerformed(evt);
            }
        });
        jPanel1.add(numberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        cpLabel.setText("Código Postal:");
        jPanel1.add(cpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 80, 20));

        cpText.setEditable(false);
        cpText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cpText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpTextActionPerformed(evt);
            }
        });
        jPanel1.add(cpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 150, -1));

        cityLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cityLabel.setText("Comida ofrecida:");
        jPanel1.add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 120, 30));

        cityText.setEditable(false);
        cityText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 380, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 343, 440, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 440, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 440, -1));

        cateringLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cateringLabel.setText("Catering:");
        jPanel1.add(cateringLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 60, 30));

        calificacionText.setEditable(false);
        calificacionText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(calificacionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 50, -1));

        pedirCateringButton.setBackground(new java.awt.Color(255, 255, 102));
        pedirCateringButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pedirCateringButton.setText("PEDIR CATERING");
        pedirCateringButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirCateringButtonActionPerformed(evt);
            }
        });
        jPanel1.add(pedirCateringButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, 140, 40));

        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });
        jPanel1.add(volverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        precioCestaLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        precioCestaLabel.setText("Precio:");
        jPanel1.add(precioCestaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 70, 30));

        cateringText.setEditable(false);
        cateringText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(cateringText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 50, -1));

        cityLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cityLabel1.setText("Ciudad:");
        jPanel1.add(cityLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 20));

        verComidaButton1.setBackground(new java.awt.Color(255, 255, 102));
        verComidaButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verComidaButton1.setText("VER COMIDA");
        verComidaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verComidaButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(verComidaButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 700, 150, 40));

        precioCestaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioCestaTextActionPerformed(evt);
            }
        });
        jPanel1.add(precioCestaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 120, 30));

        nameLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nameLabel2.setText("Nombre:");
        jPanel1.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, -1));

        tablaComidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaComidas);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 440, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 539, 820));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void numberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTextActionPerformed

    private void cpTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpTextActionPerformed

    private void calleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calleTextActionPerformed

    /**Se abre una ventana para pedir un catering y despues se actualiza la etiqueta del precio
     * 
     * @param evt 
     */
    private void pedirCateringButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirCateringButtonActionPerformed
        vcPedirCatering vPC = new vcPedirCatering(this, true, this.res);
        Empresa empresa = (Empresa) cliente;
        this.precioCesta = empresa.getCesta().getPrecio();
        precioCestaText.setText(Double.toString(this.precioCesta));
    }//GEN-LAST:event_pedirCateringButtonActionPerformed
    /**Vacia la cesta 
     * 
     * @param evt 
     */
    private void vaciarCestaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarCestaButtonActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this, "Estás seguro?", "Mensaje", JOptionPane.OK_CANCEL_OPTION);
            if (confirmar == 0) {
                cliente.vaciarCesta(); 
                this.precioCesta = 0.0;
                precioCestaText.setText(Double.toString(this.precioCesta));
                ClaseUtil.guardarDatos();
                JOptionPane.showMessageDialog(this, "Cesta vacía" , "Mensaje", JOptionPane.DEFAULT_OPTION);
                
            }
        
    }//GEN-LAST:event_vaciarCestaButtonActionPerformed

    
    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        dispose(); //Preguntar si vaciar cesta??
    }//GEN-LAST:event_volverButtonActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed
    /** Se abre la ventana de ver comida y se actualiza el precio
     * 
     * @param evt 
     */
    private void verComidaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verComidaButton1ActionPerformed
        try{
        int fila = tablaComidas.getSelectedRow();
        vcPedirComida vPC = new vcPedirComida(this, true, res.getComidas().get(fila));
        if (cliente.getClass().getSimpleName().equals("Empresa")) {
            Empresa empresa = (Empresa) cliente;
            this.precioCesta = empresa.getCesta().getPrecio();
            precioCestaText.setText(Double.toString(this.precioCesta));
        }
        else {
            Particular particular = (Particular) cliente;
            this.precioCesta = particular.getCesta().getPrecio();
            precioCestaText.setText(Double.toString(particular.getCesta().getPrecio()));
        }
        }
        catch(ArrayIndexOutOfBoundsException et) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila ");
        }
        catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila ");
        }
    }//GEN-LAST:event_verComidaButton1ActionPerformed

    private void terminarPedidoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarPedidoButton1ActionPerformed
        
        if (this.precioCesta == (0.0)){
            JOptionPane.showMessageDialog(this, "Error, la cesta está vacía", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int confirmar = JOptionPane.showConfirmDialog(this, "Estás seguro?", "Mensaje", JOptionPane.OK_CANCEL_OPTION);
            if (confirmar == 0) {
                cliente.realizarPedido(res);
                JOptionPane.showMessageDialog(this, "Se ha realizado un pedido" , "Mensaje", JOptionPane.DEFAULT_OPTION);
                if (cliente.getClass().getSimpleName().equals("Empresa")) {
                   JOptionPane.showMessageDialog(this, "Las empresasa tienen 10% de descuentos, el precio final es: " + Double.toString(this.precioCesta*0.9) , "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
                vcCalificar vC = new vcCalificar(this, true, res);
                dispose();
            }
        }
        
    }//GEN-LAST:event_terminarPedidoButton1ActionPerformed

    private void precioCestaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioCestaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioCestaTextActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calificacionLabel;
    private javax.swing.JTextField calificacionText;
    private javax.swing.JLabel calleLabel;
    private javax.swing.JTextField calleText;
    private javax.swing.JLabel cateringLabel;
    private javax.swing.JTextField cateringText;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cityLabel1;
    private javax.swing.JTextField cityText;
    private javax.swing.JLabel cpLabel;
    private javax.swing.JTextField cpText;
    private javax.swing.JLabel formularioLabel;
    private javax.swing.ButtonGroup grupoCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberText;
    private javax.swing.JButton pedirCateringButton;
    private javax.swing.JLabel precioCestaLabel;
    private javax.swing.JTextField precioCestaText;
    private javax.swing.JTable tablaComidas;
    private javax.swing.JButton terminarPedidoButton1;
    private javax.swing.JButton vaciarCestaButton;
    private javax.swing.JButton verComidaButton1;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}