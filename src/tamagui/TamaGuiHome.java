/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tamagui;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;


/**
 *
 * @author Christian
 */
public final class TamaGuiHome extends javax.swing.JFrame {
 
    private final InteractionScreen interactionScreen; // Declare an instance of StatScreen
    private static ToDoList todoList;
    private String avatar;
    private String accessory;
    private String health;
    private int points;

    public TamaGuiHome() {
        initComponents();
        this.interactionScreen = new InteractionScreen(this);
        todoList = new ToDoList();
        EditTaskButton.setEnabled(false);
        CompleteTaskButton.setEnabled(false);
        RemoveTaskButton.setEnabled(false);
        this.accessory = "Default";
        this.health = "Healthy";
        
        this.addTask(new Task("Task 1","Hard","11/02/2023", "01:11")); 
        this.addTask(new Task("Task 2","Medium","11/12/2023", "12:02")); 
        this.addTask(new Task("Task 3","Easy","01/01/2024", "23:09"));
        
        //set up avatar
        String [] avatars = {"Ozzo", "Shey", "Milo", "Petunia", "Tee"};
        Random rand = new Random();
        this.avatar = avatars[rand.nextInt(avatars.length)];
        String avatarPath =  "Images/Avatar/"+ this.health + "/"+ this.accessory+"/" +avatar+ ".png"; 
        this.updateAvatar(avatarPath, this.avatar);
        
        // Lets give 300 starting points
        this.points = 300;
        PointsCounter.setText(String.valueOf(points));
        this.setVisible(true);
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
    
    public String getAvatarName() {
        return this.avatar;
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public void setHealth(String health) {
        this.health = health;
    }
    
    public String getHealth() {
        return this.health;
    }
    
    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }
    
    public String getAccessory() {
        return this.accessory;
    }
    
    public void updateAvatar(String avatarImagePath, String avatarName){
        if (avatarName == null || avatarName.isEmpty()){
            return;
        }
        ImageIcon iconLogo = new ImageIcon(
                new ImageIcon(avatarImagePath).getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
        Avatar.setIcon(iconLogo);
        AvatarName.setText(avatarName);
        this.avatar = avatarName;
        this.interactionScreen.updateAvatar(avatarImagePath, avatarName);
    }
    
    public void updateTaskCounter() {
         TaskCounter.setText(String.valueOf(  this.ToDoList.getModel().getSize()));
    }
    
    public void updateFullness(int points) {
         this.interactionScreen.updateFullness(points);
    }
    
    public void updateWellness(int points) {
         this.interactionScreen.updateWellness(points);
    }
    
    public void updateHappiness(int points) {
         this.interactionScreen.updateHappiness(points);
    }
    
    public void  updateHealth( int health) {
        HealthBar.setValue(health);  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StatScreenPanel = new javax.swing.JPanel();
        ToDoListLabel = new javax.swing.JLabel();
        ToDoListPanel = new javax.swing.JScrollPane();
        ToDoList = new javax.swing.JList<>();
        AvatarPanel = new javax.swing.JPanel();
        InteractionPanel = new javax.swing.JPanel();
        Avatar = new javax.swing.JLabel();
        AvatarName = new javax.swing.JLabel();
        PointsLabel = new javax.swing.JLabel();
        HealthBar = new javax.swing.JProgressBar();
        PointsCounter = new javax.swing.JLabel();
        HealthLabel = new javax.swing.JLabel();
        EditTaskButton = new javax.swing.JButton();
        AddTaskButton = new javax.swing.JButton();
        CompleteTaskButton = new javax.swing.JButton();
        RemoveTaskButton = new javax.swing.JButton();
        TaskCounter = new javax.swing.JLabel();
        ControlPanel = new javax.swing.JPanel();
        FeedButton = new javax.swing.JButton();
        HealButton = new javax.swing.JButton();
        ToyButton = new javax.swing.JButton();
        AccessorizeButton1 = new javax.swing.JButton();
        AvatarButton = new javax.swing.JButton();
        PlayButton = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TaskMaster");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        ToDoListLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ToDoListLabel.setText("To-Do List");

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

        AvatarPanel.setBackground(new java.awt.Color(204, 204, 204));
        AvatarPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        AvatarName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AvatarNameMouseClicked(evt);
            }
        });

        PointsLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        PointsLabel.setText("Points");

        HealthBar.setStringPainted(true);

        PointsCounter.setFont(new java.awt.Font("Helvetica Neue", 1, 32)); // NOI18N
        PointsCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PointsCounter.setText("0");

