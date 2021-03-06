/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coachmanager;

import java.sql.Connection;


public class Start extends javax.swing.JFrame {

    private Session sess;
    private Connection conn;
    private DataCenter datacenter;
    
    public Start() {
        initComponents();
        
        this.checkSession();
        
        conn = Connector.createConnection();
        datacenter = new DataCenter(conn,this);
        
        
        new java.util.Timer().schedule(
                new java.util.TimerTask()
                {
                    @Override
                    public void run()
                    {
                        getTime();
                    }
                }
                , 1000);
        
        new java.util.Timer().schedule(
                new java.util.TimerTask()
                {
                    @Override
                    public void run()
                    {
                       refreshTransBtn.doClick(500);
                    }
                }
        ,(1000));
        
    }
    
    private void checkSession()
    {
                
        SessionController sessData = new SessionController();
        sess = sessData.readSession();
        
        
        if(sess == null)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Session unregistered! System exiting", "Session Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
        this.sessionNamesLabel.setText(sess.surname+" "+sess.names);
        this.sessionIDLabel.setText(""+sess.ID);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sessionNamesLabel = new javax.swing.JLabel();
        sessionIDLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        createTransBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        refreshTransBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        passNumLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Start");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Logged In As :");

        sessionNamesLabel.setText("Brian Tirop Kimutai");

        sessionIDLabel.setText("29948819");

        createTransBtn.setText("Create New Transaction...");
        createTransBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createTransBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTransBtnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Today's Transcation Data");

        refreshTransBtn.setText("Refresh");
        refreshTransBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshTransBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTransBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Total Number of Passengers :");

        passNumLabel.setText("0");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Total Amount Collected         :");

        totalAmountLabel.setText("KSH 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshTransBtn)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshTransBtn)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passNumLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalAmountLabel))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        timeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        timeLabel.setText("12:23 AM     1 Jun 2015");

        jMenu1.setText("Session");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Log Off");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Reports");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Generate Today's");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Generate for a specific peroid");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createTransBtn)
                        .addContainerGap(449, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sessionIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sessionNamesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sessionNamesLabel)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sessionIDLabel)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createTransBtn)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createTransBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTransBtnActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
           @Override
            public void run()
            {
                new TransPanel().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_createTransBtnActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SessionController.Logout(this);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void refreshTransBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTransBtnActionPerformed
        long numTrans = datacenter.getTodayTrans();
        long totPrice = datacenter.getTodayTotal();
        
        this.totalAmountLabel.setText("KSH "+totPrice);
        this.passNumLabel.setText(""+numTrans);
    }//GEN-LAST:event_refreshTransBtnActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new TimeReport();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String fname = this.datacenter.getTodayreport();
        if(fname == null)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Could not generate report !","Fatal Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            this.datacenter.printObject(this, fname);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void getTime()
    {
        String time = datacenter.getDateTime();
        this.timeLabel.setText(time);
    }
        
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createTransBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel passNumLabel;
    private javax.swing.JButton refreshTransBtn;
    private javax.swing.JLabel sessionIDLabel;
    private javax.swing.JLabel sessionNamesLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalAmountLabel;
    // End of variables declaration//GEN-END:variables
}
