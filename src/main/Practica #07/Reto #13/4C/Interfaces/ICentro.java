package Interfaces;
import Logica.GestionDeEquipos;

public class ICentro extends javax.swing.JFrame {
    
    public ICentro() {
        initComponents();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ContainerFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InputCostoUnitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputFecha = new javax.swing.JTextField();
        inputFactura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputCI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GenerarRegistro = new javax.swing.JButton();
        BotonOpenReporte = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        InputDescripcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        getContentPane().add(jPanel1);

        jLabel1.setText("Descripción:");

        jLabel2.setText("Ingrese data del equipo:");

        jLabel3.setText("Cantidad:");

        InputCostoUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCostoUnitarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Costo unitario(Bs):");

        inputFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFechaActionPerformed(evt);
            }
        });

        inputFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFacturaActionPerformed(evt);
            }
        });

        jLabel6.setText("N.ro de Factura:");

        jLabel7.setText("Fecha de adquisición:");

        inputCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCIActionPerformed(evt);
            }
        });

        jLabel5.setText("C.I del responsable del equipo:");

        jLabel8.setText("dd/mm/aaaa");

        GenerarRegistro.setText("Registrar data");
        GenerarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarRegistroActionPerformed(evt);
            }
        });

        BotonOpenReporte.setText("Generar Reporte");
        BotonOpenReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOpenReporteActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        InputDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerFrameLayout = new javax.swing.GroupLayout(ContainerFrame);
        ContainerFrame.setLayout(ContainerFrameLayout);
        ContainerFrameLayout.setHorizontalGroup(
            ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerFrameLayout.createSequentialGroup()
                .addGroup(ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerFrameLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerFrameLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(InputDescripcion))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerFrameLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InputCostoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerFrameLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(ContainerFrameLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContainerFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inputFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputCI, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(141, 141, 141))))))
                    .addGroup(ContainerFrameLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(GenerarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonOpenReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ContainerFrameLayout.setVerticalGroup(
            ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputCostoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(inputFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addGap(24, 24, 24)
                .addGroup(ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ContainerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerarRegistro)
                    .addComponent(BotonOpenReporte)
                    .addComponent(jButton3))
                .addGap(16, 16, 16))
        );

        getContentPane().add(ContainerFrame);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCIActionPerformed

    private void inputFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFacturaActionPerformed

    private void inputFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFechaActionPerformed

    private void InputCostoUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCostoUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCostoUnitarioActionPerformed

    private void GenerarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarRegistroActionPerformed

        String inputs[] = {InputDescripcion.getText(),inputCantidad.getText(),InputCostoUnitario.getText(),inputFecha.getText(),inputFactura.getText(),inputCI.getText()};
        new GestionDeEquipos().registrarEquipos(inputs);
        

    }//GEN-LAST:event_GenerarRegistroActionPerformed

    private void BotonOpenReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOpenReporteActionPerformed
        IReporte panel = new IReporte();
       setVisible(false);
       panel.run();
       
    }//GEN-LAST:event_BotonOpenReporteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void InputDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputDescripcionActionPerformed

            public void run() {
                ICentro frame = new ICentro();
                frame.setTitle("Registro y Control de Equipos en Centro de Investigación");
                frame.setVisible(true);
            }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonOpenReporte;
    private javax.swing.JPanel ContainerFrame;
    private javax.swing.JButton GenerarRegistro;
    private javax.swing.JTextField InputCostoUnitario;
    private javax.swing.JTextField InputDescripcion;
    private javax.swing.JTextField inputCI;
    private javax.swing.JTextField inputCantidad;
    private javax.swing.JTextField inputFactura;
    private javax.swing.JTextField inputFecha;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
