/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jshar
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    private DB4OUtil dB4OUtil;
    int ord;
    /**
     * Creates new form ManageOrderJPanel
     */
    public ManageOrderJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory, DB4OUtil dB4OUtil) {
        initComponents();
        deliveryManCombo.setVisible(false);
        btnAssignDriver.setVisible(false);
        List<String> deliveryManLst = new ArrayList<String>();
        for(DeliveryMan dm : ecoSystem.getDeliveryManDirectory().getDeliveryManDirectory()) {
            deliveryManLst.add(dm.getName());
        }
        String[] deliveryManArray = new String[deliveryManLst.size()];
        deliveryManArray = deliveryManLst.toArray(deliveryManArray);
        deliveryManCombo.setModel(new javax.swing.DefaultComboBoxModel(deliveryManArray));
        this.userProcessContainer = userProcessContainer;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = dB4OUtil.retrieveSystem();
        this.account = account;
        this.restaurantDirectory = this.ecoSystem.getRestaurantDirectory();
        this.menuDirectory = this.ecoSystem.getMenuDirectory();
        this.orderDirectory = this.ecoSystem.getOrderDirectory();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);
        
        for(Order order : ecoSystem.getOrderDirectory().getOrderDirectory()) {
            System.out.println(" Rest  " + account.getEmployee().getName() + "  " + order.getRestaurant().getRestaurantName());
            if(account.getEmployee().getName().equals(order.getRestaurant().getRestaurantName())) {
                Object [] row = new Object[5];
                row[0] = order;
                row[1] = order.getMenu().getItemName();
                row[2] = order.getQuantity();
                row[3] = order.getQuantity() * order.getMenu().getItemPrice();
                row[4] = order.getOrderStatus();
                dtm.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox<>();
        btnUpdateStatus = new javax.swing.JButton();
        deliveryManCombo = new javax.swing.JComboBox<>();
        btnAssignDriver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Item Name", "Quantity", "Price", "Order Status"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 32)); // NOI18N
        jLabel1.setText("Orders");

        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Update Order -");

        statusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Order Accepted", "Order Rejected", "Order Ready, Assign Driver", "Order out on Delivery", "Order Delivered" }));
        statusCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboActionPerformed(evt);
            }
        });

        btnUpdateStatus.setText("Update");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });

        deliveryManCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryManComboActionPerformed(evt);
            }
        });

        btnAssignDriver.setText("Assign");
        btnAssignDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDriverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateStatus)
                        .addGap(27, 27, 27)
                        .addComponent(deliveryManCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAssignDriver)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateStatus)
                    .addComponent(deliveryManCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssignDriver))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        String orderStatus = order.getOrderStatus();
        System.out.println("orderStatus----"+orderStatus);
        String status = statusCombo.getSelectedItem().toString();
        if(status.equalsIgnoreCase("Select") || orderStatus.equalsIgnoreCase(status)) {
            JOptionPane.showMessageDialog(null,"Please select the updated status", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(orderStatus.equals(Order.orderPlaced)) {
            if(status.equals(Order.orderAccepted))
                order.setOrderStatus(Order.orderAccepted);
            else if(status.equals(Order.orderRejected))
                order.setOrderStatus(Order.orderRejected);
            else {
                JOptionPane.showMessageDialog(null,"Please update correct status", "Warining", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        else if(orderStatus.equals(Order.orderAccepted)) {
            if(status.equals(Order.orderReady)){
                deliveryManCombo.setVisible(true);
                btnAssignDriver.setVisible(true);
                ord = selectedRow;
                btnUpdateStatus.setEnabled(false);
                statusCombo.setEnabled(false);
            }
            else {
                JOptionPane.showMessageDialog(null,"Please update correct status", "Warining", JOptionPane.WARNING_MESSAGE);
                return;
            }            
        }        
        else if(orderStatus.equals(Order.orderOnDelivery)) {
            if(status.equals(Order.orderDelivered)) {
                order.setOrderStatus(Order.orderDelivered);                
            }
            else {
                JOptionPane.showMessageDialog(null,"Please update correct status", "Warining", JOptionPane.WARNING_MESSAGE);
                return;
            }            
        }
        else {
            JOptionPane.showMessageDialog(null, "We will check on order. Please wait.");
            return;
        }
        dB4OUtil.storeSystem(ecoSystem);
        populateTable();
    }//GEN-LAST:event_btnUpdateStatusActionPerformed
    
    private void deliveryManComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryManComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryManComboActionPerformed

    private void statusComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboActionPerformed

    private void btnAssignDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDriverActionPerformed
        deliveryManCombo.setVisible(false);
        btnAssignDriver.setVisible(false);
        btnUpdateStatus.setEnabled(true);
        statusCombo.setEnabled(true);
        statusCombo.setSelectedItem(Order.orderOnDelivery);
        Order order = (Order)tblOrder.getValueAt(ord, 0);
//        for()
        order.setOrderStatus(Order.orderOnDelivery);
        dB4OUtil.storeSystem(ecoSystem);
        populateTable();        
    }//GEN-LAST:event_btnAssignDriverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignDriver;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JComboBox<String> deliveryManCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> statusCombo;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
}
