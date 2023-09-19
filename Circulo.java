 private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        Circulo circ = new Circulo();
        circ.setVisible(true);
    } 
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        txtRadio.setText("");
        txtPerimetro.setText("");
        txtArea.setText("");
    }                                         

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        double area,perimetro,radio;
        radio = Double.parseDouble(txtRadio.getText());
        perimetro = 2*Math.PI*radio;
        area = Math.PI*Math.pow(radio, 2);
        txtPerimetro.setText(String.valueOf(perimetro));
        txtArea.setText(String.valueOf(area));
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
            java.util.logging.Logger.getLogger(Circulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Circulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Circulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Circulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Circulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration                   
}
