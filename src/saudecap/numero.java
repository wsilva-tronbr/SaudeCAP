package saudecap;

import javax.swing.JOptionPane;

/**
 *
 * @author wsilva
 */
public class numero extends javax.swing.JTextField {

    public numero() {
        this.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                verifica();
            }
        });
    }

    private void verifica() {
        if (this.getText().trim().isEmpty()) {
            return;
        }
        int c1;
        try {
            c1 = Integer.parseInt(this.getText().trim());
        } catch (Exception e) {
            c1 = 9999;
        }
        if (c1 < 1 || c1 > 60) {
            JOptionPane.showMessageDialog(this, "entre com um número entre 1 e 60");
            this.setText("");
        }
    }
}
