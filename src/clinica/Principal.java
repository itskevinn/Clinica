    package clinica;

import datos.Medico;
import datos.Paciente;
import datos.Usuario;
import java.util.ArrayList;

public class Principal extends javax.swing.JFrame {

    ArrayList<Medico> listaMedicos;
    ArrayList<Usuario> listaUsuarios;
    ArrayList<Paciente> listaPacientes;
    public Principal() {
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        personalMedicoBoton = new javax.swing.JButton();
        apartarCitasBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido a la Clínica Valledupar");

        personalMedicoBoton.setText("Ver Personal Médico");
        personalMedicoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalMedicoBotonActionPerformed(evt);
            }
        });

        apartarCitasBoton.setText("Apartar Citas");
        apartarCitasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apartarCitasBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apartarCitasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(personalMedicoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(personalMedicoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(apartarCitasBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void personalMedicoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalMedicoBotonActionPerformed
        PersonalMedico personalMedicoVentana = new PersonalMedico(this, true);
        personalMedicoVentana.setVisible(true);
    }//GEN-LAST:event_personalMedicoBotonActionPerformed

    private void apartarCitasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apartarCitasBotonActionPerformed
        ApartarCitas apartarCitasVentana = new ApartarCitas((this), true);
        apartarCitasVentana.setVisible(true);
    }//GEN-LAST:event_apartarCitasBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apartarCitasBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton personalMedicoBoton;
    // End of variables declaration//GEN-END:variables
}
