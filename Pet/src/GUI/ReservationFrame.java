package GUI;

import java.awt.Color;

public class ReservationFrame extends javax.swing.JFrame
{

    AddFrame af = new AddFrame(this);
    VetFrame vf;
    String lastPressedButton;

    public ReservationFrame(VetFrame v)
    {
        initComponents();
        vf = v;

        setAllButtonGreen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Make a reservation for suitable date");

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("10");
        jButton10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("11");
        jButton11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("12");
        jButton12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("13");
        jButton13.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("14");
        jButton14.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("15");
        jButton15.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("16");
        jButton16.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("17");
        jButton17.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("18");
        jButton18.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("19");
        jButton19.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("20");
        jButton20.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("21");
        jButton21.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("22");
        jButton22.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("23");
        jButton23.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("24");
        jButton24.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("25");
        jButton25.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("26");
        jButton26.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("27");
        jButton27.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("28");
        jButton28.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("29");
        jButton29.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText("30");
        jButton30.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton30ActionPerformed(evt);
            }
        });

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                closeActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Monday");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tuesday");

        jLabel5.setText("Wednesday");

        jLabel6.setText("Thursday");

        jLabel7.setText("Friday");

        jLabel8.setText("Saturday");

        jLabel9.setText("Sunday");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(11, 11, 11)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 81, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(343, 343, 343))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton29)
                    .addComponent(jButton30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(close)
                .addGap(75, 75, 75))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "5";
        af.setInitialRegistrationId();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_closeActionPerformed
    {//GEN-HEADEREND:event_closeActionPerformed
        this.setVisible(false);
        vf.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_closeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "1";
        af.setInitialRegistrationId();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "2";
        af.setInitialRegistrationId();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "3";
        af.setInitialRegistrationId();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "4";
        af.setInitialRegistrationId();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton6ActionPerformed
    {//GEN-HEADEREND:event_jButton6ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "6";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton7ActionPerformed
    {//GEN-HEADEREND:event_jButton7ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "7";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton8ActionPerformed
    {//GEN-HEADEREND:event_jButton8ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "8";
        af.setInitialRegistrationId();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton9ActionPerformed
    {//GEN-HEADEREND:event_jButton9ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "9";
        af.setInitialRegistrationId();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton10ActionPerformed
    {//GEN-HEADEREND:event_jButton10ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "10";
        af.setInitialRegistrationId();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton11ActionPerformed
    {//GEN-HEADEREND:event_jButton11ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "11";
        af.setInitialRegistrationId();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton12ActionPerformed
    {//GEN-HEADEREND:event_jButton12ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "12";
        af.setInitialRegistrationId();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton13ActionPerformed
    {//GEN-HEADEREND:event_jButton13ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "13";
        af.setInitialRegistrationId();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton14ActionPerformed
    {//GEN-HEADEREND:event_jButton14ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "14";
        af.setInitialRegistrationId();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton15ActionPerformed
    {//GEN-HEADEREND:event_jButton15ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "15";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton16ActionPerformed
    {//GEN-HEADEREND:event_jButton16ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "16";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton17ActionPerformed
    {//GEN-HEADEREND:event_jButton17ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "17";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton18ActionPerformed
    {//GEN-HEADEREND:event_jButton18ActionPerformed

        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "18";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton19ActionPerformed
    {//GEN-HEADEREND:event_jButton19ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "19";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton20ActionPerformed
    {//GEN-HEADEREND:event_jButton20ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "20";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton21ActionPerformed
    {//GEN-HEADEREND:event_jButton21ActionPerformed

        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "21";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton22ActionPerformed
    {//GEN-HEADEREND:event_jButton22ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "22";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton23ActionPerformed
    {//GEN-HEADEREND:event_jButton23ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "23";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton24ActionPerformed
    {//GEN-HEADEREND:event_jButton24ActionPerformed

        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "24";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton25ActionPerformed
    {//GEN-HEADEREND:event_jButton25ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "25";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton26ActionPerformed
    {//GEN-HEADEREND:event_jButton26ActionPerformed

        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "26";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton27ActionPerformed
    {//GEN-HEADEREND:event_jButton27ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "27";
        af.setInitialRegistrationId();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton28ActionPerformed
    {//GEN-HEADEREND:event_jButton28ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "28";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton29ActionPerformed
    {//GEN-HEADEREND:event_jButton29ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "29";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton30ActionPerformed
    {//GEN-HEADEREND:event_jButton30ActionPerformed
        this.setVisible(false);
        af.setVisible(true);
        lastPressedButton = "30";
        af.setInitialRegistrationId();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    public void setAllButtonGreen()
    {
        jButton1.setBackground(Color.GREEN);
        jButton1.setFocusable(false);
        jButton2.setBackground(Color.GREEN);
        jButton2.setFocusable(false);
        jButton3.setBackground(Color.GREEN);
        jButton3.setFocusable(false);
        jButton4.setBackground(Color.GREEN);
        jButton4.setFocusable(false);
        jButton5.setBackground(Color.GREEN);
        jButton5.setFocusable(false);
        jButton6.setBackground(Color.GREEN);
        jButton6.setFocusable(false);
        jButton7.setBackground(Color.GREEN);
        jButton7.setFocusable(false);
        jButton8.setBackground(Color.GREEN);
        jButton8.setFocusable(false);
        jButton9.setBackground(Color.GREEN);
        jButton9.setFocusable(false);
        jButton10.setBackground(Color.GREEN);
        jButton10.setFocusable(false);
        jButton11.setBackground(Color.GREEN);
        jButton11.setFocusable(false);
        jButton12.setBackground(Color.GREEN);
        jButton12.setFocusable(false);
        jButton13.setBackground(Color.GREEN);
        jButton13.setFocusable(false);
        jButton14.setBackground(Color.GREEN);
        jButton14.setFocusable(false);
        jButton15.setBackground(Color.GREEN);
        jButton15.setFocusable(false);
        jButton16.setBackground(Color.GREEN);
        jButton16.setFocusable(false);
        jButton17.setBackground(Color.GREEN);
        jButton17.setFocusable(false);
        jButton18.setBackground(Color.GREEN);
        jButton18.setFocusable(false);
        jButton19.setBackground(Color.GREEN);
        jButton19.setFocusable(false);
        jButton20.setBackground(Color.GREEN);
        jButton20.setFocusable(false);
        jButton21.setBackground(Color.GREEN);
        jButton21.setFocusable(false);
        jButton22.setBackground(Color.GREEN);
        jButton23.setFocusable(false);
        jButton23.setBackground(Color.GREEN);
        jButton24.setFocusable(false);
        jButton24.setBackground(Color.GREEN);
        jButton25.setFocusable(false);
        jButton25.setBackground(Color.GREEN);
        jButton26.setFocusable(false);
        jButton26.setBackground(Color.GREEN);
        jButton27.setFocusable(false);
        jButton27.setBackground(Color.GREEN);
        jButton28.setFocusable(false);
        jButton28.setBackground(Color.GREEN);
        jButton29.setFocusable(false);
        jButton29.setBackground(Color.GREEN);
        jButton30.setFocusable(false);
        jButton30.setBackground(Color.GREEN);

    }

    public void disableButton()
    {
        if (lastPressedButton == "1")
        {
            jButton1.setEnabled(false);
            jButton1.setBackground(Color.red);
        } else if (lastPressedButton == "2")
        {
            jButton2.setEnabled(false);
            jButton2.setBackground(Color.red);
        } else if (lastPressedButton == "3")
        {
            jButton3.setEnabled(false);
            jButton3.setBackground(Color.red);
        } else if (lastPressedButton == "4")
        {
            jButton4.setEnabled(false);
            jButton4.setBackground(Color.red);
        } else if (lastPressedButton == "5")
        {
            jButton5.setEnabled(false);
            jButton5.setBackground(Color.red);
        } else if (lastPressedButton == "6")
        {
            jButton6.setEnabled(false);
            jButton6.setBackground(Color.red);
        } else if (lastPressedButton == "7")
        {
            jButton7.setEnabled(false);
            jButton7.setBackground(Color.red);
        } else if (lastPressedButton == "8")
        {
            jButton8.setEnabled(false);
            jButton8.setBackground(Color.red);
        } else if (lastPressedButton == "9")
        {
            jButton9.setEnabled(false);
            jButton9.setBackground(Color.red);
        } else if (lastPressedButton == "10")
        {
            jButton10.setEnabled(false);
            jButton10.setBackground(Color.red);
        } else if (lastPressedButton == "11")
        {
            jButton11.setEnabled(false);
            jButton11.setBackground(Color.red);
        } else if (lastPressedButton == "12")
        {
            jButton12.setEnabled(false);
            jButton12.setBackground(Color.red);
        } else if (lastPressedButton == "13")
        {
            jButton13.setEnabled(false);
            jButton13.setBackground(Color.red);
        } else if (lastPressedButton == "14")
        {
            jButton14.setEnabled(false);
            jButton14.setBackground(Color.red);
        } else if (lastPressedButton == "15")
        {
            jButton15.setEnabled(false);
            jButton15.setBackground(Color.red);
        } else if (lastPressedButton == "16")
        {
            jButton16.setEnabled(false);
            jButton16.setBackground(Color.red);
        } else if (lastPressedButton == "17")
        {
            jButton17.setEnabled(false);
            jButton17.setBackground(Color.red);
        } else if (lastPressedButton == "18")
        {
            jButton18.setEnabled(false);
            jButton18.setBackground(Color.red);
        } else if (lastPressedButton == "19")
        {
            jButton19.setEnabled(false);
            jButton19.setBackground(Color.red);
        } else if (lastPressedButton == "20")
        {
            jButton20.setEnabled(false);
            jButton20.setBackground(Color.red);
        } else if (lastPressedButton == "21")
        {
            jButton21.setEnabled(false);
            jButton21.setBackground(Color.red);
        } else if (lastPressedButton == "22")
        {
            jButton22.setEnabled(false);
            jButton22.setBackground(Color.red);
        } else if (lastPressedButton == "23")
        {
            jButton23.setEnabled(false);
            jButton23.setBackground(Color.red);
        } else if (lastPressedButton == "24")
        {
            jButton24.setEnabled(false);
            jButton24.setBackground(Color.red);
        } else if (lastPressedButton == "25")
        {
            jButton25.setEnabled(false);
            jButton25.setBackground(Color.red);
        } else if (lastPressedButton == "26")
        {
            jButton26.setEnabled(false);
            jButton26.setBackground(Color.red);
        } else if (lastPressedButton == "27")
        {
            jButton27.setEnabled(false);
            jButton27.setBackground(Color.red);
        } else if (lastPressedButton == "28")
        {
            jButton28.setEnabled(false);
            jButton28.setBackground(Color.red);
        } else if (lastPressedButton == "29")
        {
            jButton29.setEnabled(false);
            jButton29.setBackground(Color.red);
        } else if (lastPressedButton == "30")
        {
            jButton30.setEnabled(false);
            jButton30.setBackground(Color.red);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
