 private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        Triangulo trian = new Triangulo();
        trian.setVisible(true);
    } 
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        txtArea.setText("");
        txtPerimetro.setText("");
        txtHipotenusa.setText("");
        txtAltura.setText("");
        txtBase.setText("");
        txtTipo.setText("");
    }                                         

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        double altura,base,perimetro,area,hipotenusa;
        String tipo;
        altura = Double.parseDouble(txtAltura.getText());
        base = Double.parseDouble(txtBase.getText());
        hipotenusa = Math.sqrt(Math.pow(base, 2)+ Math.pow(altura, 2));
        area = (base*altura)/2;
        perimetro = base+altura+hipotenusa;
        if ((altura==base) && (altura==hipotenusa)){
            txtTipo.setText(String.valueOf("Equilatero"));
        }
        else if ((altura!=base) && (altura!=hipotenusa) && (base!=hipotenusa)){
            txtTipo.setText(String.valueOf("Escaleno"));
        }
        else{
            txtTipo.setText(String.valueOf("Isosceles"));
        }
        txtPerimetro.setText(String.valueOf(perimetro));
        txtArea.setText(String.valueOf(area));
        txtHipotenusa.setText(String.valueOf(hipotenusa));
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
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triangulo().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtHipotenusa;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration                   
}
