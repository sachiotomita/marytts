/*
 * TranscriptionGUI.java
 *
 * Created on September 29, 2008, 12:58 PM
 */

package marytts.tools.transcription;

import java.awt.Dimension;
import java.awt.MenuShortcut;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JPanel;

import marytts.tools.dbselection.DBHandler;

/**
 * MARY TRANSCRIPTION TOOL
 * 
 * Transcription tool for Letter-to-sound(LTS) rules
 * and maintain list of functional words (useful for newlanguage POS tagging)
 * 
 * @author  sathish
 */
public class TranscriptionGUI extends javax.swing.JFrame {
    
    TranscriptionTable simplePanel;
    String fileNametoSave = null; 
    String phoneSetFile = null;
    boolean loadTranscription = false;  
    String treeAbsolutePath = null;
    String locale = null;
    
    /** Creates new form TranscriptionGUI */
    public TranscriptionGUI() {
        initComponents();
        //saveToFile.setMnemonic(KeyEvent.VK_A);
        //saveToFile.fireM
        //new MenuShortcut();
        try {
            simplePanel = new TranscriptionTable();
            simplePanel.resize(tablePanel.size());
            tablePanel.add(simplePanel, java.awt.BorderLayout.CENTER);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        tablePanel.updateUI();
        //startUpHelpDialog =  new JDialog(this);
        //startUpHelpDialog.setPreferredSize(new Dimension());
        //tablePanel.setEnabled(false);
        loadFromFile.setEnabled(false);
        saveToFile.setEnabled(false);
        saveAsToFile.setEnabled(false);
        loadFromMySql.setEnabled(false);
        trainPredictButton.setEnabled(false);
        this.setVisible(true);
        //tablePanel.setVisible(false);
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        mySqlDetailsDialog = new javax.swing.JDialog();
        mySQLDetailsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hostNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dbNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tableNameTextField = new javax.swing.JTextField();
        submitPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        startUpHelpDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        closeHelp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        htmlEditor = new javax.swing.JEditorPane();
        transcriptionPanel = new javax.swing.JPanel();
        tablePanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        trainPredictButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadFromFile = new javax.swing.JMenuItem();
        saveToFile = new javax.swing.JMenuItem();
        saveAsToFile = new javax.swing.JMenuItem();
        loadFromMySql = new javax.swing.JMenuItem();
        loadPhoneSet = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();

        mySqlDetailsDialog.setTitle("MySQL Details");
        mySqlDetailsDialog.getAccessibleContext().setAccessibleParent(loadFromMySql);
        mySQLDetailsPanel.setMinimumSize(new java.awt.Dimension(400, 250));
        jLabel1.setText("Host Name");

        hostNameTextField.setText("localhost");

        jLabel2.setText("Database Name");

        dbNameTextField.setText("MarySQLDatabase");

        jLabel3.setText("User Name");

        jLabel4.setText("Password");

        jLabel5.setText("Table Name");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFromSqlDatabase(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMySqlDetails(evt);
            }
        });

