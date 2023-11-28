/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tamagui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
/**
 *
 * @author Christian
 */
public final class TamaGuiHome extends javax.swing.JFrame {
 
    private final StatScreen statsScreen; // Declare an instance of StatScreen
    private static ToDoList todoList;
    private String avatar;
    private int points;

    public TamaGuiHome() {
        initComponents();    
        statsScreen = new StatScreen(); // Initialize the instance
        StatScreenPanel.setLayout(new BorderLayout()); // Set layout manager for StatScreenPanel
        StatScreenPanel.add(statsScreen.getContentPane(), BorderLayout.CENTER); // Add StatScreen to StatScreenPanel
        todoList = new ToDoList();
        // Todo check with the team
        this.addTask(new Task("Task 1","Hard","1/1/24", "01:01")); 
        this.addTask(new Task("Task 2","Medium","2/2/24", "02:02")); 
        this.addTask(new Task("Task 3","Easy","3/3/24", "03:03"));
        String [] avatars = {"Crocodile", "Dog", "Owl", "Rabbit", "Radish", "Yippee"};
        Random rand = new Random();
        this.avatar = avatars[rand.nextInt(avatars.length)];
        String avatarPath =  "Images/Avatar/"+ avatar+ ".png"; 
        this.updateAvatar(avatarPath, this.avatar);
        // Lets give 10 starting points
        this.points = 10;
        PointsBar.setValue(this.points);
    }
    
    public void addTask(Task task) {
        todoList.add(task);
        this.ToDoList.setModel(todoList);
    }
    
    public void removeTask(int index) {
        todoList.remove(index);
    }
    
    public String getAvatar() {
        return this.avatar;
    }
    
    public void updateAvatar(String avatarImagePath, String avatarName){
        if (avatarName == null || avatarName.isEmpty()){
            Error error = new Error();
            error.SetErrorMsg("Select the avatar for update");
            error.setVisible(true);
            return;
        }
        ImageIcon iconLogo = new ImageIcon(new ImageIcon(avatarImagePath).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        Avatar.setIcon(iconLogo);
        AvatarName.setText(avatarName);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToDoListLabel = new javax.swing.JLabel();
        StatScreenPanel = new javax.swing.JPanel();
        InteractionPanel = new javax.swing.JPanel();
        Avatar = new javax.swing.JLabel();
        AvatarName = new javax.swing.JLabel();
        ToDoListPanel = new javax.swing.JScrollPane();
        ToDoList = new javax.swing.JList<>();
        PointsBar = new javax.swing.JProgressBar();
        PointsLabel = new javax.swing.JLabel();
        EditTaskButton = new javax.swing.JButton();
        AddTaskButton = new javax.swing.JButton();
        RemoveTaskButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ToDoListLabel.setText("To-Do List");

        javax.swing.GroupLayout StatScreenPanelLayout = new javax.swing.GroupLayout(StatScreenPanel);
        StatScreenPanel.setLayout(StatScreenPanelLayout);
        StatScreenPanelLayout.setHorizontalGroup(
            StatScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        StatScreenPanelLayout.setVerticalGroup(
            StatScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );

        InteractionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InteractionPanelMouseClicked(evt);
            }
        });

        AvatarName.setText("Avatar Name");

        javax.swing.GroupLayout InteractionPanelLayout = new javax.swing.GroupLayout(InteractionPanel);
        InteractionPanel.setLayout(InteractionPanelLayout);
        InteractionPanelLayout.setHorizontalGroup(
            InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InteractionPanelLayout.createSequentialGroup()
                .addGroup(InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InteractionPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(AvatarName))
                    .addGroup(InteractionPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InteractionPanelLayout.setVerticalGroup(
            InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InteractionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AvatarName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        ToDoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ToDoListPanel.setViewportView(ToDoList);

        PointsBar.setStringPainted(true);

        PointsLabel.setText("Points");

        EditTaskButton.setText("Edit Task");
        EditTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTaskButtonActionPerformed(evt);
            }
        });

