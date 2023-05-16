/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Butrint Bajrami
 */
public class Admin_History extends javax.swing.JFrame {

    /**
     * Creates new form Admin_History
     */
    public Admin_History() {
        FlatLightLaf.setup();
        initComponents();
        Show_History_In_Table();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        scaleImage();
    }
    
     public void scaleImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\img\\hotel_prishtina_logo.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }

    public Connection getConnection(){
        
        Connection con ;
        try{
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/hotel_managment","root","bajrami27");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.WARNING_MESSAGE);
            return null;
        }       
    }
    
    
    public ArrayList<History> getHistoryList(){
        
        ArrayList<History> historyList = new ArrayList<History>();
        Connection connection = getConnection();
        
        String query = "SELECT * FROM admin_history";
        Statement st;
        java.sql.ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            History history;
            while(rs.next()){
                
                 history = new History(rs.getInt("id"),rs.getInt("admin_id"),rs.getTimestamp("date"));
                 historyList.add(history);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong","title",JOptionPane.WARNING_MESSAGE);
        }
        
        return historyList;
    }
    
     public void Show_History_In_Table(){
        ArrayList<History> list = getHistoryList();
        DefaultTableModel model = (DefaultTableModel)Table_Display_History.getModel();
        Object [] row = new Object[3];
        for(int i = 0; i < list.size(); i++){
            
             row[0] = list.get(i).getId();
             row[1] = list.get(i).getAdmin_id();
             row[2] = list.get(i).getDate();
             
             model.addRow(row);
        }
    }
     
    public void executeSQLQuery(String query, String message){
        
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if((st.executeUpdate(query)) == 1){
                
                DefaultTableModel model = (DefaultTableModel)Table_Display_History.getModel();
                model.setRowCount(0);
                Show_History_In_Table();
                
                JOptionPane.showMessageDialog(null,"Data " + message + " Succesfuly","title",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Data not  " + message,"title",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }catch(Exception e){
            
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        client_button = new javax.swing.JButton();
        staff_button = new javax.swing.JButton();
        gallery_button = new javax.swing.JButton();
        news_button = new javax.swing.JButton();
        rooms_button = new javax.swing.JButton();
        restaurant_button = new javax.swing.JButton();
        history_button = new javax.swing.JButton();
        messages_button = new javax.swing.JButton();
        profile_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Display_History = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(237, 200, 119));

        logout_button.setBackground(new java.awt.Color(237, 200, 119));
        logout_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        logout_button.setForeground(new java.awt.Color(0, 0, 0));
        logout_button.setText("Log Out");
        logout_button.setBorder(null);
        logout_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout_buttonMouseExited(evt);
            }
        });
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        client_button.setBackground(new java.awt.Color(237, 200, 119));
        client_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        client_button.setForeground(new java.awt.Color(0, 0, 0));
        client_button.setText("Clients");
        client_button.setBorder(null);
        client_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                client_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                client_buttonMouseExited(evt);
            }
        });
        client_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_buttonActionPerformed(evt);
            }
        });

        staff_button.setBackground(new java.awt.Color(237, 200, 119));
        staff_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        staff_button.setForeground(new java.awt.Color(0, 0, 0));
        staff_button.setText("Staff");
        staff_button.setBorder(null);
        staff_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staff_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staff_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staff_buttonMouseExited(evt);
            }
        });
        staff_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_buttonActionPerformed(evt);
            }
        });

        gallery_button.setBackground(new java.awt.Color(237, 200, 119));
        gallery_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        gallery_button.setForeground(new java.awt.Color(0, 0, 0));
        gallery_button.setText("Gallery");
        gallery_button.setBorder(null);
        gallery_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gallery_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gallery_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gallery_buttonMouseExited(evt);
            }
        });
        gallery_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gallery_buttonActionPerformed(evt);
            }
        });

        news_button.setBackground(new java.awt.Color(237, 200, 119));
        news_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        news_button.setForeground(new java.awt.Color(0, 0, 0));
        news_button.setText("News");
        news_button.setBorder(null);
        news_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        news_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                news_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                news_buttonMouseExited(evt);
            }
        });
        news_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                news_buttonActionPerformed(evt);
            }
        });

        rooms_button.setBackground(new java.awt.Color(237, 200, 119));
        rooms_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        rooms_button.setForeground(new java.awt.Color(0, 0, 0));
        rooms_button.setText("Rooms");
        rooms_button.setBorder(null);
        rooms_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rooms_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rooms_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rooms_buttonMouseExited(evt);
            }
        });
        rooms_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rooms_buttonActionPerformed(evt);
            }
        });

        restaurant_button.setBackground(new java.awt.Color(237, 200, 119));
        restaurant_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        restaurant_button.setForeground(new java.awt.Color(0, 0, 0));
        restaurant_button.setText("Restaurant");
        restaurant_button.setBorder(null);
        restaurant_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restaurant_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restaurant_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restaurant_buttonMouseExited(evt);
            }
        });
        restaurant_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurant_buttonActionPerformed(evt);
            }
        });

        history_button.setBackground(new java.awt.Color(237, 200, 119));
        history_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        history_button.setForeground(new java.awt.Color(0, 0, 0));
        history_button.setText("History");
        history_button.setBorder(null);
        history_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        history_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                history_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                history_buttonMouseExited(evt);
            }
        });
        history_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_buttonActionPerformed(evt);
            }
        });

        messages_button.setBackground(new java.awt.Color(237, 200, 119));
        messages_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        messages_button.setForeground(new java.awt.Color(0, 0, 0));
        messages_button.setText("Messages");
        messages_button.setBorder(null);
        messages_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        messages_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                messages_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                messages_buttonMouseExited(evt);
            }
        });
        messages_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messages_buttonActionPerformed(evt);
            }
        });

        profile_button.setBackground(new java.awt.Color(237, 200, 119));
        profile_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        profile_button.setForeground(new java.awt.Color(0, 0, 0));
        profile_button.setText("Profile");
        profile_button.setBorder(null);
        profile_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profile_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profile_buttonMouseExited(evt);
            }
        });
        profile_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(client_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rooms_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(restaurant_button, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
            .addComponent(gallery_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(staff_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(news_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(history_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messages_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profile_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(client_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rooms_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restaurant_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staff_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gallery_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(news_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(history_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messages_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profile_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(237, 200, 119));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("        History");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(237, 200, 119));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        Table_Display_History.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Table_Display_History.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Admin_Id", "Date"
            }
        ));
        Table_Display_History.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_Display_HistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Display_History);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseEntered
        logout_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_logout_buttonMouseEntered

    private void logout_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseExited
        logout_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_logout_buttonMouseExited

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        Login_Side ls = new Login_Side();
        ls.show();
        dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void client_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_buttonMouseEntered
        client_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_client_buttonMouseEntered

    private void client_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_buttonMouseExited
        client_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_client_buttonMouseExited

    private void client_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_buttonActionPerformed
        Admin_Client ac = new Admin_Client();
        ac.show();
        dispose();
    }//GEN-LAST:event_client_buttonActionPerformed

    private void staff_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_buttonMouseEntered
        staff_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_staff_buttonMouseEntered

    private void staff_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_buttonMouseExited
        staff_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_staff_buttonMouseExited

    private void staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_buttonActionPerformed
        Admin_Staff af = new Admin_Staff();
        af.show();
        dispose();
    }//GEN-LAST:event_staff_buttonActionPerformed

    private void gallery_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery_buttonMouseEntered
        gallery_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_gallery_buttonMouseEntered

    private void gallery_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery_buttonMouseExited
        gallery_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_gallery_buttonMouseExited

    private void news_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_news_buttonMouseEntered
        news_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_news_buttonMouseEntered

    private void news_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_news_buttonMouseExited
        news_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_news_buttonMouseExited

    private void news_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_news_buttonActionPerformed
        Admin_News an = new Admin_News();
        an.show();
        dispose();
    }//GEN-LAST:event_news_buttonActionPerformed

    private void rooms_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms_buttonMouseEntered
        rooms_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_rooms_buttonMouseEntered

    private void rooms_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms_buttonMouseExited
        rooms_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_rooms_buttonMouseExited

    private void restaurant_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurant_buttonMouseEntered
        restaurant_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_restaurant_buttonMouseEntered

    private void restaurant_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurant_buttonMouseExited
        restaurant_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_restaurant_buttonMouseExited

    private void history_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_buttonMouseEntered
        history_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_history_buttonMouseEntered

    private void history_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_buttonMouseExited
        history_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_history_buttonMouseExited

    private void messages_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messages_buttonMouseEntered
        messages_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_messages_buttonMouseEntered

    private void messages_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messages_buttonMouseExited
        messages_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_messages_buttonMouseExited

    private void profile_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_buttonMouseEntered
        profile_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_profile_buttonMouseEntered

    private void profile_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_buttonMouseExited
        profile_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_profile_buttonMouseExited

    private void profile_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_buttonActionPerformed
        Admin_Profile ap = new Admin_Profile();
        ap.show();
        dispose();
    }//GEN-LAST:event_profile_buttonActionPerformed

    private void history_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_buttonActionPerformed
        Admin_History ah = new Admin_History();
        ah.show();
        dispose();
    }//GEN-LAST:event_history_buttonActionPerformed

    private void Table_Display_HistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_Display_HistoryMouseClicked
        int i = Table_Display_History.getSelectedRow();
        TableModel model = Table_Display_History.getModel();
    }//GEN-LAST:event_Table_Display_HistoryMouseClicked

    private void restaurant_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurant_buttonActionPerformed
        Admin_Resturant ar = new Admin_Resturant();
        ar.show();
        dispose();
    }//GEN-LAST:event_restaurant_buttonActionPerformed

    private void gallery_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gallery_buttonActionPerformed
        Admin_Gallery ag = new Admin_Gallery();
        ag.show();
        dispose();
    }//GEN-LAST:event_gallery_buttonActionPerformed

    private void messages_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messages_buttonActionPerformed
        Admin_Messages am = new Admin_Messages();
        am.show();
        dispose();
    }//GEN-LAST:event_messages_buttonActionPerformed

    private void rooms_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rooms_buttonActionPerformed
       Admin_Rooms ar = new Admin_Rooms();
        ar.show();
        dispose();
    }//GEN-LAST:event_rooms_buttonActionPerformed

     
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
            java.util.logging.Logger.getLogger(Admin_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Table_Display_History;
    private javax.swing.JButton client_button;
    private javax.swing.JButton gallery_button;
    private javax.swing.JButton history_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton messages_button;
    private javax.swing.JButton news_button;
    private javax.swing.JButton profile_button;
    private javax.swing.JButton restaurant_button;
    private javax.swing.JButton rooms_button;
    private javax.swing.JButton staff_button;
    // End of variables declaration//GEN-END:variables
}
