import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class PhoneBookGUI extends javax.swing.JFrame {
    
      private ArrayList<Contact> contacts = new ArrayList<>();

   
 public PhoneBookGUI() {
    initComponents();   // Initializes the GUI components
    setTitle("Phonebook Application");  // Set the window title

    // Use relative path for image stored in src folder
    ImagePanel panel = new ImagePanel("src/123.jpg");  // Replace with your actual image file name
    panel.setLayout(null);  // Set layout to null to control exact placement

    // Create a JLayeredPane to stack the image and the components
    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setPreferredSize(new java.awt.Dimension(600, 500));

    // Add the ImagePanel to the first layer (background)
    panel.setBounds(0, 0, 600, 500);  // Set size and position of the background
    layeredPane.add(panel, JLayeredPane.DEFAULT_LAYER);

    // Add the components to the second layer (foreground)
    getContentPane().setLayout(null);  // Set layout manager for your components
    layeredPane.add(getContentPane(), JLayeredPane.PALETTE_LAYER); // Adds your components on top of the image

    // Set the layered pane as the content pane of the JFrame
    setContentPane(layeredPane);
    pack(); // Resize the frame based on the content
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        sortButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Phone Number:");

        nameField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        phoneField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        insertButton.setBackground(new java.awt.Color(0, 255, 0));
        insertButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        insertButton.setForeground(new java.awt.Color(0, 0, 0));
        insertButton.setText("Insert Contact");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(255, 153, 51));
        searchButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        searchButton.setText("Search Contact");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        displayButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        displayButton.setText("Display All Contacts");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 0, 51));
        deleteButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        deleteButton.setText("Delete Contact");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 153, 255));
        updateButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        updateButton.setText("Update Contact");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        sortButton.setBackground(new java.awt.Color(255, 255, 51));
        sortButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        sortButton.setText("Sort Contacts");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        displayArea.setColumns(20);
        displayArea.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        displayArea.setRows(5);
        jScrollPane2.setViewportView(displayArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(phoneField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertButton)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)
                        .addGap(18, 18, 18)
                        .addComponent(displayButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(sortButton)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertButton)
                    .addComponent(searchButton)
                    .addComponent(displayButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(sortButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
    String name = nameField.getText().trim();
        String phoneNumber = phoneField.getText().trim();

        if (name.isEmpty() || phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both name and phone number.");
            return;
        }

        Contact newContact = new Contact(name, phoneNumber);
        contacts.add(newContact);
        JOptionPane.showMessageDialog(this, "Contact added.");

        // Clear the input fields after adding a contact
        nameField.setText("");
        phoneField.setText("");
    }//GEN-LAST:event_insertButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       String name = nameField.getText().trim();
        String newPhoneNumber = phoneField.getText().trim();

        if (name.isEmpty() || newPhoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both name and new phone number.");
            return;
        }

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhoneNumber(newPhoneNumber);
                JOptionPane.showMessageDialog(this, "Contact updated.");
                displayButtonActionPerformed(evt); // Refresh the display
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Contact not found.");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
  String name = nameField.getText().trim();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name to search.");
            return;
        }

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                JOptionPane.showMessageDialog(this, "Contact found: " + contact);
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Contact not found.");
    }//GEN-LAST:event_searchButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
         StringBuilder allContacts = new StringBuilder();

        if (contacts.isEmpty()) {
            displayArea.setText("No contacts available.");
            return;
        }

        for (Contact contact : contacts) {
            allContacts.append(contact).append("\n");
        }

        displayArea.setText(allContacts.toString());
    }//GEN-LAST:event_displayButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
      String name = nameField.getText().trim();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name to delete.");
            return;
        }

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                JOptionPane.showMessageDialog(this, "Contact deleted.");
                displayButtonActionPerformed(evt); // Refresh the display
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Contact not found.");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
          contacts.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        JOptionPane.showMessageDialog(this, "Contacts sorted.");
        displayButtonActionPerformed(evt); // Refresh the display
    
    }//GEN-LAST:event_sortButtonActionPerformed

    public static void main(String args[]) {
    try {
        // Iterate through installed look and feels
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            // Check if Nimbus is available
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception e) {
        // Handle exception if Nimbus is not available
        java.util.logging.Logger.getLogger(PhoneBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new PhoneBookGUI().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JButton displayButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton sortButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