        AddTaskButton.setText("Add Task");
        AddTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTaskButtonActionPerformed(evt);
            }
        });

        RemoveTaskButton.setText("Remove Task");
        RemoveTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTaskButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ToDoListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(ToDoListLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EditTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(InteractionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(StatScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PointsLabel)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(RemoveTaskButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(PointsBar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(ToDoListLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PointsLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PointsBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InteractionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditTaskButton)
                            .addComponent(AddTaskButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RemoveTaskButton)
                        .addGap(24, 24, 24)
                        .addComponent(StatScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ToDoListPanel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    


    private void InteractionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InteractionPanelMouseClicked
        InteractionScreen inter = new InteractionScreen(this);
        inter.setVisible(true);
    }//GEN-LAST:event_InteractionPanelMouseClicked

    private void AddTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTaskButtonActionPerformed
        addTask AddTask = new addTask(this);
        AddTask.setVisible(true);
    }//GEN-LAST:event_AddTaskButtonActionPerformed

    private void RemoveTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTaskButtonActionPerformed

        int SelectedIndex = this.ToDoList.getSelectedIndex();
        //Object task = this.ToDoList.getSelectedValues();
        if (SelectedIndex == -1) {
            Error error = new Error();
            error.SetErrorMsg("Select the Task for removal");
            error.setVisible(true);
            return;
        }
        if (this.ToDoList.getModel().getSize() == 0 ){
            Error error = new Error();
            error.SetErrorMsg("No Task remaining for removal");
            error.setVisible(true);
            return;
        }
        
        String task = this.ToDoList.getModel().getElementAt(SelectedIndex);
        System.out.println("Removing Task: "+ task);
        this.removeTask(SelectedIndex);
        
        // Update points based on difficulty
        String []tasks= task.split("-");
        String difficulty = tasks[1].trim();
        switch (difficulty) {
            case "Easy": 
                this.addPoints(3);
                break;
            case "Medium":
                this.addPoints(5);
                break;
            default: 
                this.addPoints(10);
        }
        
    }//GEN-LAST:event_RemoveTaskButtonActionPerformed

    private void EditTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTaskButtonActionPerformed
        // TODO add your handling code here:
        int SelectedIndex = this.ToDoList.getSelectedIndex();
        if (SelectedIndex == -1) {
            Error error = new Error();
            error.SetErrorMsg("Select the Task for editing");
            error.setVisible(true);
            return;
        }
        if (this.ToDoList.getModel().getSize() == 0 ){
            Error error = new Error();
            error.SetErrorMsg("No Task remaining for editing");
            error.setVisible(true);
            return;
        }
        String task = this.ToDoList.getModel().getElementAt(SelectedIndex);
        System.out.println("Editing Task: "+ task);
        String []tasks= task.split("-");
        this.removeTask(SelectedIndex);
        
        addTask AddTask = new addTask(this, tasks[0].trim(),tasks[1].trim(), tasks[2].trim(),tasks[3].trim());
        AddTask.setVisible(true);
        // On edit don't 
    }//GEN-LAST:event_EditTaskButtonActionPerformed

    public void addPoints(int points) {

        //OverFlow
        if (this.points + points > 100){
            this.points=100;
        }else if (this.points + points <= 0) {
            // underflow
            this.points =0;
        }else {
             this.points += points;
        }
        PointsBar.setValue(this.points);
    }
    
    public int getPoints() {
        return this.points;
    }

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
            java.util.logging.Logger.getLogger(TamaGuiHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TamaGuiHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TamaGuiHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TamaGuiHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TamaGuiHome().setVisible(true);
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTaskButton;
    private javax.swing.JLabel Avatar;
    private javax.swing.JLabel AvatarName;
    private javax.swing.JButton EditTaskButton;
    private javax.swing.JPanel InteractionPanel;
    private javax.swing.JProgressBar PointsBar;
    private javax.swing.JLabel PointsLabel;
    private javax.swing.JButton RemoveTaskButton;
    private javax.swing.JPanel StatScreenPanel;
    private javax.swing.JList<String> ToDoList;
    private javax.swing.JLabel ToDoListLabel;
    private javax.swing.JScrollPane ToDoListPanel;
    // End of variables declaration//GEN-END:variables
}