        javax.swing.GroupLayout submitPanelLayout = new javax.swing.GroupLayout(submitPanel);
        submitPanel.setLayout(submitPanelLayout);
        submitPanelLayout.setHorizontalGroup(
            submitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(okButton)
                .addGap(14, 14, 14)
                .addComponent(cancelButton)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        submitPanelLayout.setVerticalGroup(
            submitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(submitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout mySQLDetailsPanelLayout = new javax.swing.GroupLayout(mySQLDetailsPanel);
        mySQLDetailsPanel.setLayout(mySQLDetailsPanelLayout);
        mySQLDetailsPanelLayout.setHorizontalGroup(
            mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mySQLDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mySQLDetailsPanelLayout.createSequentialGroup()
                        .addGroup(mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(dbNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(hostNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(tableNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))))
                .addContainerGap())
        );
        mySQLDetailsPanelLayout.setVerticalGroup(
            mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mySQLDetailsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hostNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dbNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mySQLDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tableNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(submitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mySqlDetailsDialogLayout = new javax.swing.GroupLayout(mySqlDetailsDialog.getContentPane());
        mySqlDetailsDialog.getContentPane().setLayout(mySqlDetailsDialogLayout);
        mySqlDetailsDialogLayout.setHorizontalGroup(
            mySqlDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mySqlDetailsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mySQLDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mySqlDetailsDialogLayout.setVerticalGroup(
            mySqlDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mySqlDetailsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mySQLDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        startUpHelpDialog.setTitle("Help");
        closeHelp.setText("Close");
        closeHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeHelpDialog(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(closeHelp)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeHelp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(htmlEditor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout startUpHelpDialogLayout = new javax.swing.GroupLayout(startUpHelpDialog.getContentPane());
        startUpHelpDialog.getContentPane().setLayout(startUpHelpDialogLayout);
        startUpHelpDialogLayout.setHorizontalGroup(
            startUpHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startUpHelpDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        startUpHelpDialogLayout.setVerticalGroup(
            startUpHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startUpHelpDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mary Transcription Tool");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                resizedJFrame(evt);
            }
        });
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                ancestorFrameResized(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        trainPredictButton.setText("Train and Predict");
        trainPredictButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainPredictActionPerformed(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeTranscriptionTool(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(trainPredictButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(trainPredictButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout transcriptionPanelLayout = new javax.swing.GroupLayout(transcriptionPanel);
        transcriptionPanel.setLayout(transcriptionPanelLayout);
        transcriptionPanelLayout.setHorizontalGroup(
            transcriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transcriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transcriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        transcriptionPanelLayout.setVerticalGroup(
            transcriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transcriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fileMenu.setText("File");
        loadFromFile.setText("Open");
        loadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFromFileActionPerformed(evt);
            }
        });

        fileMenu.add(loadFromFile);

        saveToFile.setText("Save");
        saveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToFileActionPerformed(evt);
            }
        });

        fileMenu.add(saveToFile);

        saveAsToFile.setText("Save As");
        saveAsToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsToFileActionPerformed(evt);
            }
        });

        fileMenu.add(saveAsToFile);

        loadFromMySql.setText("Load from MySQL Database");
        loadFromMySql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFromMySqlActionPerformed(evt);
            }
        });

        fileMenu.add(loadFromMySql);

        loadPhoneSet.setText("Specify Phone Set");
        loadPhoneSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPhoneSetActionPerformed(evt);
            }
        });

        fileMenu.add(loadPhoneSet);

        jMenuBar2.add(fileMenu);

        helpMenu.setText("Help");
        helpMenuItem.setText("Help");
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });

        helpMenu.add(helpMenuItem);

        jMenuBar2.add(helpMenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transcriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transcriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeTranscriptionTool(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeTranscriptionTool
        System.exit(0);
    }//GEN-LAST:event_closeTranscriptionTool

    private void saveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToFileActionPerformed
        if(!checkNecessaryEvents("save")) return;
        if(fileNametoSave == null){
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int returnVal = fc.showSaveDialog(TranscriptionGUI.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                fileNametoSave = file.getAbsolutePath();
                simplePanel.saveTranscription(file.getAbsolutePath());
            }
        }
        else{
                simplePanel.saveTranscription(fileNametoSave);
        }
        checkNecessaryEvents("save");
        
    }//GEN-LAST:event_saveToFileActionPerformed

    private void closeHelpDialog(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeHelpDialog
        startUpHelpDialog.show(false);
    }//GEN-LAST:event_closeHelpDialog

    private void cancelMySqlDetails(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelMySqlDetails
        mySqlDetailsDialog.show(false);
    }//GEN-LAST:event_cancelMySqlDetails

    private void loadFromSqlDatabase(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFromSqlDatabase
        
        if(!checkNecessaryEvents("load")) return;
        String hostName = hostNameTextField.getText(); 
        String databaseName = dbNameTextField.getText(); 
        String tableName = tableNameTextField.getText();
        String userName = userNameTextField.getText();
        String password = passwordTextField.getText();
        String locale = simplePanel.getLocaleString();
        DBHandler wikiToDB = new DBHandler(locale);
        wikiToDB.createDBConnection(hostName,databaseName,userName,password);
        wikiToDB.setWordListTable(tableName);
        int noWords = wikiToDB.getNumberOfWords(0);
        HashMap<String, Integer> hpMap = wikiToDB.getMostFrequentWords(noWords, 0);
        wikiToDB.closeDBConnection();
        try {
            simplePanel.loadTranscription(hpMap);
            simplePanel.repaint();
            simplePanel.updateUI();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mySqlDetailsDialog.show(false);
        loadTranscription = true;
        saveToFile.setEnabled(true);
        saveAsToFile.setEnabled(true);
        
    }//GEN-LAST:event_loadFromSqlDatabase

    private void ancestorFrameResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_ancestorFrameResized
        try {
            //simplePanel = new TranscriptionTable();
            simplePanel.resize(tablePanel.size());
            tablePanel.add(simplePanel, java.awt.BorderLayout.CENTER);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        tablePanel.updateUI();
        //tablePanel.setEnabled(false);
        
        this.setVisible(true);
        //tablePanel.setVisible(false);
    }//GEN-LAST:event_ancestorFrameResized

    private void resizedJFrame(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_resizedJFrame
        try {
            //simplePanel = new TranscriptionTable();
            simplePanel.resize(tablePanel.size());
            tablePanel.add(simplePanel, java.awt.BorderLayout.CENTER);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        tablePanel.updateUI();
        //tablePanel.setEnabled(false);
        
        this.setVisible(true);
        //tablePanel.setVisible(false);
        
    }//GEN-LAST:event_resizedJFrame

    private void loadPhoneSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPhoneSetActionPerformed
        if(!checkNecessaryEvents("phoneset")) return;
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showOpenDialog(TranscriptionGUI.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            phoneSetFile  = file.getAbsolutePath();
            
            if(phoneSetFile != null) {
                simplePanel.loadPhoneSet(phoneSetFile);
                loadPhoneSet.setEnabled(false);
                loadFromFile.setEnabled(true);
                loadFromMySql.setEnabled(true);   
                locale = simplePanel.getLocaleString();
            }
        }        
    }//GEN-LAST:event_loadPhoneSetActionPerformed

    private void loadFromMySqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFromMySqlActionPerformed
        if(!checkNecessaryEvents("load")) return;
        Dimension d = new Dimension(500, 250);
        mySqlDetailsDialog.setSize(d);
        mySqlDetailsDialog.show(true);
        
    }//GEN-LAST:event_loadFromMySqlActionPerformed

    private void saveAsToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsToFileActionPerformed
        if(!checkNecessaryEvents("save")) return;
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showSaveDialog(TranscriptionGUI.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            fileNametoSave = file.getAbsolutePath();
            simplePanel.saveTranscription(file.getAbsolutePath());
        }
        checkNecessaryEvents("save");
    }//GEN-LAST:event_saveAsToFileActionPerformed

    private void loadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFromFileActionPerformed
        if(!checkNecessaryEvents("load")) return;
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showOpenDialog(TranscriptionGUI.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            simplePanel.loadTranscription(file.getAbsolutePath());
            loadTranscription = true;
            saveToFile.setEnabled(true);
            saveAsToFile.setEnabled(true);
        }
    }//GEN-LAST:event_loadFromFileActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed
        try {
            //htmlEditor = new JEditorPane("file:///home/sathish/Desktop/instructions.html");
            //htmlEditor = new JEditorPane();        
            htmlEditor.setContentType("text/html; charset=UTF-8");        
            htmlEditor.read(new InputStreamReader(TranscriptionGUI.class.getResourceAsStream("instructions.html"), "UTF-8"), null);
            htmlEditor.setPreferredSize(new Dimension(500, 400));
            htmlEditor.setEditable(true);
            htmlEditor.updateUI();
            startUpHelpDialog.setSize(new Dimension(700, 500));
            startUpHelpDialog.repaint();
            //htmlEditor.addHyperlinkListener(sratUpHelpDialog);
            startUpHelpDialog.show(true);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
                System.out.println("Could not read file : "
                    +e.getMessage());            
        }
        
    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void trainPredictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainPredictActionPerformed
        if(treeAbsolutePath != null){
            simplePanel.trainPredict(treeAbsolutePath);
        }
    }//GEN-LAST:event_trainPredictActionPerformed
    
    private boolean checkNecessaryEvents(String eventName){
        
        if(eventName.equals("load")){
            // First load phoneset
            if(phoneSetFile == null){
                JOptionPane.showMessageDialog(this,
                    "Please specify phoneset for your language.",
                        "Phoneset specification",
                            JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        
        if(eventName.equals("save")){
         
            // First load phoneset
            if(phoneSetFile == null){
                
                if(phoneSetFile == null){
                    JOptionPane.showMessageDialog(this,
                        "Please specify phoneset for your language.",
                            "Phoneset specification",
                                JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            
            // Second load data
            if(!loadTranscription){
                if(phoneSetFile == null){
                    JOptionPane.showMessageDialog(this,
                        "Please load data to transcribe.",
                            "Load data",
                                JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            
            // set treeAbsolutePath
            if(fileNametoSave != null){
                 String dirName = (new File(fileNametoSave)).getParentFile().getAbsolutePath();
                 treeAbsolutePath = dirName+File.separator+"lexicon_"+locale+".lts";
            }
        }
        
        // When to enable train-predict button
        if(phoneSetFile != null && loadTranscription && treeAbsolutePath != null){
            trainPredictButton.setEnabled(true);
        }
        else{
            trainPredictButton.setEnabled(false);
        }
        
        return true;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranscriptionGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton closeHelp;
    private javax.swing.JTextField dbNameTextField;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JTextField hostNameTextField;
    private javax.swing.JEditorPane htmlEditor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem loadFromFile;
    private javax.swing.JMenuItem loadFromMySql;
    private javax.swing.JMenuItem loadPhoneSet;
    private javax.swing.JPanel mySQLDetailsPanel;
    private javax.swing.JDialog mySqlDetailsDialog;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JMenuItem saveAsToFile;
    private javax.swing.JMenuItem saveToFile;
    private javax.swing.JDialog startUpHelpDialog;
    private javax.swing.JPanel submitPanel;
    private javax.swing.JTextField tableNameTextField;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton trainPredictButton;
    private javax.swing.JPanel transcriptionPanel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
    
}
