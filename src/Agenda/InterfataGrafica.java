/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import exceptii.CnpInvalidException;
import exceptii.NrTelefonInvalidException;
import exceptii.NumeInvalidException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lili
 */
public class InterfataGrafica extends javax.swing.JFrame implements Serializable {

    private List<File> pozeReclame;

    String codDeInregistrare = "123";
    boolean utilizatorLogat = false;

    private CarteDeTelefon modelTabelCarteDeTelefon = new CarteDeTelefon();

    /**
     * Creates new form CarteDeTelefon
     */
    public InterfataGrafica() {
        initComponents();
        populareInformatiiSalvate();

        File dir = new File("src\\reclame");
        pozeReclame = Arrays.asList(dir.listFiles());
        //  jList.setModel(model);
        javax.swing.Timer timer = new javax.swing.Timer(5000, taskReclame);
        timer.start();
        if (!utilizatorLogat) {
            afisareReclama();
        }

    }

    ActionListener taskReclame = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (!utilizatorLogat) {
                afisareReclama();
            }
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fc = new javax.swing.JFileChooser();
        jfAdauga = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        tfNume = new javax.swing.JTextField();
        tfPrenume = new javax.swing.JTextField();
        tfTelefon = new javax.swing.JTextField();
        tfCNP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jAdauga = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        tfCauta = new javax.swing.JTextField();
        bCauta = new javax.swing.JButton();
        jReclame = new javax.swing.JPanel();
        jlReclame = new javax.swing.JLabel();
        bIesire = new javax.swing.JButton();
        jSterge = new javax.swing.JButton();
        bAdaugaAbonatNou = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miIesire = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miAdauga = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        miSterge = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        miHelp = new javax.swing.JMenu();
        miInregistrare = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();

        fc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        jfAdauga.setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel1.setMinimumSize(new java.awt.Dimension(300, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 200));

        jLabel1.setText("Nume");

        jLabel2.setText("Prenume");

        jLabel3.setText("CNP");

        jLabel4.setText("nr. telefon");

