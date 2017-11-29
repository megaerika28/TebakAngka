//package TebakAngka;

import java.util.Arrays;
//import TebakAngkartis.TebakAngkaMethod;
//import TebakAngka.TebakAngkaMethod2;

public class TebakNamaArtis extends javax.swing.JFrame {
     public String soal2;
  

    public TebakNamaArtis() {
        initComponents();
        setSoal();
        setLocationRelativeTo(null);
        txtjwbn.requestFocus();
        btnUlang.setVisible(false);
        setTitle("AYO TEBAK NAMA ARTIS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MulaiButton = new javax.swing.JButton();
        petunjuklabel1 = new javax.swing.JLabel();
        InputNamaTextField = new javax.swing.JTextField();
        CekNamaButton = new javax.swing.JButton();
        txtstatus = new javax.swing.JLabel();
        txtjwbn = new javax.swing.JLabel();
        txtsoal = new javax.swing.JLabel();
        btnUlang = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tebakNamaArtis.jpg"))); // NOI18N

        MulaiButton.setText("Mulai");

        petunjuklabel1.setText("klik Tombol Mulai");

        CekNamaButton.setText("Are You Sure ?");

        btnUlang.setText("Ulang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CekNamaButton)
                        .addGap(18, 18, 18)
                        .addComponent(btnUlang))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MulaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InputNamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtsoal)
                                    .addComponent(petunjuklabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(txtjwbn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MulaiButton)
                    .addComponent(petunjuklabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtsoal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputNamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtjwbn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CekNamaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnUlang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String jawaban = txtjwbn.getText();
        if (!(soal2.equalsIgnoreCase(jawaban))) {
            txtstatus.setText("Anda belum benar!!");
            InputNamaTextField.requestFocus();
        } else {
            txtstatus.setText("Anda Benar !!!");
            txtsoal.setEnabled(false);
            InputNamaTextField.setEnabled (false);
            //resetUlang();
           btnUlang.setVisible(true);
            CekNamaButton.setEnabled(false);
        
     }
  
     }
     
      private void btnUlangActionPerformed(java.awt.event.ActionEvent evt) {                                         
        resetUlang();
        txtsoal.setEnabled(true);
        txtjwbn.setEnabled(true);
        btnUlang.setVisible(false);
        CekNamaButton.setEnabled(true);
        txtstatus.setText("");
    }                           
    /**
     * @param args the command line arguments
     */
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TebakNamaArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakNamaArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakNamaArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakNamaArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakNamaArtis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CekNamaButton;
    private javax.swing.JTextField InputNamaTextField;
    private javax.swing.JButton MulaiButton;
    private javax.swing.JToggleButton btnUlang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel petunjuklabel1;
    private javax.swing.JLabel txtjwbn;
    private javax.swing.JLabel txtsoal;
    private javax.swing.JLabel txtstatus;
    // End of variables declaration//GEN-END:variables

    public static String cekJawaban(String jawaban) {
        
        return "";
    }
    public String buatSoal() {
        int x = (int) Math.floor(Math.random()* 10);
        String[] namaNamaa = {"Angelina","Demi Moore",
                            "Dewi Sandra","Chelsea islan",
                            "Raisa","Sheina",
                            "Titik Puspita","Titik Sandro","ayu","rina"};
        soal2 = namaNamaa[x].toUpperCase();
        char[] arrNama = soal2.toCharArray();
        Arrays.sort(arrNama);
        String soalNama = new String(arrNama);
return soalNama;
    }
public void setSoal() {
        txtsoal.setText(buatSoal());
}
 void resetUlang() {
        txtjwbn.setText("");
        txtsoal.setText(buatSoal());
 }
}

