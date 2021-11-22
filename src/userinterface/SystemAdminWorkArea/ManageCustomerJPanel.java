/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DB4OUtil.DB4OUtil;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jshar
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer; 
    private EcoSystem ecoSystem; 
    private CustomerDirectory customerDirectory;
    private DB4OUtil dB4OUtil;
    
    /**
     * Creates new form ManageCustomer
     */
    public ManageCustomerJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, CustomerDirectory customerDirectory, DB4OUtil dB4OUtil) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = dB4OUtil.retrieveSystem();
        this.customerDirectory = this.ecoSystem.getCustomerDirectory();
        populateTable();
        
    }
    
    public void populateTable() {
        ecoSystem = dB4OUtil.retrieveSystem();        
        DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();
        dtm.setRowCount(0);
        for(Customer customer : ecoSystem.getCustomerDirectory().getCustomerDirectory()){
            Object [] row = new Object[6];
            row[0] = customer;
            row[1] = customer.getName();
            row[2] = customer.getAddress();
            row[3] = customer.getPhone();
            row[4] = customer.getEmail();
            row[5] = customer.getAge();
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 32)); // NOI18N
        jLabel1.setText("Manage Customer");

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Name ", "Address", "Mobile Number", "Email Address", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        btnModify.setText("Update");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCreate)
                            .addGap(18, 18, 18)
                            .addComponent(btnModify)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addGap(183, 183, 183)
                            .addComponent(jLabel1))))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Customer customer = (Customer)tblCustomer.getValueAt(selectedRow,0);
        ModifyCustomerJPanel modifyCustomer = new ModifyCustomerJPanel(userProcessContainer, ecoSystem, customerDirectory, customer, dB4OUtil);
        userProcessContainer.add("ModifyCustomersJPanel",modifyCustomer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateCustomerJPanel createCustomer = new CreateCustomerJPanel(userProcessContainer, ecoSystem, customerDirectory, dB4OUtil);
        userProcessContainer.add("CreateCustomersJPanel",createCustomer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        ecoSystem = dB4OUtil.retrieveSystem();
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Customer customer = (Customer) tblCustomer.getValueAt(selectedRow, 0);
        customerDirectory.removeCustomer(customer);
        Employee employee;
        for(Employee e : ecoSystem.getEmployeeDirectory().getEmployeeList()) {
            if(e.getName() == customer.getName()) {
                employee = e;
                break;
            }
        }
        ecoSystem.getUserAccountDirectory().deleteUserAccount(customer.getUsername()); //.getUserAccountDirectory(). createUserAccount(userName, password, employee, new CustomerRole());
        dB4OUtil.storeSystem(ecoSystem);
        populateTable();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed


        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        SystemAdminWorkAreaJPanel mcjp = (SystemAdminWorkAreaJPanel) component;
        mcjp.populateOnBack(dB4OUtil);
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables
}