        jAdauga.setText("Adauga");
        jAdauga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdaugaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAdauga, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(tfTelefon)
                    .addComponent(tfCNP)
                    .addComponent(tfPrenume)
                    .addComponent(tfNume))
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAdauga)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jfAdaugaLayout = new javax.swing.GroupLayout(jfAdauga.getContentPane());
        jfAdauga.getContentPane().setLayout(jfAdaugaLayout);
        jfAdaugaLayout.setHorizontalGroup(
            jfAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jfAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfAdaugaLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
        );
        jfAdaugaLayout.setVerticalGroup(
            jfAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jfAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 460));
        setMinimumSize(new java.awt.Dimension(650, 460));
        setName("InterfataPrincipala"); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(580, 400));

        tabel.setModel(modelTabelCarteDeTelefon);
        tabel.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabel);
        tabel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tabel.getColumnModel().getColumnCount() > 0) {
            tabel.getColumnModel().getColumn(0).setMinWidth(30);
            tabel.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        tfCauta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCautaActionPerformed(evt);
            }
        });

        bCauta.setText("Cauta");
        bCauta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCautaActionPerformed(evt);
            }
        });

        jReclame.setPreferredSize(new java.awt.Dimension(650, 100));

        jlReclame.setToolTipText("");

        javax.swing.GroupLayout jReclameLayout = new javax.swing.GroupLayout(jReclame);
        jReclame.setLayout(jReclameLayout);
        jReclameLayout.setHorizontalGroup(
            jReclameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlReclame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jReclameLayout.setVerticalGroup(
            jReclameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlReclame, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        bIesire.setText("Iesire");
        bIesire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIesireActionPerformed(evt);
            }
        });

        jSterge.setText("Sterge");
        jSterge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStergeActionPerformed(evt);
            }
        });

        bAdaugaAbonatNou.setText("Adauga Abonat Nou");
        bAdaugaAbonatNou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdaugaAbonatNouActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        miOpen.setMnemonic('o');
        miOpen.setText("Open");
        miOpen.setEnabled(false);
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        jMenu1.add(miOpen);

        miSave.setMnemonic('s');
        miSave.setText("Save");
        miSave.setEnabled(false);
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        jMenu1.add(miSave);
        jMenu1.add(jSeparator1);

        miIesire.setText("Iesire");
        miIesire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIesireActionPerformed(evt);
            }
        });
        jMenu1.add(miIesire);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Abonati");

        miAdauga.setMnemonic('a');
        miAdauga.setText("Adauga");
        miAdauga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAdaugaActionPerformed(evt);
            }
        });
        jMenu2.add(miAdauga);

        jMenuItem5.setText("Cauta");
        jMenu2.add(jMenuItem5);

        miSterge.setText("Sterge");
        miSterge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStergeActionPerformed(evt);
            }
        });
        jMenu2.add(miSterge);

        jMenuItem7.setText("Modifica");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        miHelp.setText("Help");

        miInregistrare.setText("Inregistrare");
        miInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInregistrareActionPerformed(evt);
            }
        });
        miHelp.add(miInregistrare);
        miHelp.add(jSeparator2);

        jMenuItem9.setText("About");
        miHelp.add(jMenuItem9);

        jMenuBar1.add(miHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bCauta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfCauta)
                        .addGap(20, 20, 20)
                        .addComponent(bAdaugaAbonatNou)
                        .addGap(20, 20, 20)
                        .addComponent(jSterge, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(bIesire, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addComponent(jReclame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCauta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCauta)
                    .addComponent(bIesire)
                    .addComponent(jSterge)
                    .addComponent(bAdaugaAbonatNou))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jReclame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        // TODO add your handling code here:
        String folder = "date";
        File fileDefault = new File(folder);
        fc.setCurrentDirectory(fileDefault);
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            //  File dir = fc.getSelectedFile();
            File file = fc.getSelectedFile();
            try {
                //File file = new File("save\\save.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fw = new FileOutputStream(file.getAbsoluteFile());
                BufferedOutputStream bw = new BufferedOutputStream(fw);
                ObjectOutput ow = new ObjectOutputStream(bw);

                ow.writeObject(modelTabelCarteDeTelefon.getAbonati());

                ow.close();
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
                Logger.getLogger(InterfataGrafica.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_miSaveActionPerformed

    private void bAdaugaAbonatNouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdaugaAbonatNouActionPerformed
        // TODO add your handling code here:
        jfAdauga.setVisible(true);
    }//GEN-LAST:event_bAdaugaAbonatNouActionPerformed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        String folder = "date";
        File fileDefault = new File(folder);
        fc.setCurrentDirectory(fileDefault);

        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File fisier = fc.getSelectedFile();
            if (fisier != null && fisier.isFile()) {
                incarcaDateCarteTelefon(fisier.getAbsolutePath());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_miOpenActionPerformed

    private void jStergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStergeActionPerformed
        // TODO add your handling code here:
        stergeRandulSelectat();
    }//GEN-LAST:event_jStergeActionPerformed

    private void tfCautaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCautaActionPerformed
        // TODO add your handling code here:
        String text = tfCauta.getText();
    }//GEN-LAST:event_tfCautaActionPerformed

    private void bCautaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCautaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        for (int i = 0; i < tabel.getRowCount(); i++) {
            for (int j = 0; j < tabel.getColumnCount(); j++) {
                if (model.getValueAt(i, j).toString().equalsIgnoreCase(tfCauta.getText())) {

                }
            }
        }
    }//GEN-LAST:event_bCautaActionPerformed

    private void miIesireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIesireActionPerformed
        // TODO add your handling code here:
        bIesireActionPerformed(evt);
    }//GEN-LAST:event_miIesireActionPerformed

    private void bIesireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIesireActionPerformed
        // TODO add your handling code here:
        int optiune = JOptionPane.showConfirmDialog(null,
                "Doriti sa parasiti aplicatia?",
                "Iesire",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (optiune == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_bIesireActionPerformed

    private void miInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInregistrareActionPerformed
        // TODO add your handling code here:
        String parola = JOptionPane.showInputDialog("Care este parola?");
        if (codDeInregistrare.compareTo(parola) == 0) {
            System.out.println("Parola este corecta.");
            miInregistrare.setEnabled(false);
            miOpen.setEnabled(true);
            miSave.setEnabled(true);
            utilizatorLogat = true;
            jlReclame.setVisible(false);
        } else {
            popupMessage("Parola nu este buna", "Eroare", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_miInregistrareActionPerformed

    private void jAdaugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdaugaActionPerformed
        // TODO add your handling code here:
        try {
            String nume = tfNume.getText();
            String prenume = tfPrenume.getText();
            String cnp = tfCNP.getText();
            String telefon = tfTelefon.getText();
            Abonat a = Abonat.getInstance(nume, prenume, cnp, telefon);

            modelTabelCarteDeTelefon.adaugaAbonat(a);

            tfNume.setText("");
            tfPrenume.setText("");
            tfCNP.setText("");
            tfTelefon.setText("");
            jfAdauga.setVisible(false);
            popupMessage("Abonatul a fost adaugat", "Succes", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumeInvalidException e) {
            popupMessage("Nume invalid", "Eroare", JOptionPane.ERROR_MESSAGE);
        } catch (CnpInvalidException e) {
            popupMessage("CNP invalid", "Eroare", JOptionPane.ERROR_MESSAGE);
        } catch (NrTelefonInvalidException e) {
            popupMessage("Nr de telefon invalid", "Eroare", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            popupMessage(e.getMessage(), "Eroare", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jAdaugaActionPerformed

    private void miAdaugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAdaugaActionPerformed
        // TODO add your handling code here:
        jfAdauga.setVisible(true);
    }//GEN-LAST:event_miAdaugaActionPerformed

    private void miStergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStergeActionPerformed
        // TODO add your handling code here:
        jStergeActionPerformed(evt);
    }//GEN-LAST:event_miStergeActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        stergeRandulSelectat();
    }//GEN-LAST:event_formKeyPressed

    private void stergeRandulSelectat() {
        int selectedIndex = tabel.getSelectedRow();
        if (tabel.isRowSelected(selectedIndex)) {
            int optiune = JOptionPane.showConfirmDialog(null,
                    "Doriti sa stergeti abonatul?",
                    "Stergere Abonat",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            if (optiune == JOptionPane.YES_OPTION) {
                modelTabelCarteDeTelefon.removeAbonat(selectedIndex);
            }
        }
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
            java.util.logging.Logger.getLogger(InterfataGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfataGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfataGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfataGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfataGrafica().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdaugaAbonatNou;
    private javax.swing.JButton bCauta;
    private javax.swing.JButton bIesire;
    private javax.swing.JFileChooser fc;
    private javax.swing.JButton jAdauga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jReclame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton jSterge;
    private javax.swing.JFrame jfAdauga;
    private javax.swing.JLabel jlReclame;
    private javax.swing.JMenuItem miAdauga;
    private javax.swing.JMenu miHelp;
    private javax.swing.JMenuItem miIesire;
    private javax.swing.JMenuItem miInregistrare;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem miSterge;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tfCNP;
    private javax.swing.JTextField tfCauta;
    private javax.swing.JTextField tfNume;
    private javax.swing.JTextField tfPrenume;
    private javax.swing.JTextField tfTelefon;
    // End of variables declaration//GEN-END:variables

    private void popupMessage(String message, String eroare, int tip) {
        JOptionPane.showMessageDialog(this, message, eroare, tip);
    }

    private void populareInformatiiSalvate() {

        String caleFisier = "date\\save.txt";
        incarcaDateCarteTelefon(caleFisier);
    }

    private void incarcaDateCarteTelefon(String caleFisier) {
        try {
            // TODO add checks
            // - verify that file exists
            // - verify that isn't corrupted
            // and show error messages

            File file = new File(caleFisier);
            FileInputStream fr = new FileInputStream(file.getAbsoluteFile());
            BufferedInputStream br = new BufferedInputStream(fr);
            ObjectInputStream or = new ObjectInputStream(br);

            List<Abonat> abonati = (List<Abonat>) or.readObject();
            if (abonati != null) {
                modelTabelCarteDeTelefon.seteazaAbonati(abonati);
            }

            or.close();
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(InterfataGrafica.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void afisareReclama() {
        //File calePozaCurenta = pozeReclame.get(reclamaCurenta);
        if (pozeReclame.isEmpty()) {
            return;
        }

        int nrPoza = (int) (Math.random() * pozeReclame.size());
        File calePozaCurenta = pozeReclame.get(nrPoza);
        ImageIcon poza = new ImageIcon(calePozaCurenta.getAbsolutePath());
        jlReclame.setIcon(poza);
    }

}
