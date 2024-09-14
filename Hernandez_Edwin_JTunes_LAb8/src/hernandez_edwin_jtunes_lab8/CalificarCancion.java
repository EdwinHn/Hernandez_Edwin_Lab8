
package hernandez_edwin_jtunes_lab8;

import javax.swing.JOptionPane;

public class CalificarCancion extends javax.swing.JFrame {

    public CalificarCancion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeljTunes = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        jLabelAgregarCancion = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabeljTunes.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabeljTunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeljTunes.setText("jTunes");

        btn_Volver.setText("Volver");
        btn_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VolverMouseClicked(evt);
            }
        });

        jLabelAgregarCancion.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelAgregarCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregarCancion.setText("Calificar Canción");

        jLabelCodigo.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabelCodigo.setText("Ingrese el código de la canción:");

        btn_Buscar.setText("Buscar");
        btn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabeljTunes, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabelAgregarCancion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabeljTunes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAgregarCancion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(219, 219, 219)
                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VolverMouseClicked
        Inicio_jTunes menu = new Inicio_jTunes();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VolverMouseClicked

    private void btn_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseClicked

        int codigo = Integer.parseInt(jTextFieldCodigo.getText());

        Jtunes jtunes = new Jtunes(100);

        Song cancion = jtunes.searchSong(codigo);
        if (cancion != null) {
            JOptionPane.showMessageDialog(null,"Canción encontrada:");

        } else {

            JOptionPane.showMessageDialog(null,"Canción no encontrada.");
        }
    }//GEN-LAST:event_btn_BuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabelAgregarCancion;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabeljTunes;
    private javax.swing.JTextField jTextFieldCodigo;
    // End of variables declaration//GEN-END:variables
}
