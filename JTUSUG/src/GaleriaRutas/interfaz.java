package GaleriaRutas;


public class interfaz extends javax.swing.JFrame {
    Galeria Mi_Galeria = new Galeria();
    private int a = 0;
    private int b = 1;
    private int c = 2;
    private int d = 3;
    /** Creates new form interfaz */
    public interfaz() {
        initComponents();
        this.setTitle("RUTAS TUSUG EN OAXACA DE JUAREZ");
        this.setLocationRelativeTo(null);
        //se elimina el texto
        FOTO_A.setText("");FOTO_B.setText("");FOTO_C.setText("");FOTO_D.setText("");FOTO_GRANDE.setText("");
        //se inici la vista previa
        FOTO_A.setIcon(Mi_Galeria.getPreview(0));
        FOTO_B.setIcon(Mi_Galeria.getPreview(1));
        FOTO_C.setIcon(Mi_Galeria.getPreview(2));
        FOTO_D.setIcon(Mi_Galeria.getPreview(3));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        FOTO_GRANDE = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CMD_PREVIEW = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        FOTO_A = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        FOTO_B = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        FOTO_C = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        FOTO_D = new javax.swing.JLabel();
        CMD_NEXT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        FOTO_GRANDE.setText("foto");
        FOTO_GRANDE.setPreferredSize(new java.awt.Dimension(560, 460));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(FOTO_GRANDE, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridBagLayout());

        CMD_PREVIEW.setText("<");
        CMD_PREVIEW.setPreferredSize(new java.awt.Dimension(44, 120));
        CMD_PREVIEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD_PREVIEWActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        jPanel3.add(CMD_PREVIEW, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        FOTO_A.setText("foto");
        FOTO_A.setPreferredSize(new java.awt.Dimension(100, 100));
        FOTO_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FOTO_AMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(FOTO_A, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jPanel2, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        FOTO_B.setText("foto");
        FOTO_B.setPreferredSize(new java.awt.Dimension(100, 100));
        FOTO_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FOTO_BMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(FOTO_B, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jPanel4, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        FOTO_C.setText("foto");
        FOTO_C.setPreferredSize(new java.awt.Dimension(100, 100));
        FOTO_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FOTO_CMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel5.add(FOTO_C, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jPanel5, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        FOTO_D.setText("foto");
        FOTO_D.setPreferredSize(new java.awt.Dimension(100, 100));
        FOTO_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FOTO_DMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel6.add(FOTO_D, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jPanel6, gridBagConstraints);

        CMD_NEXT.setText(">");
        CMD_NEXT.setPreferredSize(new java.awt.Dimension(44, 120));
        CMD_NEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD_NEXTActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        jPanel3.add(CMD_NEXT, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FOTO_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FOTO_AMouseClicked
        FOTO_GRANDE.setIcon(Mi_Galeria.getFoto(a,FOTO_GRANDE.getSize()));
    }//GEN-LAST:event_FOTO_AMouseClicked

    private void FOTO_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FOTO_BMouseClicked
        FOTO_GRANDE.setIcon(Mi_Galeria.getFoto(b,FOTO_GRANDE.getSize()));
    }//GEN-LAST:event_FOTO_BMouseClicked

    private void FOTO_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FOTO_CMouseClicked
        FOTO_GRANDE.setIcon(Mi_Galeria.getFoto(c,FOTO_GRANDE.getSize()));
    }//GEN-LAST:event_FOTO_CMouseClicked

    private void FOTO_DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FOTO_DMouseClicked
        FOTO_GRANDE.setIcon(Mi_Galeria.getFoto(d,FOTO_GRANDE.getSize()));
    }//GEN-LAST:event_FOTO_DMouseClicked

    private void CMD_NEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD_NEXTActionPerformed
        a+=1;b+=1;c+=1;d+=1;
        FOTO_A.setIcon(Mi_Galeria.getPreview(a));
        FOTO_B.setIcon(Mi_Galeria.getPreview(b));
        FOTO_C.setIcon(Mi_Galeria.getPreview(c));
        FOTO_D.setIcon(Mi_Galeria.getPreview(d));
    }//GEN-LAST:event_CMD_NEXTActionPerformed

    private void CMD_PREVIEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD_PREVIEWActionPerformed
        a-=1;b-=1;c-=1;d-=1;
        FOTO_A.setIcon(Mi_Galeria.getPreview(a));
        FOTO_B.setIcon(Mi_Galeria.getPreview(b));
        FOTO_C.setIcon(Mi_Galeria.getPreview(c));
        FOTO_D.setIcon(Mi_Galeria.getPreview(d));
    }//GEN-LAST:event_CMD_PREVIEWActionPerformed

    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CMD_NEXT;
    private javax.swing.JButton CMD_PREVIEW;
    private javax.swing.JLabel FOTO_A;
    private javax.swing.JLabel FOTO_B;
    private javax.swing.JLabel FOTO_C;
    private javax.swing.JLabel FOTO_D;
    private javax.swing.JLabel FOTO_GRANDE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

}


