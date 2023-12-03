/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tamagui;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Maya
 */
public final class InventoryAccessory extends javax.swing.JFrame {
    private final TamaGuiHome home;
    private final Item[] inventory; 
    /**
     * Creates new form AccessoryInventory
     * @param home
     */
    public InventoryAccessory(TamaGuiHome home) {
        initComponents();
        this.home = home;
        Item [] items = {
            new Item("Bow",30,0,0),
            new Item("Glasses",50,0,0),
            new Item("Duck",100,0,0),
        };        
        addAccessories(items);
        this.inventory = items;
        Cost.setVisible(false);
        CostValue.setVisible(false);
    }
 
    public void addAccessories(Item[] items){
       AccessoryList.setModel(new javax.swing.AbstractListModel<String>() {
            @Override
            public int getSize() { return items.length; }
            @Override
            public String getElementAt(int i) { return items[i].getName(); }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Accessory = new javax.swing.JPanel();
        AccessoryPanel = new javax.swing.JScrollPane();
        AccessoryList = new javax.swing.JList<>();
        UseItem = new javax.swing.JButton();
        AccessoryImage = new javax.swing.JLabel();
        Cost = new javax.swing.JLabel();
        CostValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Equip Accessory");

        AccessoryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AccessoryListValueChanged(evt);
            }
        });
        AccessoryPanel.setViewportView(AccessoryList);

        UseItem.setText("Equip");
        UseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseItemActionPerformed(evt);
            }
        });

        Cost.setText("Cost:");

        CostValue.setText("00");

        javax.swing.GroupLayout AccessoryLayout = new javax.swing.GroupLayout(Accessory);
        Accessory.setLayout(AccessoryLayout);
        AccessoryLayout.setHorizontalGroup(
            AccessoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccessoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AccessoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AccessoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccessoryLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(CostValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AccessoryLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AccessoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AccessoryImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AccessoryLayout.createSequentialGroup()
                                .addComponent(UseItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        AccessoryLayout.setVerticalGroup(
            AccessoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccessoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccessoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AccessoryPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AccessoryLayout.createSequentialGroup()
                        .addComponent(AccessoryImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addGroup(AccessoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CostValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UseItem)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Accessory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Accessory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccessoryListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AccessoryListValueChanged
    String accessory = AccessoryList.getSelectedValue();
        String accessoryIconPath = "Images/Accessory/" + accessory + ".png";
        ImageIcon accessoryIcon = new ImageIcon(new ImageIcon(accessoryIconPath).getImage().getScaledInstance(120, 200, Image.SCALE_DEFAULT));
        AccessoryImage.setIcon(accessoryIcon); 
        AccessoryImage.setVisible(true);
        // Find item from inventory
        Item selectedItem = this.inventory[0];
        boolean found=false;
        for (Item item : this.inventory) {
            if (accessory.equals(item.getName())) {
                selectedItem =  item;
                found = true;
            }
        }
        if (found == false) {
            Error error = new Error();
            error.SetErrorMsg("Could not load inventory");
            error.setVisible(true);
            return;
        }
        CostValue.setText(String.valueOf(selectedItem.getCost()));
        Cost.setVisible(true);
        CostValue.setVisible(true);
    }//GEN-LAST:event_AccessoryListValueChanged

    private void UseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseItemActionPerformed
        String accessory = AccessoryList.getSelectedValue();
        if (accessory == null || accessory.isEmpty()){
            Error error = new Error();
            error.SetErrorMsg("Select the accesory for update");
            error.setVisible(true);
            return;
        }
        // Find item from inventory
        Item selectedItem = this.inventory[0];
        boolean found=false;
        for (Item item : this.inventory) {
            if (accessory.equals(item.getName())) {
                selectedItem =  item;
                found = true;
            }
        }
        if (found == false) {
            Error error = new Error();
            error.SetErrorMsg("Could not load inventory");
            error.setVisible(true);
            return;
        }
        int availablePoints = this.home.getPoints();
        if (availablePoints < selectedItem.getCost()) {
            Error error = new Error();
            error.SetErrorMsg("Insufficient points");
            error.setVisible(true);
            return;
        } else {
            this.home.addPoints(-1*selectedItem.getCost());
        }
        String avatarName = this.home.getAvatarName();
        String avatarImagePath =  "Images/Avatar/"+ accessory +"/"+avatarName+ ".png"; 
        System.out.println("Selecting avatar: "+ avatarImagePath + " with accessory: "+ accessory);
        this.home.updateAvatar(avatarImagePath, avatarName);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_UseItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Accessory;
    private javax.swing.JLabel AccessoryImage;
    private javax.swing.JList<String> AccessoryList;
    private javax.swing.JScrollPane AccessoryPanel;
    private javax.swing.JLabel Cost;
    private javax.swing.JLabel CostValue;
    private javax.swing.JButton UseItem;
    // End of variables declaration//GEN-END:variables
}