        HealthLabel.setText("Health Points");

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
                                .addComponent(HealthLabel)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InteractionPanelLayout.setVerticalGroup(
            InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InteractionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(InteractionPanelLayout.createSequentialGroup()
                        .addComponent(PointsCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PointsLabel)
                        .addGap(110, 110, 110))
                    .addGroup(InteractionPanelLayout.createSequentialGroup()
                        .addComponent(AvatarName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(HealthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        EditTaskButton.setText("Edit Task");
        EditTaskButton.setToolTipText("Edit task won't give any points.");
        EditTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTaskButtonActionPerformed(evt);
            }
        });

        AddTaskButton.setText("Add Task");
        AddTaskButton.setToolTipText("Add task to gain points.");
        AddTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTaskButtonActionPerformed(evt);
            }
        });

        CompleteTaskButton.setText("Complete Task");
        CompleteTaskButton.setToolTipText("Complete task to gain points based on difficulty.");
        CompleteTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteTaskButtonActionPerformed(evt);
            }
        });

        RemoveTaskButton.setText("Remove Task");
        RemoveTaskButton.setToolTipText("Remove Task won't give any points.");
        RemoveTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTaskButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AvatarPanelLayout = new javax.swing.GroupLayout(AvatarPanel);
        AvatarPanel.setLayout(AvatarPanelLayout);
        AvatarPanelLayout.setHorizontalGroup(
            AvatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AvatarPanelLayout.createSequentialGroup()
                .addGroup(AvatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AvatarPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InteractionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AvatarPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(AvatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddTaskButton)
                            .addComponent(EditTaskButton))
                        .addGap(18, 18, 18)
                        .addGroup(AvatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CompleteTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RemoveTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(122, 122, 122))
        );
        AvatarPanelLayout.setVerticalGroup(
            AvatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvatarPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(InteractionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AvatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTaskButton)
                    .addComponent(RemoveTaskButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AvatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditTaskButton)
                    .addComponent(CompleteTaskButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        TaskCounter.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        TaskCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TaskCounter.setText("0");

        FeedButton.setText("Feed");
        FeedButton.setToolTipText("Feed avatar to increase fullness.");
        FeedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedButtonActionPerformed(evt);
            }
        });

        HealButton.setText("Heal");
        HealButton.setToolTipText("Heal avatar to increase wellness.");
        HealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealButtonActionPerformed(evt);
            }
        });

        ToyButton.setText("Toy");
        ToyButton.setToolTipText("Play with avatar to increase happiness.");
        ToyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToyButtonActionPerformed(evt);
            }
        });

        AccessorizeButton1.setText("Accessorize");
        AccessorizeButton1.setToolTipText("Dress you avatar.");
        AccessorizeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessorizeButton1ActionPerformed(evt);
            }
        });

        AvatarButton.setText("Task Friend");
        AvatarButton.setToolTipText("Change TaskFriend.");
        AvatarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvatarButtonActionPerformed(evt);
            }
        });

        PlayButton.setText("Play");
        PlayButton.setToolTipText("Play avatar to increase his happiness and wellness.");
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PlayButton, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(FeedButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(ToyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(HealButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AccessorizeButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addComponent(AvatarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FeedButton)
                    .addComponent(HealButton))
                .addGap(18, 18, 18)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToyButton)
                    .addComponent(AccessorizeButton1))
                .addGap(18, 18, 18)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AvatarButton)
                    .addComponent(PlayButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ToDoListLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TaskCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ToDoListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AvatarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToDoListLabel)
                    .addComponent(TaskCounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ToDoListPanel)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AvatarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    


    private void InteractionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InteractionPanelMouseClicked
        this.interactionScreen.setVisible(true);
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
        int pointsAdded;
        pointsAdded = switch (difficulty) {
            case "Easy" -> 3;
            case "Medium" -> 5;
            default -> 7;
        };
        this.addPoints(pointsAdded);
        Error error = new Error();
        error.SetErrorMsg("Task removed.Points gained: " +pointsAdded);
        error.setVisible(true);
    }//GEN-LAST:event_CompleteTaskButtonActionPerformed

    private void EditTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTaskButtonActionPerformed
        int SelectedIndex = this.ToDoList.getSelectedIndex();
        String task = this.ToDoList.getModel().getElementAt(SelectedIndex);
        System.out.println("Editing Task: "+ task);
        String []tasks= task.split("-");
        this.removeTask(SelectedIndex);
        addTask AddTask = new addTask(this, tasks[0].trim(),tasks[1].trim(), tasks[2].trim(),tasks[3].trim());
        AddTask.setVisible(true);
    }//GEN-LAST:event_EditTaskButtonActionPerformed

    private void ToDoListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ToDoListValueChanged
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

    private void FeedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedButtonActionPerformed
        new InventoryFood(this).setVisible(true);
    }//GEN-LAST:event_FeedButtonActionPerformed

    private void AccessorizeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessorizeButton1ActionPerformed
        new InventoryAccessory(this).setVisible(true);
    }//GEN-LAST:event_AccessorizeButton1ActionPerformed

    private void ToyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToyButtonActionPerformed
        new InventoryToy(this).setVisible(true);
    }//GEN-LAST:event_ToyButtonActionPerformed

    private void HealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealButtonActionPerformed
        new InventoryHeal(this).setVisible(true);
    }//GEN-LAST:event_HealButtonActionPerformed

    private void AvatarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvatarButtonActionPerformed
        new InventoryAvatar(this).setVisible(true);
    }//GEN-LAST:event_AvatarButtonActionPerformed

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        new Play(this).setVisible(true);
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void AvatarNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvatarNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AvatarNameMouseClicked

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
            new TamaGuiHome();
        });
   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccessorizeButton1;
    private javax.swing.JButton AddTaskButton;
    private javax.swing.JLabel Avatar;
    private javax.swing.JButton AvatarButton;
    private javax.swing.JLabel AvatarName;
    private javax.swing.JPanel AvatarPanel;
    private javax.swing.JButton CompleteTaskButton;
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JButton EditTaskButton;
    private javax.swing.JButton FeedButton;
    private javax.swing.JButton HealButton;
    private javax.swing.JProgressBar HealthBar;
    private javax.swing.JLabel HealthLabel;
    private javax.swing.JPanel InteractionPanel;
    private javax.swing.JButton PlayButton;
    private javax.swing.JLabel PointsCounter;
    private javax.swing.JLabel PointsLabel;
    private javax.swing.JButton RemoveTaskButton;
    private javax.swing.JPanel StatScreenPanel;
    private javax.swing.JLabel TaskCounter;
    private javax.swing.JList<String> ToDoList;
    private javax.swing.JLabel ToDoListLabel;
    private javax.swing.JScrollPane ToDoListPanel;
    private javax.swing.JButton ToyButton;
    // End of variables declaration//GEN-END:variables
}
