package GUI;

import javax.swing.ImageIcon;

public class StartFrame extends javax.swing.JFrame
{

    PetShop pf = new PetShop(this);
    VetFrame vf = new VetFrame(this);
    ImageIcon PetIcon = new ImageIcon("PetShop.png");
    ImageIcon vetIcon = new ImageIcon("Veterinary.jpg");

    public StartFrame()
    {
        initComponents();
        image1.setIcon(vetIcon);
        image2.setIcon(PetIcon);
        
        pet.setFocusable(false);
        vet.setFocusable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        image1 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        pet = new javax.swing.JButton();
        vet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        image1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        image2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pet.setText("Pet");
        pet.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                petActionPerformed(evt);
            }
        });

        vet.setText("Vet");
        vet.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                vetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(pet, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vet, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(image2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pet)
                    .addComponent(vet))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vetActionPerformed
    {//GEN-HEADEREND:event_vetActionPerformed
        this.setVisible(false);
        vf.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_vetActionPerformed

    private void petActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_petActionPerformed
    {//GEN-HEADEREND:event_petActionPerformed
        this.setVisible(false);
        pf.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_petActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JButton pet;
    private javax.swing.JButton vet;
    // End of variables declaration//GEN-END:variables
}
