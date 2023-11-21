/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package poo.javaeat.interfaz;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poo.javaeat.ClaseUtil;
import poo.javaeat.Restaurante;

/**
 *
 * @author gonza
 */
public class ConsultaRestaurantes extends javax.swing.JDialog {
    private DefaultTableModel dtm = new DefaultTableModel();
    /**
     * Creates new form ConsultaRestaurantes
     */
    public ConsultaRestaurantes(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        String columnas[] = {"NOMBRE", "CALIFICACION", "CATERING", "ESPECIALIDAD","TIEMPO DE ESPERA"};
        dtm.setColumnIdentifiers(columnas);
        jTable1.setModel(dtm);
        rellenaTabla(ClaseUtil.getRestaurantes());
        this.setVisible(true);
    }
    
    //metodo para rellenar tabla
    public void rellenaTabla(ArrayList<Restaurante> r) {
        limpiaTabla();
        System.out.println(r);
        for (Restaurante res : r) {
            dtm.addRow(new Object [] {res.getNombre(),res.getCalificacion(),res.isCatering(),res.getEspecialidad(),res.getTiempoEspera()});
        }
    }
    public void limpiaTabla() {
        int filas = dtm.getRowCount();
        for (int i = 0; i < filas; i++) {
            dtm.removeRow(0);
        }   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void getImagen() {
        try {
            labelLogo.setSize(143, 140);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        filtroOrden = new javax.swing.JComboBox<>();
        filtroEspe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        seleccResButton = new javax.swing.JButton();
        bajaResButton = new javax.swing.JButton();
        altaResButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        getImagen();

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTA DE RESTAURANTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        filtroOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO", "CALIFICACION", "TIEMPO DE ESPERA", "CATERING", " " }));
        filtroOrden.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroOrdenItemStateChanged(evt);
            }
        });
        filtroOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroOrdenActionPerformed(evt);
            }
        });

        filtroEspe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO", "COMIDA ASIÁTICA", "COMIDA MEJICANA", "COMIDA CASERA", "COMIDA INDIA" }));
        filtroEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroEspeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Ordenar por:");

        jLabel3.setText("Especialidad:");

        seleccResButton.setBackground(new java.awt.Color(255, 255, 102));
        seleccResButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        seleccResButton.setText("SELECCIONAR");
        seleccResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccResButtonActionPerformed(evt);
            }
        });

        bajaResButton.setBackground(new java.awt.Color(255, 255, 102));
        bajaResButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bajaResButton.setText("BAJA");
        bajaResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaResButtonActionPerformed(evt);
            }
        });

        altaResButton.setBackground(new java.awt.Color(255, 255, 102));
        altaResButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        altaResButton.setText("ALTA");
        altaResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaResButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "CALIFICACION", "CATERING", "ESPECIALIDAD", "TIEMPO_ESPERA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtroEspe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seleccResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(altaResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(bajaResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filtroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtroEspe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bajaResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Cuando se pulse una opcion del JComboBox, se ha de rellenar la tabla
     * 
     * @param evt 
     */
    private void filtroOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroOrdenActionPerformed

        if (((String)filtroOrden.getSelectedItem()).equals("NINGUNO")&&((String)filtroEspe.getSelectedItem()).equals("NINGUNO")){
            rellenaTabla(ClaseUtil.getRestaurantes());}
        else if (((String)filtroOrden.getSelectedItem()).equals("CALIFICACION")&& ((String)filtroEspe.getSelectedItem()).equals("NINGUNO")){
            ArrayList<Restaurante>res =ClaseUtil.ordenarRelevancia();
            Collections.reverse(res);
            rellenaTabla(res);
        }                   
        else if (((String)filtroOrden.getSelectedItem()).equals("TIEMPO DE ESPERA")&&((String)filtroEspe.getSelectedItem()).equals("NINGUNO")){  
            rellenaTabla(ClaseUtil.ordenarTMedio());
        }
        else if (((String)filtroOrden.getSelectedItem()).equals("CATERING")&&((String)filtroEspe.getSelectedItem()).equals("NINGUNO")){
            rellenaTabla(ClaseUtil.ordenarCatering());
            }  
        else if (((String)filtroOrden.getSelectedItem()).equals("CALIFICACION")&& !((String)filtroEspe.getSelectedItem()).equals("NINGUNO")){
            ArrayList<Restaurante>res =ClaseUtil.ordenarRelevancia();
            Collections.reverse(res);
            rellenaTabla(ClaseUtil.filtroEspecialidad(res, (String)filtroEspe.getSelectedItem()));
        }
        else if (((String)filtroOrden.getSelectedItem()).equals("TIEMPO DE ESPERA")&& !((String)filtroEspe.getSelectedItem()).equals("NINGUNO")){
            rellenaTabla(ClaseUtil.filtroEspecialidad(ClaseUtil.ordenarTMedio(), (String)filtroEspe.getSelectedItem()));
        }
        else if (((String)filtroOrden.getSelectedItem()).equals("CATERING")&& !((String)filtroEspe.getSelectedItem()).equals("NINGUNO")){
            rellenaTabla(ClaseUtil.filtroEspecialidad(ClaseUtil.ordenarCatering(), (String)filtroEspe.getSelectedItem()));
        }
    }//GEN-LAST:event_filtroOrdenActionPerformed

    /** Da de baja un restaurante y rellena la tbala
     * 
     * @param evt 
     */
    private void bajaResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaResButtonActionPerformed
        try{
        int fila = jTable1.getSelectedRow();
        int columna = 0;
        Object value = jTable1.getValueAt(fila, columna);
        String nombre= (String) value;
        ArrayList<Restaurante>copia = new ArrayList<>(ClaseUtil.getRestaurantes());
        for (Restaurante res : copia){
            if (res.getNombre().equals(nombre)){
                ClaseUtil.getRestaurantes().remove(res);
                rellenaTabla(ClaseUtil.getRestaurantes());
                filtroOrden.setSelectedItem("NINGUNO");
                filtroEspe.setSelectedItem("NINGUNO");
            }
        }
        ClaseUtil.guardarDatos();
        }
        catch(ArrayIndexOutOfBoundsException et) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila ");
        }
        catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila ");
        }
    }//GEN-LAST:event_bajaResButtonActionPerformed

    /** Rellena la tabla si se pulsa en el JComboBox de especialidad
     * 
     * @param evt 
     */
    private void filtroEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroEspeActionPerformed
        if (!((String)filtroEspe.getSelectedItem()).equals("NINGUNO")){
        rellenaTabla(ClaseUtil.filtroEspecialidad(ClaseUtil.getRestaurantes(), (String)filtroEspe.getSelectedItem()));}
        else{
            rellenaTabla(ClaseUtil.getRestaurantes());
        }
    }//GEN-LAST:event_filtroEspeActionPerformed

    /**Se abre la ventana para dar de alta un restaurante y se rellena la tabla
     * 
     * @param evt 
     */
    private void altaResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaResButtonActionPerformed
        VAltaRestaurante v =new VAltaRestaurante (this,true);
        rellenaTabla(ClaseUtil.getRestaurantes());
        filtroOrden.setSelectedItem("NINGUNO");
        filtroEspe.setSelectedItem("NINGUNO");
    }//GEN-LAST:event_altaResButtonActionPerformed

    /**Se abre la ventana para modificar restaurante y luego se actualiza la tabla
     * 
     * @param evt 
     */
    private void seleccResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccResButtonActionPerformed
        // TODO add your handling code here:
        try{
            int fila =jTable1.getSelectedRow();
            int columna= 0;
            Object value= jTable1.getValueAt(fila,columna);
            String nombre= (String)value;
            System.out.println(nombre);
            for (Restaurante r:ClaseUtil.getRestaurantes()){
                if (r.getNombre().equals(nombre)){
                    System.out.println(r.toString());
                    ModRestaurante v =new ModRestaurante (this,true,r);
                }
            } 
            rellenaTabla(ClaseUtil.getRestaurantes());
            filtroOrden.setSelectedItem("NINGUNO");
            filtroEspe.setSelectedItem("NINGUNO");
        }
        catch(ArrayIndexOutOfBoundsException et) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila ");
        }
        catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila ");
        }
    }//GEN-LAST:event_seleccResButtonActionPerformed

    private void filtroOrdenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroOrdenItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroOrdenItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaResButton;
    private javax.swing.JButton bajaResButton;
    private javax.swing.JComboBox<String> filtroEspe;
    private javax.swing.JComboBox<String> filtroOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JButton seleccResButton;
    // End of variables declaration//GEN-END:variables
}