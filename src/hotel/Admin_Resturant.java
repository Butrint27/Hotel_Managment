/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Butrint Bajrami
 */
public class Admin_Resturant extends javax.swing.JFrame {

    
    public Admin_Resturant() {
        FlatLightLaf.setup();
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        scaleImage();
        
        show_food_table();
        show_object_table();
        show_staff_table();
        show_finance_table();
        
        id_food_field.setVisible(false);
        id_object_field.setVisible(false);
        id_staff_field.setVisible(false);
        id_field.setVisible(false);
      
        
        
    }

   public void scaleImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\img\\hotel_prishtina_logo.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
    
   public void show_food_table(){
       String sql = "SELECT * FROM restaurant_food";
       
       try{
           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           DefaultTableModel model = (DefaultTableModel)food_table.getModel();
            while(rs.next()){
                model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }            
       }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
       }
   }
   
   public void show_object_table(){
       String sql = "SELECT * FROM restaurant_object";
       
       try{
           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           DefaultTableModel model = (DefaultTableModel)object_table.getModel();
            while(rs.next()){
                model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }            
       }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
       }
   }
   
   public void show_staff_table(){
       String sql = "SELECT * FROM restaurant_staff";
       
       try{
           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           DefaultTableModel model = (DefaultTableModel)staff_table.getModel();
            while(rs.next()){
                model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }            
       }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
       }
   }
   
    public void show_finance_table(){
       String sql = "SELECT * FROM restaurant_finance";
       
       try{
           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           DefaultTableModel model = (DefaultTableModel)finance_table.getModel();
            while(rs.next()){
                model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
            }            
       }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
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
        messages_button = new javax.swing.JButton();
        profile_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        add_food_button = new javax.swing.JButton();
        update_food_button = new javax.swing.JButton();
        delete_food_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        food_table = new javax.swing.JTable();
        price_food_field = new javax.swing.JTextField();
        weight_food_field = new javax.swing.JTextField();
        date_food_field = new javax.swing.JTextField();
        id_food_field = new javax.swing.JTextField();
        food_food_field = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        object_table = new javax.swing.JTable();
        add_object_button = new javax.swing.JButton();
        update_object_button = new javax.swing.JButton();
        delete_object_button = new javax.swing.JButton();
        number_object_field = new javax.swing.JTextField();
        id_object_field = new javax.swing.JTextField();
        date_object_field = new javax.swing.JTextField();
        object_object_field = new javax.swing.JTextField();
        price_object_field = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        staff_table = new javax.swing.JTable();
        add_staff_button = new javax.swing.JButton();
        update_staff_button = new javax.swing.JButton();
        delete_staff_button = new javax.swing.JButton();
        price_staff_field = new javax.swing.JTextField();
        id_staff_field = new javax.swing.JTextField();
        name_staff_field = new javax.swing.JTextField();
        surname_staff_field = new javax.swing.JTextField();
        role_staff_field = new javax.swing.JTextField();
        date_staff_field = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        finance_table = new javax.swing.JTable();
        add_finance_button = new javax.swing.JButton();
        update_finance_button = new javax.swing.JButton();
        delete_finance_button = new javax.swing.JButton();
        id_field = new javax.swing.JTextField();
        eletricity_field = new javax.swing.JTextField();
        water_field = new javax.swing.JTextField();
        health_field = new javax.swing.JTextField();
        state_field = new javax.swing.JTextField();
        phone_field = new javax.swing.JTextField();
        date_field = new javax.swing.JTextField();
        building_field = new javax.swing.JTextField();

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
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
            .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(client_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rooms_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(restaurant_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gallery_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(staff_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(news_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messages_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profile_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(client_button, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rooms_button, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restaurant_button, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staff_button, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gallery_button, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(news_button, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messages_button, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profile_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(159, 159, 159)
                .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(237, 200, 119));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("        Restaurant");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(237, 200, 119));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Food-Supply");

        add_food_button.setBackground(new java.awt.Color(237, 203, 118));
        add_food_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_food_button.setForeground(new java.awt.Color(0, 0, 0));
        add_food_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/add_icon.png"))); // NOI18N
        add_food_button.setText("Add");
        add_food_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_food_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_food_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_food_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_food_buttonMouseExited(evt);
            }
        });
        add_food_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_food_buttonActionPerformed(evt);
            }
        });

        update_food_button.setBackground(new java.awt.Color(237, 203, 118));
        update_food_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_food_button.setForeground(new java.awt.Color(0, 0, 0));
        update_food_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/update_icon.png"))); // NOI18N
        update_food_button.setText("Update");
        update_food_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_food_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_food_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update_food_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update_food_buttonMouseExited(evt);
            }
        });
        update_food_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_food_buttonActionPerformed(evt);
            }
        });

        delete_food_button.setBackground(new java.awt.Color(237, 203, 118));
        delete_food_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_food_button.setForeground(new java.awt.Color(0, 0, 0));
        delete_food_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/delete_icon.png"))); // NOI18N
        delete_food_button.setText("Delete");
        delete_food_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_food_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_food_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_food_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_food_buttonMouseExited(evt);
            }
        });
        delete_food_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_food_buttonActionPerformed(evt);
            }
        });

        food_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        food_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Food Type", "Weight", "Price", "Date"
            }
        ));
        food_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                food_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(food_table);

        price_food_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        weight_food_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        date_food_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        id_food_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        food_food_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(526, 526, 526)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_food_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(add_food_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(delete_food_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(id_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(61, 61, 61)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(food_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(weight_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(price_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(date_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(376, 376, 376))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(add_food_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(update_food_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_food_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(81, 81, 81)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(food_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(price_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(date_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(id_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(weight_food_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(84, 84, 84))
        );

        jPanel5.setBackground(new java.awt.Color(237, 200, 119));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Object-Supply");

        object_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        object_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Object Type", "Number", "Price", "Date"
            }
        ));
        object_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                object_tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(object_table);

        add_object_button.setBackground(new java.awt.Color(237, 203, 118));
        add_object_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_object_button.setForeground(new java.awt.Color(0, 0, 0));
        add_object_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/add_icon.png"))); // NOI18N
        add_object_button.setText("Add");
        add_object_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_object_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_object_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_object_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_object_buttonMouseExited(evt);
            }
        });
        add_object_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_object_buttonActionPerformed(evt);
            }
        });

        update_object_button.setBackground(new java.awt.Color(237, 203, 118));
        update_object_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_object_button.setForeground(new java.awt.Color(0, 0, 0));
        update_object_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/update_icon.png"))); // NOI18N
        update_object_button.setText("Update");
        update_object_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_object_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_object_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update_object_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update_object_buttonMouseExited(evt);
            }
        });
        update_object_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_object_buttonActionPerformed(evt);
            }
        });

        delete_object_button.setBackground(new java.awt.Color(237, 203, 118));
        delete_object_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_object_button.setForeground(new java.awt.Color(0, 0, 0));
        delete_object_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/delete_icon.png"))); // NOI18N
        delete_object_button.setText("Delete");
        delete_object_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_object_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_object_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_object_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_object_buttonMouseExited(evt);
            }
        });
        delete_object_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_object_buttonActionPerformed(evt);
            }
        });

        number_object_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        id_object_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        date_object_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        object_object_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        price_object_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_object_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(add_object_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(delete_object_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(id_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(114, 114, 114)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(object_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(number_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(price_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(date_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(346, 346, 346)))
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(add_object_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(update_object_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_object_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(90, 90, 90)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(object_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(price_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(number_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(date_object_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(71, 71, 71))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(237, 200, 119));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Staff-Schedule");

        staff_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        staff_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Role", "Price", "Date"
            }
        ));
        staff_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staff_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(staff_table);

        add_staff_button.setBackground(new java.awt.Color(237, 203, 118));
        add_staff_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_staff_button.setForeground(new java.awt.Color(0, 0, 0));
        add_staff_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/add_icon.png"))); // NOI18N
        add_staff_button.setText("Add");
        add_staff_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_staff_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_staff_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_staff_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_staff_buttonMouseExited(evt);
            }
        });
        add_staff_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_staff_buttonActionPerformed(evt);
            }
        });

        update_staff_button.setBackground(new java.awt.Color(237, 203, 118));
        update_staff_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_staff_button.setForeground(new java.awt.Color(0, 0, 0));
        update_staff_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/update_icon.png"))); // NOI18N
        update_staff_button.setText("Update");
        update_staff_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_staff_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_staff_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update_staff_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update_staff_buttonMouseExited(evt);
            }
        });
        update_staff_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_staff_buttonActionPerformed(evt);
            }
        });

        delete_staff_button.setBackground(new java.awt.Color(237, 203, 118));
        delete_staff_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_staff_button.setForeground(new java.awt.Color(0, 0, 0));
        delete_staff_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/delete_icon.png"))); // NOI18N
        delete_staff_button.setText("Delete");
        delete_staff_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_staff_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_staff_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_staff_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_staff_buttonMouseExited(evt);
            }
        });
        delete_staff_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_staff_buttonActionPerformed(evt);
            }
        });

        price_staff_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        id_staff_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        name_staff_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        surname_staff_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        role_staff_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        date_staff_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(431, 431, 431))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_staff_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(add_staff_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(delete_staff_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(id_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(114, 114, 114)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(name_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(surname_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(role_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(price_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(date_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(178, 178, 178)))
                .addGap(31, 31, 31))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(add_staff_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(update_staff_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_staff_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(90, 90, 90)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(role_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(surname_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(price_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(date_staff_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(65, 65, 65))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(237, 200, 119));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Finance");

        finance_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Building_Rent", "Eletricity_Rent", "Water_Rent", "Health_Rent", "Phone_Rent", "State_Rent", "Date"
            }
        ));
        finance_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finance_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(finance_table);

        add_finance_button.setBackground(new java.awt.Color(237, 203, 118));
        add_finance_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_finance_button.setForeground(new java.awt.Color(0, 0, 0));
        add_finance_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/add_icon.png"))); // NOI18N
        add_finance_button.setText("Add");
        add_finance_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_finance_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_finance_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_finance_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_finance_buttonMouseExited(evt);
            }
        });
        add_finance_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_finance_buttonActionPerformed(evt);
            }
        });

        update_finance_button.setBackground(new java.awt.Color(237, 203, 118));
        update_finance_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_finance_button.setForeground(new java.awt.Color(0, 0, 0));
        update_finance_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/update_icon.png"))); // NOI18N
        update_finance_button.setText("Update");
        update_finance_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_finance_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_finance_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update_finance_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update_finance_buttonMouseExited(evt);
            }
        });
        update_finance_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_finance_buttonActionPerformed(evt);
            }
        });

        delete_finance_button.setBackground(new java.awt.Color(237, 203, 118));
        delete_finance_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_finance_button.setForeground(new java.awt.Color(0, 0, 0));
        delete_finance_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/delete_icon.png"))); // NOI18N
        delete_finance_button.setText("Delete");
        delete_finance_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_finance_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_finance_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_finance_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_finance_buttonMouseExited(evt);
            }
        });
        delete_finance_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_finance_buttonActionPerformed(evt);
            }
        });

        id_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        eletricity_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        water_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        health_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        state_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        phone_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        date_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        building_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(517, 517, 517))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_finance_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(add_finance_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(delete_finance_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(id_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(building_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(eletricity_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(water_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(health_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(phone_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(state_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(date_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addGap(850, 850, 850)))
                        .addGap(31, 31, 31))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(add_finance_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(update_finance_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_finance_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(87, 87, 87)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(state_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eletricity_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(water_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(health_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(phone_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(id_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(building_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_field, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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

    private void add_food_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_food_buttonMouseEntered
        add_food_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_add_food_buttonMouseEntered

    private void add_food_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_food_buttonMouseExited
        add_food_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_add_food_buttonMouseExited

    private void add_food_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_food_buttonActionPerformed
        Admin_Restaurant_Add_Food araf = new Admin_Restaurant_Add_Food();
        araf.show();
    }//GEN-LAST:event_add_food_buttonActionPerformed

    private void update_food_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_food_buttonMouseEntered
        update_food_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_update_food_buttonMouseEntered

    private void update_food_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_food_buttonMouseExited
        update_food_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_update_food_buttonMouseExited

    private void update_food_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_food_buttonActionPerformed
      String sql = "update restaurant_food set"
              + " food_type = '" + food_food_field.getText() + "',"
              + " weight = '" + weight_food_field.getText() + "',"
              + " price = '" + price_food_field.getText() + "'"
              + " where id =" + id_food_field.getText();
      
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Success");
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_update_food_buttonActionPerformed

    private void delete_food_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_food_buttonMouseEntered
        delete_food_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_delete_food_buttonMouseEntered

    private void delete_food_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_food_buttonMouseExited
        delete_food_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_delete_food_buttonMouseExited

    private void delete_food_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_food_buttonActionPerformed
        String query = "delete from restaurant_food where id =" + id_food_field.getText();
        
         try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Success");
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delete_food_buttonActionPerformed

    private void add_object_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_object_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add_object_buttonMouseEntered

    private void add_object_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_object_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_add_object_buttonMouseExited

    private void add_object_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_object_buttonActionPerformed
        Admin_Restaurant_Add_Object arao = new Admin_Restaurant_Add_Object();
        arao.show();
    }//GEN-LAST:event_add_object_buttonActionPerformed

    private void update_object_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_object_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_update_object_buttonMouseEntered

    private void update_object_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_object_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_update_object_buttonMouseExited

    private void update_object_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_object_buttonActionPerformed
       String sql = "update restaurant_object set"
              + " object_type = '" + object_object_field.getText() + "',"
              + " number = '" + number_object_field.getText() + "',"
              + " price = '" + price_object_field.getText() + "'"
              + " where id =" + id_object_field.getText();
      
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Success");
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_update_object_buttonActionPerformed

    private void delete_object_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_object_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_object_buttonMouseEntered

    private void delete_object_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_object_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_object_buttonMouseExited

    private void delete_object_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_object_buttonActionPerformed
        String query = "delete from restaurant_object where id =" + id_object_field.getText();
        
         try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Success");
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_delete_object_buttonActionPerformed

    private void add_staff_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_staff_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add_staff_buttonMouseEntered

    private void add_staff_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_staff_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_add_staff_buttonMouseExited

    private void add_staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_staff_buttonActionPerformed
        Admin_Restaurant_Add_Staff aras = new Admin_Restaurant_Add_Staff();
        aras.show();
    }//GEN-LAST:event_add_staff_buttonActionPerformed

    private void update_staff_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_staff_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_update_staff_buttonMouseEntered

    private void update_staff_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_staff_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_update_staff_buttonMouseExited

    private void update_staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_staff_buttonActionPerformed
         String sql = "update restaurant_staff set"
              + " name = '" + name_staff_field.getText() + "',"
              + " surname = '" + surname_staff_field.getText() + "',"
              + " role = '" + role_staff_field.getText() + "',"
              + " price = '" + price_staff_field.getText() + "',"
              + " date = '" + date_staff_field.getText() + "'"
              + " where id =" + id_staff_field.getText();
      
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Success");
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_update_staff_buttonActionPerformed

    private void delete_staff_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_staff_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_staff_buttonMouseEntered

    private void delete_staff_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_staff_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_staff_buttonMouseExited

    private void delete_staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_staff_buttonActionPerformed
        String query = "delete from restaurant_staff where id =" + id_staff_field.getText();
        
         try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Success");
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_delete_staff_buttonActionPerformed

    private void add_finance_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_finance_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add_finance_buttonMouseEntered

    private void add_finance_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_finance_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_add_finance_buttonMouseExited

    private void add_finance_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_finance_buttonActionPerformed
        Admin_Restaurant_Add_Finance araf = new Admin_Restaurant_Add_Finance();
        araf.show();
    }//GEN-LAST:event_add_finance_buttonActionPerformed

    private void update_finance_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_finance_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_update_finance_buttonMouseEntered

    private void update_finance_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_finance_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_update_finance_buttonMouseExited

    private void update_finance_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_finance_buttonActionPerformed
       String sql = "update restaurant_finance set"
              + " building_rent = '" + building_field.getText() + "',"
              + " eletricity_rent = '" + eletricity_field.getText() + "',"
              + " water_rent = '" + water_field.getText() + "',"
              + " health_rent = '" + health_field.getText() + "',"
              + " phone_rent = '" + phone_field.getText() + "',"
              + " state_rent ='" + state_field.getText() + "'," 
              + " date = '" + date_field.getText() + "'"
              + " where id =" + id_field.getText();
      
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Success");
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_update_finance_buttonActionPerformed

    private void delete_finance_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_finance_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_finance_buttonMouseEntered

    private void delete_finance_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_finance_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_finance_buttonMouseExited

    private void delete_finance_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_finance_buttonActionPerformed
         String query = "delete from restaurant_finance where id =" + id_field.getText();
        
         try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Success");
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delete_finance_buttonActionPerformed

    private void food_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_food_tableMouseClicked
        int i = food_table.getSelectedRow();
        TableModel model = food_table.getModel();
        id_food_field.setText(model.getValueAt(i, 0).toString());
        food_food_field.setText(model.getValueAt(i,1).toString());
        weight_food_field.setText(model.getValueAt(i,2).toString());
        price_food_field.setText(model.getValueAt(i,3).toString());
        date_food_field.setText(model.getValueAt(i,4).toString());     
    }//GEN-LAST:event_food_tableMouseClicked

    private void object_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_object_tableMouseClicked
        int i = object_table.getSelectedRow();
        TableModel model = object_table.getModel();
        id_object_field.setText(model.getValueAt(i, 0).toString());
        object_object_field.setText(model.getValueAt(i,1).toString());
        number_object_field.setText(model.getValueAt(i,2).toString());
        price_object_field.setText(model.getValueAt(i,3).toString());
        date_object_field.setText(model.getValueAt(i,4).toString());
    }//GEN-LAST:event_object_tableMouseClicked

    private void staff_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_tableMouseClicked
        int i = staff_table.getSelectedRow();
        TableModel model = staff_table.getModel();
        id_staff_field.setText(model.getValueAt(i, 0).toString());
        name_staff_field.setText(model.getValueAt(i,1).toString());
        surname_staff_field.setText(model.getValueAt(i,2).toString());
        role_staff_field.setText(model.getValueAt(i,3).toString());
        price_staff_field.setText(model.getValueAt(i,4).toString());
        date_staff_field.setText(model.getValueAt(i,5).toString());
    }//GEN-LAST:event_staff_tableMouseClicked

    private void finance_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finance_tableMouseClicked
        int i = finance_table.getSelectedRow();
        TableModel model = finance_table.getModel();
        id_field.setText(model.getValueAt(i, 0).toString());
        building_field.setText(model.getValueAt(i,1).toString());
        eletricity_field.setText(model.getValueAt(i,2).toString());
        water_field.setText(model.getValueAt(i,3).toString());
        health_field.setText(model.getValueAt(i,4).toString());
        phone_field.setText(model.getValueAt(i,5).toString());
        state_field.setText(model.getValueAt(i,6).toString());
        date_field.setText(model.getValueAt(i,7).toString());       
    }//GEN-LAST:event_finance_tableMouseClicked

    private void profile_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_buttonActionPerformed
        Admin_Profile ap = new Admin_Profile();
        ap.show();
        dispose();
    }//GEN-LAST:event_profile_buttonActionPerformed

    private void profile_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_buttonMouseExited
        profile_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_profile_buttonMouseExited

    private void profile_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_buttonMouseEntered
        profile_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_profile_buttonMouseEntered

    private void messages_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messages_buttonActionPerformed
        Admin_Messages am = new Admin_Messages();
        am.show();
        dispose();
    }//GEN-LAST:event_messages_buttonActionPerformed

    private void messages_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messages_buttonMouseExited
        messages_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_messages_buttonMouseExited

    private void messages_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messages_buttonMouseEntered
        messages_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_messages_buttonMouseEntered

    private void restaurant_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurant_buttonActionPerformed
        Admin_Resturant ar = new Admin_Resturant();
        ar.show();
        dispose();
    }//GEN-LAST:event_restaurant_buttonActionPerformed

    private void restaurant_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurant_buttonMouseExited
        restaurant_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_restaurant_buttonMouseExited

    private void restaurant_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurant_buttonMouseEntered
        restaurant_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_restaurant_buttonMouseEntered

    private void rooms_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rooms_buttonActionPerformed
        Admin_Rooms ar = new Admin_Rooms();
        ar.show();
        dispose();
    }//GEN-LAST:event_rooms_buttonActionPerformed

    private void rooms_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms_buttonMouseExited
        rooms_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_rooms_buttonMouseExited

    private void rooms_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms_buttonMouseEntered
        rooms_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_rooms_buttonMouseEntered

    private void news_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_news_buttonActionPerformed
        Admin_News an = new Admin_News();
        an.show();
        dispose();
    }//GEN-LAST:event_news_buttonActionPerformed

    private void news_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_news_buttonMouseExited
        news_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_news_buttonMouseExited

    private void news_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_news_buttonMouseEntered
        news_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_news_buttonMouseEntered

    private void gallery_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gallery_buttonActionPerformed
        Admin_Gallery ag = new Admin_Gallery();
        ag.show();
        dispose();
    }//GEN-LAST:event_gallery_buttonActionPerformed

    private void gallery_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery_buttonMouseExited
        gallery_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_gallery_buttonMouseExited

    private void gallery_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery_buttonMouseEntered
        gallery_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_gallery_buttonMouseEntered

    private void staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_buttonActionPerformed
        Admin_Staff af = new Admin_Staff();
        af.show();
        dispose();
    }//GEN-LAST:event_staff_buttonActionPerformed

    private void staff_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_buttonMouseExited
        staff_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_staff_buttonMouseExited

    private void staff_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_buttonMouseEntered
        staff_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_staff_buttonMouseEntered

    private void client_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_buttonActionPerformed
        Admin_Client ac = new Admin_Client();
        ac.show();
        dispose();
    }//GEN-LAST:event_client_buttonActionPerformed

    private void client_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_buttonMouseExited
        client_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_client_buttonMouseExited

    private void client_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_buttonMouseEntered
        client_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_client_buttonMouseEntered

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        Login_Side ls = new Login_Side();
        ls.show();
        dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void logout_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseExited
        logout_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_logout_buttonMouseExited

    private void logout_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseEntered
        logout_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_logout_buttonMouseEntered

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
            java.util.logging.Logger.getLogger(Admin_Resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Resturant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_finance_button;
    private javax.swing.JButton add_food_button;
    private javax.swing.JButton add_object_button;
    private javax.swing.JButton add_staff_button;
    private javax.swing.JTextField building_field;
    private javax.swing.JButton client_button;
    private javax.swing.JTextField date_field;
    private javax.swing.JTextField date_food_field;
    private javax.swing.JTextField date_object_field;
    private javax.swing.JTextField date_staff_field;
    private javax.swing.JButton delete_finance_button;
    private javax.swing.JButton delete_food_button;
    private javax.swing.JButton delete_object_button;
    private javax.swing.JButton delete_staff_button;
    private javax.swing.JTextField eletricity_field;
    private javax.swing.JTable finance_table;
    private javax.swing.JTextField food_food_field;
    private javax.swing.JTable food_table;
    private javax.swing.JButton gallery_button;
    private javax.swing.JTextField health_field;
    private javax.swing.JTextField id_field;
    private javax.swing.JTextField id_food_field;
    private javax.swing.JTextField id_object_field;
    private javax.swing.JTextField id_staff_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel label;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton messages_button;
    private javax.swing.JTextField name_staff_field;
    private javax.swing.JButton news_button;
    private javax.swing.JTextField number_object_field;
    private javax.swing.JTextField object_object_field;
    private javax.swing.JTable object_table;
    private javax.swing.JTextField phone_field;
    private javax.swing.JTextField price_food_field;
    private javax.swing.JTextField price_object_field;
    private javax.swing.JTextField price_staff_field;
    private javax.swing.JButton profile_button;
    private javax.swing.JButton restaurant_button;
    private javax.swing.JTextField role_staff_field;
    private javax.swing.JButton rooms_button;
    private javax.swing.JButton staff_button;
    private javax.swing.JTable staff_table;
    private javax.swing.JTextField state_field;
    private javax.swing.JTextField surname_staff_field;
    private javax.swing.JButton update_finance_button;
    private javax.swing.JButton update_food_button;
    private javax.swing.JButton update_object_button;
    private javax.swing.JButton update_staff_button;
    private javax.swing.JTextField water_field;
    private javax.swing.JTextField weight_food_field;
    // End of variables declaration//GEN-END:variables
}
