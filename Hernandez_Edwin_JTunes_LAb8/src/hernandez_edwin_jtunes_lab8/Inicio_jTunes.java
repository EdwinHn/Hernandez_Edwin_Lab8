
package hernandez_edwin_jtunes_lab8;


public class Inicio_jTunes extends javax.swing.JFrame {

    public Inicio_jTunes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeljTunes = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Calificar = new javax.swing.JButton();
        btn_Biblioteca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabeljTunes.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabeljTunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeljTunes.setText("jTunes");

        btn_Agregar.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        btn_Agregar.setText("Agregar Canción");
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseClicked(evt);
            }
        });

        btn_Buscar.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        btn_Buscar.setText("Buscar Canción");
        btn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseClicked(evt);
            }
        });

        btn_Calificar.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        btn_Calificar.setText("Calificar Canción");
        btn_Calificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CalificarMouseClicked(evt);
            }
        });

        btn_Biblioteca.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        btn_Biblioteca.setText("Ver Biblioteca");
        btn_Biblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BibliotecaMouseClicked(evt);
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
                        .addGap(213, 213, 213)
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btn_Calificar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btn_Biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabeljTunes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Calificar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked
        this.dispose();
        new AgregarCancion().setVisible(true);
    }//GEN-LAST:event_btn_AgregarMouseClicked

    private void btn_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseClicked
        this.dispose();
        new BuscarCancion().setVisible(true);
    }//GEN-LAST:event_btn_BuscarMouseClicked

    private void btn_CalificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CalificarMouseClicked
        this.dispose();
        new CalificarCancion().setVisible(true);
    }//GEN-LAST:event_btn_CalificarMouseClicked

    private void btn_BibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BibliotecaMouseClicked
        this.dispose();
        new Biblioteca().setVisible(true);
    }//GEN-LAST:event_btn_BibliotecaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Biblioteca;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Calificar;
    private javax.swing.JLabel jLabeljTunes;
    // End of variables declaration//GEN-END:variables
}
