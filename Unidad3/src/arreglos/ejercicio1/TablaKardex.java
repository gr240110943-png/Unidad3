
package arreglos.ejercicio1;

import arreglos.ejercicio1.datos.KardexDatos;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Cinthia
 */
public class TablaKardex extends javax.swing.JFrame {

    /**
     * Creates new form TablaKardex
     */
    public TablaKardex() {
        initComponents();
        // mostrar datos actuales desde el inicio
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jLabel2.setBackground(new java.awt.Color(204, 0, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("CALIFICACIONES");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     // <editor-fold defaultstate="collapsed" desc="Generated Code">

    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
         var dialog = new AgregarCalificaciones(this, true);
        dialog.setVisible(true);
        // refrescar tabla y promedio cuando cierra el diálogo
        cargarDatos();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

     private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {
        int fila = tablaDatos.getSelectedRow();
        if (fila == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una fila para modificar.");
            return;
        }

        // Obtener valores actuales (pueden ser null)
        Object objMateria = tablaDatos.getValueAt(fila, 0);
        Object objSemestre = tablaDatos.getValueAt(fila, 1);
        Object objCalif = tablaDatos.getValueAt(fila, 2);

        String materia = objMateria == null ? "" : objMateria.toString();
        String semestre = objSemestre == null ? "" : objSemestre.toString();
        String calificacion = objCalif == null ? "" : objCalif.toString();

        var dialog = new AgregarCalificaciones(this, true);
        dialog.cargarDatosParaEditar(fila, materia, semestre, calificacion);
        dialog.setVisible(true);

        // después de cerrar el diálogo, refrescamos la tabla y el promedio
        cargarDatos();
    }
    
    /*
    Este metodo permite actualizar su tabla con los datos que tiene el arreglo
    en la clase kardex
    */
    private void actualizarTabla(){
        String columnas[] = {"Materia", "Semestre", "Calificación"};
        DefaultTableModel model = new DefaultTableModel(KardexDatos.datos, columnas);
        tablaDatos.setModel(model);
    }
    /**
     * Este metodo agrega los datos del arredlo KardexDatos en la tabla principal
     * y calcula el promedio general de las calificaciones registradas
     * 
     */
    
    private void cargarDatos() {
    
    String [] columnas = {"Materia","semestre","Calificación"};
    javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(columnas, 0);
    double suma = 0;
    int contador = 0;
    
    for (int i = 0; i < KardexDatos.index; i++) {
        String materia = KardexDatos.datos[i][0];
        String semestre = KardexDatos.datos[i][1];
        String calif = KardexDatos.datos[i][2];

        modelo.addRow(new Object[]{materia, semestre, calif});

        try {
            suma += Double.parseDouble(calif);
            contador++;
        } catch (NumberFormatException e) {
            // Si no es número, no se suma
        }
    }

    tablaDatos.setModel(modelo);

    if (contador > 0) {
        double promedio = suma / contador;
       jLabel1.setText("Promedio del semestre es: " + String.format("%.2f", promedio));
    } else {
         jLabel1.setText("Promedio del semestre es: N/A");
}
    
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     var ventana = new TablaKardex();
     ventana.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
