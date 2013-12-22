/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.benary.vocab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.benary.vocab.Checks.Single;

/**
 *
 * @author benaryorg
 */
public class Window extends javax.swing.JFrame
{

    /**
     * Creates new form fenster
     */
    public Window()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        MenuBar = new javax.swing.JMenuBar();
        Menu_Datei = new javax.swing.JMenu();
        Menu_File_Open = new javax.swing.JMenuItem();
        Menu_File_Save = new javax.swing.JMenuItem();
        Menu_Program_Close = new javax.swing.JMenuItem();
        Menu_Zeile = new javax.swing.JMenu();
        Menu_Vocab_Add = new javax.swing.JMenuItem();
        Menu_Row_Add = new javax.swing.JMenuItem();
        Menu_Row_Delete = new javax.swing.JMenuItem();
        Menu_Check = new javax.swing.JMenu();
        Menu_Check_Single = new javax.swing.JMenuItem();
        Menu_Check_Connect = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vokabellernprogramm by benaryorg");

        Panel.setLayout(new java.awt.BorderLayout());

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Englisch", "Deutsch"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        Table.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(Table);
        Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        Panel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(Panel, java.awt.BorderLayout.CENTER);

        Menu_Datei.setText("Datei");

        Menu_File_Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Menu_File_Open.setText("Öffnen");
        Menu_File_Open.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Menu_File_OpenActionPerformed(evt);
            }
        });
        Menu_Datei.add(Menu_File_Open);

        Menu_File_Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Menu_File_Save.setText("Speichern");
        Menu_File_Save.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Menu_File_SaveActionPerformed(evt);
            }
        });
        Menu_Datei.add(Menu_File_Save);

        Menu_Program_Close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Program_Close.setText("Schließen");
        Menu_Program_Close.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Menu_Program_CloseActionPerformed(evt);
            }
        });
        Menu_Datei.add(Menu_Program_Close);

        MenuBar.add(Menu_Datei);

        Menu_Zeile.setText("Zeile");

        Menu_Vocab_Add.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Vocab_Add.setText("Hinzufügen");
        Menu_Vocab_Add.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Menu_Vocab_AddActionPerformed(evt);
            }
        });
        Menu_Zeile.add(Menu_Vocab_Add);

        Menu_Row_Add.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Row_Add.setText("Bearbeiten");
        Menu_Row_Add.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Menu_Row_AddActionPerformed(evt);
            }
        });
        Menu_Zeile.add(Menu_Row_Add);

        Menu_Row_Delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Row_Delete.setText("Löschen");
        Menu_Row_Delete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Menu_Row_DeleteActionPerformed(evt);
            }
        });
        Menu_Zeile.add(Menu_Row_Delete);

        MenuBar.add(Menu_Zeile);

        Menu_Check.setText("Check");

        Menu_Check_Single.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Menu_Check_Single.setText("Einzeln");
        Menu_Check_Single.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Menu_Check_SingleActionPerformed(evt);
            }
        });
        Menu_Check.add(Menu_Check_Single);

        Menu_Check_Connect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Menu_Check_Connect.setText("Cluster");
        Menu_Check.add(Menu_Check_Connect);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Einzeln");
        Menu_Check.add(jMenuItem3);

        MenuBar.add(Menu_Check);

        setJMenuBar(MenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_File_OpenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Menu_File_OpenActionPerformed
    {//GEN-HEADEREND:event_Menu_File_OpenActionPerformed
        String path=JOptionPane.showInputDialog(this,"Dateiname:","Datei öffnen",JOptionPane.QUESTION_MESSAGE);
        if(path!=null)
        {
            try(FileReader file=new FileReader(path))
            {
                BufferedReader reader=new BufferedReader(file);
                DefaultTableModel model=(DefaultTableModel)this.Table.getModel();
                String str;
                while((str=reader.readLine())!=null)
                {
                    String[] parts=str.split(";");
                    if(parts.length==2)
                    {
                        model.addRow(new Object[]
                        {
                            parts[0],parts[1]
                        });
                    }
                }
                reader.close();
                file.close();
            }
            catch(FileNotFoundException ex1)
            {
                JOptionPane.showConfirmDialog(this,"Datei nicht gefunden!","Fehler",JOptionPane.DEFAULT_OPTION);
            }
            catch(IOException ex2)
            {
                JOptionPane.showConfirmDialog(this,"IOException!","Fehler",JOptionPane.DEFAULT_OPTION);
            }
        }
    }//GEN-LAST:event_Menu_File_OpenActionPerformed

    private void Menu_File_SaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Menu_File_SaveActionPerformed
    {//GEN-HEADEREND:event_Menu_File_SaveActionPerformed
        DefaultTableModel model=(DefaultTableModel)this.Table.getModel();
        ArrayList<Row> list=new ArrayList();
        for(int i=0;i<model.getRowCount();i++)
        {
            list.add(new Row((String)model.getValueAt(i,0),(String)model.getValueAt(i,1)));
        }

        String path=JOptionPane.showInputDialog(this,"Dateiname:","Datei öffnen",JOptionPane.QUESTION_MESSAGE);

        if(path!=null)
        {
            try
            {
                try(FileWriter writer=new FileWriter(new File(path)))
                {
                    for(Object obj:list.toArray())
                    {
                        writer.write(((Row)obj).toString()+'\n');
                    }
                    writer.flush();
                }
            }
            catch(IOException ex)
            {
                JOptionPane.showConfirmDialog(this,"IOException!","Fehler",JOptionPane.DEFAULT_OPTION);
            }
        }
    }//GEN-LAST:event_Menu_File_SaveActionPerformed

    private void Menu_Vocab_AddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Menu_Vocab_AddActionPerformed
    {//GEN-HEADEREND:event_Menu_Vocab_AddActionPerformed
        new VocabDialog(this,false).setVisible(true);
    }//GEN-LAST:event_Menu_Vocab_AddActionPerformed

    private void Menu_Program_CloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Menu_Program_CloseActionPerformed
    {//GEN-HEADEREND:event_Menu_Program_CloseActionPerformed
        switch(JOptionPane.showConfirmDialog(this,"Soll die Datei gespeichert werden?","Speichern",JOptionPane.YES_NO_CANCEL_OPTION))
        {
            case 0:
                Menu_File_SaveActionPerformed(evt);
                break;
            case 1:
                this.dispose();
                break;
            case 2:
                break;
        }
    }//GEN-LAST:event_Menu_Program_CloseActionPerformed

    private void Menu_Row_DeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Menu_Row_DeleteActionPerformed
    {//GEN-HEADEREND:event_Menu_Row_DeleteActionPerformed
        int row=this.Table.getSelectedRow();
        if(row>=0)
        {
            ((DefaultTableModel)this.Table.getModel()).removeRow(row);
        }
    }//GEN-LAST:event_Menu_Row_DeleteActionPerformed

    private void Menu_Row_AddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Menu_Row_AddActionPerformed
    {//GEN-HEADEREND:event_Menu_Row_AddActionPerformed
        int row=this.Table.getSelectedRow();
        if(row>=0)
        {
            DefaultTableModel model=(DefaultTableModel)this.Table.getModel();
            VocabDialog dialog=new VocabDialog(this,false);
            dialog.Text_English1.setText((String)model.getValueAt(row,0));
            dialog.Text_German1.setText((String)model.getValueAt(row,1));
            dialog.setVisible(true);
            Menu_Row_DeleteActionPerformed(evt);
        }
    }//GEN-LAST:event_Menu_Row_AddActionPerformed

    private void Menu_Check_SingleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Menu_Check_SingleActionPerformed
    {//GEN-HEADEREND:event_Menu_Check_SingleActionPerformed
        new Single(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Menu_Check_SingleActionPerformed
    /**
     * Used to add a Row from a VocabDialog Object
     *
     * @param dialog The Vocab Dialog from where the Strings should be taken
     */
    public void add(VocabDialog dialog)
    {
        DefaultTableModel model=(DefaultTableModel)this.Table.getModel();
        String de=dialog.de;
        String en=dialog.en;
        model.addRow(new Object[]
        {
            en,de
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for(javax.swing.UIManager.LookAndFeelInfo info:javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        }
        catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Window.class
                .getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }

        catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Window.class
                .getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }

        catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Window.class
                .getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }

        catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Window.class
                .getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Menu_Check;
    private javax.swing.JMenuItem Menu_Check_Connect;
    private javax.swing.JMenuItem Menu_Check_Single;
    private javax.swing.JMenu Menu_Datei;
    private javax.swing.JMenuItem Menu_File_Open;
    private javax.swing.JMenuItem Menu_File_Save;
    private javax.swing.JMenuItem Menu_Program_Close;
    private javax.swing.JMenuItem Menu_Row_Add;
    private javax.swing.JMenuItem Menu_Row_Delete;
    private javax.swing.JMenuItem Menu_Vocab_Add;
    private javax.swing.JMenu Menu_Zeile;
    private javax.swing.JPanel Panel;
    public javax.swing.JTable Table;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
