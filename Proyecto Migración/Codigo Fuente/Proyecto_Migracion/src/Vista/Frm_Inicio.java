package Vista;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

public class Frm_Inicio extends javax.swing.JFrame {

    public Frm_Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLblTitulo = new javax.swing.JLabel();
        JBtnConsultar = new javax.swing.JButton();
        JBtnSolicitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Citas Migración");
        setResizable(false);

        JLblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JLblTitulo.setText("CITAS MIGRACION");

        JBtnConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBtnConsultar.setText("SOLICITAR");
        JBtnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JBtnSolicitar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBtnSolicitar.setText("CONSULTAR");
        JBtnSolicitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBtnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSolicitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(JBtnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(JLblTitulo)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(JLblTitulo)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSolicitarActionPerformed
        Frm_BoletaVerificar frmVerifBoleta = new Frm_BoletaVerificar();
        frmVerifBoleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBtnSolicitarActionPerformed

    public static void main(String args[]) {
        
        try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch(Exception e){
            System.out.println(e.toString());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnConsultar;
    private javax.swing.JButton JBtnSolicitar;
    private javax.swing.JLabel JLblTitulo;
    // End of variables declaration//GEN-END:variables
}
