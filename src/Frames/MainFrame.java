/*
 * %W% %E% Hamza Yasin
 *
 * Copyright (c) 2017-2018 Miranz Technology. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Miranz
 * technology. You shall not disclose such Confidential Information and 
 * shall use it only in accordance with the terms of the license agreement 
 * you entered into with Miranz.
 *
 */


package Frames;

import Classes.Web3Handler;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.exceptions.TransactionTimeoutException;
import org.web3j.utils.Convert;

/**
 * This class/Frame is written for basic functions of Ethereum and web3j integration
 * Because it's integrating the main functions of web3handling class so we called
 * it as a MainFrame.
 *
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */


public class MainFrame extends javax.swing.JFrame {

    public MainFrame() throws InterruptedException, ExecutionException {
        initComponents();
       
      networkLabel.setText(Web3Handler.network);
      AddressResult.setText(Web3Handler.credentials.getAddress());
      fromAddressField.setText(Web3Handler.credentials.getAddress());
      EthereReult.setText( Convert.toWei(Web3Handler.getBalance()+"", Convert.Unit.WEI).divide(new BigDecimal("1000000000000000000")).toString() );
      
            
    }
     
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPannel = new javax.swing.JPanel();
        TitlePannel = new javax.swing.JPanel();
        WalletTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AddressTitle = new javax.swing.JLabel();
        EthereReult = new javax.swing.JLabel();
        EthereTitle = new javax.swing.JLabel();
        AddressResult = new javax.swing.JLabel();
        EthereTitle1 = new javax.swing.JLabel();
        networkLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LogoPannel = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        BodyPannel = new javax.swing.JPanel();
        fromAddressField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        toAddressField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();
        noteLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Miranz Wallet");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        MainPannel.setBackground(new java.awt.Color(255, 255, 255));

        TitlePannel.setBackground(new java.awt.Color(255, 255, 255));
        TitlePannel.setToolTipText("");

        WalletTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        WalletTitle.setForeground(new java.awt.Color(0, 153, 204));
        WalletTitle.setText("Miranz Wallet");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AddressTitle.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        AddressTitle.setForeground(new java.awt.Color(51, 51, 51));
        AddressTitle.setText("Address:");

        EthereReult.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N

        EthereTitle.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        EthereTitle.setForeground(new java.awt.Color(51, 51, 51));
        EthereTitle.setText("Ethere: ");

        AddressResult.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N

        EthereTitle1.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        EthereTitle1.setForeground(new java.awt.Color(51, 51, 51));
        EthereTitle1.setText("Network:");

        networkLabel.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EthereTitle1)
                    .addComponent(EthereTitle)
                    .addComponent(AddressTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EthereReult)
                    .addComponent(networkLabel)
                    .addComponent(AddressResult))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressTitle)
                    .addComponent(AddressResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EthereReult)
                    .addComponent(EthereTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EthereTitle1)
                    .addComponent(networkLabel)))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel1.setText(" Pakistan's First Blockchain experts solution providers");

        javax.swing.GroupLayout TitlePannelLayout = new javax.swing.GroupLayout(TitlePannel);
        TitlePannel.setLayout(TitlePannelLayout);
        TitlePannelLayout.setHorizontalGroup(
            TitlePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePannelLayout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addGroup(TitlePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WalletTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TitlePannelLayout.setVerticalGroup(
            TitlePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePannelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TitlePannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WalletTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        LogoPannel.setBackground(new java.awt.Color(255, 255, 255));

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/miranz-logo.png"))); // NOI18N

        javax.swing.GroupLayout LogoPannelLayout = new javax.swing.GroupLayout(LogoPannel);
        LogoPannel.setLayout(LogoPannelLayout);
        LogoPannelLayout.setHorizontalGroup(
            LogoPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogoPannelLayout.setVerticalGroup(
            LogoPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fromAddressField.setEditable(false);
        fromAddressField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel2.setText("From (Address):");

        toAddressField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel3.setText("To (Address):");

        amountField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel4.setText("Amount (Either):");

        transactionArea.setEditable(false);
        transactionArea.setColumns(20);
        transactionArea.setRows(5);
        jScrollPane1.setViewportView(transactionArea);

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel5.setText("Transaction Result:");

        sendButton.setBackground(new java.awt.Color(255, 255, 255));
        sendButton.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        sendButton.setText("Send Funds");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        noteLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        noteLabel.setText("Note : You can only send either from one account to another. ");

        javax.swing.GroupLayout BodyPannelLayout = new javax.swing.GroupLayout(BodyPannel);
        BodyPannel.setLayout(BodyPannelLayout);
        BodyPannelLayout.setHorizontalGroup(
            BodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPannelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(BodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyPannelLayout.createSequentialGroup()
                        .addGroup(BodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(amountField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toAddressField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromAddressField)
                            .addGroup(BodyPannelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))
                    .addGroup(BodyPannelLayout.createSequentialGroup()
                        .addGroup(BodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(BodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
            .addGroup(BodyPannelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(noteLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodyPannelLayout.setVerticalGroup(
            BodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPannelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(BodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyPannelLayout.createSequentialGroup()
                        .addComponent(fromAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sendButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noteLabel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPannelLayout = new javax.swing.GroupLayout(MainPannel);
        MainPannel.setLayout(MainPannelLayout);
        MainPannelLayout.setHorizontalGroup(
            MainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPannelLayout.createSequentialGroup()
                .addComponent(LogoPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitlePannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(BodyPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainPannelLayout.setVerticalGroup(
            MainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPannelLayout.createSequentialGroup()
                .addGroup(MainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitlePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BodyPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        try {
            TransactionReceipt trans = Web3Handler.transaction(toAddressField.getText(), Double.parseDouble(amountField.getText()));
            noteLabel.setText("Funds Transfer.");
            transactionArea.setText("Block Hash: " + trans.getBlockHash() 
                    + "\nBlock Number: " + trans.getBlockNumber() 
                    + "\nGas used: " + trans.getGasUsed());
            EthereReult.setText(Convert.toWei(Web3Handler.getBalance() 
                    + "", Convert.Unit.WEI).divide(new BigDecimal("1000000000000000000")).toString() );
        } catch (IOException | InterruptedException | NumberFormatException | ExecutionException | TransactionTimeoutException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressResult;
    private javax.swing.JLabel AddressTitle;
    private javax.swing.JPanel BodyPannel;
    private javax.swing.JLabel EthereReult;
    private javax.swing.JLabel EthereTitle;
    private javax.swing.JLabel EthereTitle1;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel LogoPannel;
    private javax.swing.JPanel MainPannel;
    private javax.swing.JPanel TitlePannel;
    private javax.swing.JLabel WalletTitle;
    private javax.swing.JTextField amountField;
    private javax.swing.JTextField fromAddressField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel networkLabel;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField toAddressField;
    private javax.swing.JTextArea transactionArea;
    // End of variables declaration//GEN-END:variables
}
