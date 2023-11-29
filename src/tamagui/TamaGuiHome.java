/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tamagui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
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
    private int minuteTicks;

    public TamaGuiHome() {
        //set up UI
        initComponents();    
        statsScreen = new StatScreen(); // Initialize the instance
        StatScreenPanel.setLayout(new BorderLayout()); // Set layout manager for StatScreenPanel
        StatScreenPanel.add(statsScreen.getContentPane(), BorderLayout.CENTER); // Add StatScreen to StatScreenPanel
        todoList = new ToDoList();
        HealthBar.setValue(100);
        
        EditTaskButton.setEnabled(false);
        CompleteTaskButton.setEnabled(false);
        RemoveTaskButton.setEnabled(false);
        
        
        this.addTask(new Task("Task 1","Hard","11/02/2023", "01:11")); 
        this.addTask(new Task("Task 2","Medium","11/12/2023", "12:02")); 
        this.addTask(new Task("Task 3","Easy","01/01/2024", "23:09"));
        
        //set up avatar
        String [] avatars = {"Crocodile", "Dog", "Owl", "Rabbit", "Radish"};
        Random rand = new Random();
        this.avatar = avatars[rand.nextInt(avatars.length)];
        String avatarPath =  "Images/Avatar/"+ avatar+ ".png"; 
        this.updateAvatar(avatarPath, this.avatar);
        
        // Lets give 10 starting points
        this.points = 10;
        PointsCounter.setText(String.valueOf(points));

        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor(); 
        executor.scheduleAtFixedRate(() -> {
            // Your task that needs to run every minute
            System.out.println("Application is running at " + new java.util.Date());
            statsScreen.updateHappiness(-1);
            statsScreen.updateFullness(-1);
            statsScreen.updateEntertained(-1);
            /*
            this.minuteTicks++;
            if (this.minuteTicks%60 == 0) {
                System.out.println("Decrement Happines at " + new java.util.Date());
                statsScreen.updateHappiness(-1);

            } else if (this.minuteTicks%10 == 0) {
                System.out.println("Decrement Fullness at  " + new java.util.Date());
                statsScreen.updateFullness(-1);
            } else if (this.minuteTicks%5 == 0) {
               System.out.println("Decrement Entertained at " + new java.util.Date());
               statsScreen.updateEntertained(-1);
            }
            
            //reset timer after 2 hours
            if (this.minuteTicks > 120){
                this.minuteTicks = 0;
            }*/
              
        }, 0, 1, TimeUnit.SECONDS);
        ScheduledExecutorService executorHealth = Executors.newSingleThreadScheduledExecutor(); 
        executorHealth.scheduleAtFixedRate(() -> {
            int health= (3*this.getFullness()+2*this.getEntertained() + this.getHappiness())/6;
            HealthBar.setValue(health);      
        }, 0, 1, TimeUnit.SECONDS); 
    }
    
    public void addTask(Task task) {
        todoList.add(task);
        this.ToDoList.setModel(todoList);
        updateTaskCounter();
    }
    
    public void removeTask(int index) {
        todoList.remove(index);
        updateTaskCounter();
    }
    
    public String getAvatar() {
        return this.avatar;
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public void updateAvatar(String avatarImagePath, String avatarName){
        if (avatarName == null || avatarName.isEmpty()){
            Error error = new Error();
            error.SetErrorMsg("Select the avatar for update");
            error.setVisible(true);
            return;
        }
        ImageIcon iconLogo = new ImageIcon(
                new ImageIcon(avatarImagePath).getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
        Avatar.setIcon(iconLogo);
        AvatarName.setText(avatarName);
        this.avatar = avatarName;
    }
    
    public void updateTaskCounter() {
         TaskCounter.setText(String.valueOf(  this.ToDoList.getModel().getSize()));
    }
    
    public void updateFullness(int points) {
         statsScreen.updateFullness(points);
    }
    
    public void updateEntertained(int points) {
         statsScreen.updateEntertained(points);
    }
    
    public void updateHappiness(int points) {
         statsScreen.updateHappiness(points);
    }
    
    public int getFullness() {
        return statsScreen.getFullness();
    }
    
    public int getEntertained() {
        return statsScreen.getEntertained();
    }
    
    public int getHappiness() {
        return statsScreen.getHappiness();
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
        ToDoListPanel = new javax.swing.JScrollPane();
        ToDoList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        InteractionPanel = new javax.swing.JPanel();
        Avatar = new javax.swing.JLabel();
        AvatarName = new javax.swing.JLabel();
        PointsLabel = new javax.swing.JLabel();
        HealthBar = new javax.swing.JProgressBar();
        PointsCounter = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EditTaskButton = new javax.swing.JButton();
        AddTaskButton = new javax.swing.JButton();
        CompleteTaskButton = new javax.swing.JButton();
        RemoveTaskButton = new javax.swing.JButton();
        TaskCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        ToDoListLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ToDoListLabel.setText("To-Do List");

        javax.swing.GroupLayout StatScreenPanelLayout = new javax.swing.GroupLayout(StatScreenPanel);
        StatScreenPanel.setLayout(StatScreenPanelLayout);
        StatScreenPanelLayout.setHorizontalGroup(
            StatScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        StatScreenPanelLayout.setVerticalGroup(
            StatScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        ToDoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ToDoList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ToDoListValueChanged(evt);
            }
        });
        ToDoListPanel.setViewportView(ToDoList);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        InteractionPanel.setBackground(new java.awt.Color(255, 255, 255));
        InteractionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        InteractionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InteractionPanelMouseClicked(evt);
            }
        });

        Avatar.setBackground(new java.awt.Color(255, 255, 255));
        Avatar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        AvatarName.setText("Avatar Name");

        PointsLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        PointsLabel.setText("Points");

        HealthBar.setStringPainted(true);

        PointsCounter.setFont(new java.awt.Font("Helvetica Neue", 0, 32)); // NOI18N
        PointsCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PointsCounter.setText("0");

        jLabel1.setText("Health Points");

        javax.swing.GroupLayout InteractionPanelLayout = new javax.swing.GroupLayout(InteractionPanel);
        InteractionPanel.setLayout(InteractionPanelLayout);
        InteractionPanelLayout.setHorizontalGroup(
            InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InteractionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HealthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InteractionPanelLayout.createSequentialGroup()
                        .addGroup(InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InteractionPanelLayout.createSequentialGroup()
                                .addGroup(InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AvatarName)
                                    .addGroup(InteractionPanelLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PointsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PointsCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(InteractionPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InteractionPanelLayout.setVerticalGroup(
            InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InteractionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InteractionPanelLayout.createSequentialGroup()
                        .addComponent(AvatarName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InteractionPanelLayout.createSequentialGroup()
                        .addComponent(PointsCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PointsLabel)))
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        CompleteTaskButton.setText("Complete Task");
        CompleteTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteTaskButtonActionPerformed(evt);
            }
        });

        RemoveTaskButton.setText("Remove Task");
        RemoveTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTaskButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(InteractionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddTaskButton)
                            .addComponent(EditTaskButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CompleteTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addComponent(RemoveTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(InteractionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTaskButton)
                    .addComponent(RemoveTaskButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditTaskButton)
                    .addComponent(CompleteTaskButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        TaskCounter.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        TaskCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TaskCounter.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToDoListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ToDoListLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TaskCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StatScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ToDoListLabel)
                            .addComponent(TaskCounter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToDoListPanel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
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

    private void CompleteTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteTaskButtonActionPerformed

        int SelectedIndex = this.ToDoList.getSelectedIndex();
        String task = this.ToDoList.getModel().getElementAt(SelectedIndex);
        System.out.println("Removing Completed Task: "+ task);
        this.removeTask(SelectedIndex);
        String []tasks= task.split("-");
        String difficulty = tasks[1].trim();
        switch (difficulty) {
            case "Easy" -> this.addPoints(3);
            case "Medium" -> this.addPoints(5);
            default -> this.addPoints(7);
        }
    }//GEN-LAST:event_CompleteTaskButtonActionPerformed

    private void EditTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTaskButtonActionPerformed
        // TODO add your handling code here:
        int SelectedIndex = this.ToDoList.getSelectedIndex();
        String task = this.ToDoList.getModel().getElementAt(SelectedIndex);
        System.out.println("Editing Task: "+ task);
        String []tasks= task.split("-");
        this.removeTask(SelectedIndex);
        
        addTask AddTask = new addTask(this, tasks[0].trim(),tasks[1].trim(), tasks[2].trim(),tasks[3].trim());
        AddTask.setVisible(true);
        
    }//GEN-LAST:event_EditTaskButtonActionPerformed

    private void ToDoListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ToDoListValueChanged
        // TODO add your handling code here:
        if (evt.getValueIsAdjusting() == false) {

            if (ToDoList.getSelectedIndex() == -1) {
                //No selection, disable buttons
                EditTaskButton.setEnabled(false);
                CompleteTaskButton.setEnabled(false);
                RemoveTaskButton.setEnabled(false);

            } else {
                //Selection, enable buttons
                EditTaskButton.setEnabled(true);
                CompleteTaskButton.setEnabled(true);
                RemoveTaskButton.setEnabled(true);
            }
        }
    }//GEN-LAST:event_ToDoListValueChanged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        ToDoList.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void RemoveTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTaskButtonActionPerformed
        int SelectedIndex = this.ToDoList.getSelectedIndex();
        String task = this.ToDoList.getModel().getElementAt(SelectedIndex);
        System.out.println("Removing Task: "+ task);
        this.removeTask(SelectedIndex);
    }//GEN-LAST:event_RemoveTaskButtonActionPerformed

    public void addPoints(int points) {
        //OverFlow
        if (this.points + points > 1000){
            this.points = 1000;
        }else if (this.points + points <= 0) {
            // underflow
            this.points = 0;
        }else {
             this.points += points;
        }
        PointsCounter.setText(String.valueOf(this.points));
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
    private javax.swing.JButton CompleteTaskButton;
    private javax.swing.JButton EditTaskButton;
    private javax.swing.JProgressBar HealthBar;
    private javax.swing.JPanel InteractionPanel;
    private javax.swing.JLabel PointsCounter;
    private javax.swing.JLabel PointsLabel;
    private javax.swing.JButton RemoveTaskButton;
    private javax.swing.JPanel StatScreenPanel;
    private javax.swing.JLabel TaskCounter;
    private javax.swing.JList<String> ToDoList;
    private javax.swing.JLabel ToDoListLabel;
    private javax.swing.JScrollPane ToDoListPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
