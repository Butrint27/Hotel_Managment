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
    }

   public void scaleImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\img\\hotel_prishtina_logo.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        add_food_button = new javax.swing.JButton();
        update_food_button = new javax.swing.JButton();
        delete_food_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        add_object_button = new javax.swing.JButton();
        update_object_button = new javax.swing.JButton();
        delete_object_button = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        add_staff_button = new javax.swing.JButton();
        update_staff_button = new javax.swing.JButton();
        delete_staff_button = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        add_finance_button = new javax.swing.JButton();
        update_finance_button = new javax.swing.JButton();
        delete_finance_button = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Food Type", "Weight", "Price", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(526, 526, 526)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_food_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_food_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_food_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(add_food_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update_food_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_food_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 137, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(237, 200, 119));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Object-Supply");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Object Type", "Number", "Price", "Date"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_object_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_object_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_object_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(add_object_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update_object_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_object_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Role", "Date"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(431, 431, 431))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_staff_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_staff_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_staff_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(add_staff_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update_staff_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_staff_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
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

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(517, 517, 517))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_finance_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_finance_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_finance_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(add_finance_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update_finance_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_finance_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)))
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

    private void messages_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messages_buttonMouseExited
        messages_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_messages_buttonMouseExited

    private void messages_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messages_buttonMouseEntered
        messages_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_messages_buttonMouseEntered

    private void history_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_buttonActionPerformed
        Admin_History ah = new Admin_History();
        ah.show();
        dispose();
    }//GEN-LAST:event_history_buttonActionPerformed

    private void history_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_buttonMouseExited
        history_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_history_buttonMouseExited

    private void history_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_buttonMouseEntered
        history_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_history_buttonMouseEntered

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

    private void add_food_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_food_buttonMouseEntered
        add_food_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_add_food_buttonMouseEntered

    private void add_food_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_food_buttonMouseExited
        add_food_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_add_food_buttonMouseExited

    private void add_food_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_food_buttonActionPerformed
        Add_Client ac = new Add_Client();
        ac.show();
    }//GEN-LAST:event_add_food_buttonActionPerformed

    private void update_food_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_food_buttonMouseEntered
        update_food_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_update_food_buttonMouseEntered

    private void update_food_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_food_buttonMouseExited
        update_food_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_update_food_buttonMouseExited

    private void update_food_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_food_buttonActionPerformed
       
    }//GEN-LAST:event_update_food_buttonActionPerformed

    private void delete_food_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_food_buttonMouseEntered
        delete_food_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_delete_food_buttonMouseEntered

    private void delete_food_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_food_buttonMouseExited
        delete_food_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_delete_food_buttonMouseExited

    private void delete_food_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_food_buttonActionPerformed
       
    }//GEN-LAST:event_delete_food_buttonActionPerformed

    private void add_object_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_object_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add_object_buttonMouseEntered

    private void add_object_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_object_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_add_object_buttonMouseExited

    private void add_object_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_object_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_object_buttonActionPerformed

    private void update_object_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_object_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_update_object_buttonMouseEntered

    private void update_object_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_object_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_update_object_buttonMouseExited

    private void update_object_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_object_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_object_buttonActionPerformed

    private void delete_object_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_object_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_object_buttonMouseEntered

    private void delete_object_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_object_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_object_buttonMouseExited

    private void delete_object_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_object_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_object_buttonActionPerformed

    private void add_staff_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_staff_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add_staff_buttonMouseEntered

    private void add_staff_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_staff_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_add_staff_buttonMouseExited

    private void add_staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_staff_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_staff_buttonActionPerformed

    private void update_staff_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_staff_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_update_staff_buttonMouseEntered

    private void update_staff_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_staff_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_update_staff_buttonMouseExited

    private void update_staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_staff_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_staff_buttonActionPerformed

    private void delete_staff_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_staff_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_staff_buttonMouseEntered

    private void delete_staff_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_staff_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_staff_buttonMouseExited

    private void delete_staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_staff_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_staff_buttonActionPerformed

    private void add_finance_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_finance_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add_finance_buttonMouseEntered

    private void add_finance_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_finance_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_add_finance_buttonMouseExited

    private void add_finance_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_finance_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_finance_buttonActionPerformed

    private void update_finance_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_finance_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_update_finance_buttonMouseEntered

    private void update_finance_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_finance_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_update_finance_buttonMouseExited

    private void update_finance_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_finance_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_finance_buttonActionPerformed

    private void delete_finance_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_finance_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_finance_buttonMouseEntered

    private void delete_finance_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_finance_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_finance_buttonMouseExited

    private void delete_finance_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_finance_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_finance_buttonActionPerformed

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
    private javax.swing.JButton client_button;
    private javax.swing.JButton delete_finance_button;
    private javax.swing.JButton delete_food_button;
    private javax.swing.JButton delete_object_button;
    private javax.swing.JButton delete_staff_button;
    private javax.swing.JButton gallery_button;
    private javax.swing.JButton history_button;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel label;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton messages_button;
    private javax.swing.JButton news_button;
    private javax.swing.JButton profile_button;
    private javax.swing.JButton restaurant_button;
    private javax.swing.JButton rooms_button;
    private javax.swing.JButton staff_button;
    private javax.swing.JButton update_finance_button;
    private javax.swing.JButton update_food_button;
    private javax.swing.JButton update_object_button;
    private javax.swing.JButton update_staff_button;
    // End of variables declaration//GEN-END:variables
}
