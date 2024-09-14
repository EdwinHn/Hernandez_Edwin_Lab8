package hernandez_edwin_jtunes_lab8;

import javax.swing.JOptionPane;

public class AgregarCancion extends javax.swing.JFrame {

    public AgregarCancion() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeljTunes = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelAgregarCancion = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        btn_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabeljTunes.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabeljTunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeljTunes.setText("jTunes");

        jLabelCodigo.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabelCodigo.setText("Ingrese el código de la canción:");

        jLabelAgregarCancion.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelAgregarCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregarCancion.setText("Agregar Canción");

        jLabelNombre.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabelNombre.setText("Ingrese el nombre de la canción:");

        jLabelPrecio.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabelPrecio.setText("Ingrese el precio de la canción:");

        btn_Agregar.setText("Agregar");
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(194, 194, 194)
                            .addComponent(jLabeljTunes, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(237, 237, 237)
                            .addComponent(jLabelAgregarCancion))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabeljTunes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelAgregarCancion)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked
        String codigo = jTextFieldCodigo.getText().trim();
        int Codigo = Integer.parseInt(jTextFieldCodigo.getText());
        String nombre = jTextFieldNombre.getText();
        String Nombre = nombre;
        String precio = jTextFieldPrecio.getText().trim();
        double Precio = Double.parseDouble(jTextFieldPrecio.getText());

        Jtunes jtunes = new Jtunes(100);

        try {
            int Edad = Integer.parseInt(jTextFieldCodigo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INGRESAR VALORES NÚMERICOS EN EL CÓDIGO");
            return;
        }

        try {
            int Edad = Integer.parseInt(jTextFieldPrecio.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INGRESAR VALORES NÚMERICOS EN EL CÓDIGO");
            return;
        }

        if (codigo.isEmpty() || nombre.isEmpty() || precio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos solicitados");

        } else {

            boolean fueAgregada = jtunes.addSong(Codigo, nombre, Precio);
                    if (fueAgregada) {
                        JOptionPane.showMessageDialog(null, "Canción agregada exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null,"No se pudo agregar la canción. Verifique que el código sea único.");
                    }
             
            Inicio_jTunes menu = new Inicio_jTunes();
            menu.setVisible(true);
            this.dispose();

    }//GEN-LAST:event_btn_AgregarMouseClicked

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JLabel jLabelAgregarCancion;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabeljTunes;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
