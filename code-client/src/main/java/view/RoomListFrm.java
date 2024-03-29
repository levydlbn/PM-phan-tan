/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Client;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class RoomListFrm extends javax.swing.JFrame {
    private Vector<String> listRoom;
    private Vector<String> listPassword;
    private Thread thread;
    private boolean isPlayThread;
    private boolean isFiltered;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form RoomListFrm
     */
    public RoomListFrm() {
        initComponents();
        this.setTitle("Caro Game by Ju");
        this.setIconImage(new ImageIcon("assets/image/caroicon.png").getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        defaultTableModel = (DefaultTableModel) jTable1.getModel();
        isPlayThread = true;
        isFiltered = false;
        thread = new Thread(){
            @Override
            public void run(){
                while (Client.roomListFrm.isDisplayable()&&isPlayThread&&!isFiltered) {                    
                    try {
                        Thread.sleep(500);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    }
                }
            }
        };
        thread.start();
    }
    public void updateRoomList(Vector<String> listData, Vector<String> listPassword){
        this.listRoom = listData;
        this.listPassword = listPassword;
        defaultTableModel.setRowCount(0);
        ImageIcon imageIcon;
        for(int i=0; i<listRoom.size(); i++){
            if(listPassword.get(i).equals(" "))
                imageIcon = new ImageIcon("assets/icon/swords-1-mini.png");
            else
                imageIcon = new ImageIcon("assets/icon/swords-1-lock-mini.png");
            defaultTableModel.addRow(new Object[]{
                listRoom.get(i),
                imageIcon
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Object[][] rows = {
        };
        String[] columns = {"Tên phòng",""};
        DefaultTableModel model = new DefaultTableModel(rows, columns){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0: return String.class;
                    case 1: return ImageIcon.class;
                    default: return Object.class;
                }
            }
        };
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách phòng trống");

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jTable1.setModel(model);
        jTable1.setFillsViewportHeight(true);
        jTable1.setRowHeight(60);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(240);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(240);
      
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
         
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Client.closeView(Client.View.ROOMLIST);
        Client.openView(Client.View.HOMEPAGE);
    }                                        

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        if(jTable1.getSelectedRow()==-1){      
        }else{
            try {
                isPlayThread = false;
                int index = jTable1.getSelectedRow();
                int room = Integer.parseInt(listRoom.get(index).split(" ")[1]);
                String password = listPassword.get(index);
                if(password.equals(" ")){
                    Client.closeView(Client.View.ROOMLIST);
                }
                else{
                    Client.closeView(Client.View.ROOMLIST);
                    Client.openView(Client.View.JOINROOMPASSWORD, room, password);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }                                    


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}
