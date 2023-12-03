/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tamagui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;

/**
 *
 * @author Maya
 */
public final class InteractionScreen extends javax.swing.JFrame {
    private final TamaGuiHome home;
    private final StatScreen statsScreen;
    private int minuteTicks;

    /**
     * Creates new form InteractionScreen
     * @param tamaGuiHome
     */
    public InteractionScreen(TamaGuiHome tamaGuiHome) {
        initComponents();
        this.home = tamaGuiHome;
        String avatar = home.getAvatarName();
        String avatarPath =  "Images/Avatar/"+ avatar+ ".png"; 
        ImageIcon iconLogo = new ImageIcon(new ImageIcon(avatarPath).getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        Interactfriend.setIcon(iconLogo);
        
        statsScreen = new StatScreen(); // Initialize the instance
        StatScreenPanel.setLayout(new BorderLayout()); // Set layout manager for StatScreenPanel
        StatScreenPanel.add(statsScreen.getContentPane(), BorderLayout.CENTER); // Add StatScreen to StatScreenPanel
        this.setTitle(avatar);
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor(); 
        executor.scheduleAtFixedRate(() -> {
            // Your task that needs to run every minute
            System.out.println("Application is running at " + new java.util.Date());
       
            this.minuteTicks++;
            if (this.minuteTicks%30 == 0) {
                System.out.println("Decrement Wellness at " + new java.util.Date());
                this.updateWellness(-1);
            }
            if (this.minuteTicks%10 == 0) {
                System.out.println("Decrement Fullness at  " + new java.util.Date());
                this.updateFullness(-1);
            } 
            if (this.minuteTicks%5 == 0) {
               System.out.println("Decrement Happines at " + new java.util.Date());
               this.updateHappiness(-1);
            }
            //reset timer after 2 hours
            if (this.minuteTicks > 120){
                this.minuteTicks = 0;
            }
       
        }, 0, 1, TimeUnit.SECONDS);
        this.updateWellness(100);
        this.updateFullness(100);
        this.updateHappiness(100);
    }

    public void updateAvatar(String avatarImagePath, String avatarName){
        if (avatarName == null || avatarName.isEmpty()){
            Error error = new Error();
            error.SetErrorMsg("Select the avatar");
            error.setVisible(true);
            return;
        }
        ImageIcon iconLogo = new ImageIcon(new ImageIcon(avatarImagePath).getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        Interactfriend.setIcon(iconLogo);
        this.setTitle(avatarName);
    }
    
    private void updateHealth() {
       int health= (3*statsScreen.getFullness()+2*statsScreen.getHappiness() + statsScreen.getWellness())/6;
       this.home.updateHealth(health);
       this.HealthBar.setValue(health);
       if (health > 75) {
            healthIndicatorLabel.setText("Healthy");
        } else if (health > 50) {
            healthIndicatorLabel.setText("Weak");
        }else if (health >0 ){
            healthIndicatorLabel.setText("Sick");
        } else{
            healthIndicatorLabel.setText("Dead");
            String avatarName = this.home.getAvatarName();
        }
       System.out.println("Updating Health: " + health);
    }
    
    public void updateFullness(int points) {
        statsScreen.updateFullness(points);
        updateHealth();
    }
    
    public void updateWellness(int points) {
        statsScreen.updateWellness(points);
        updateHealth();
    }
    
    public void updateHappiness(int points) {
        statsScreen.updateHappiness(points);
        updateHealth();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HealthPanel = new javax.swing.JPanel();
        healthIndicatorLabel = new javax.swing.JLabel();
        healthPointsLabel = new javax.swing.JLabel();
        HealthBar = new javax.swing.JProgressBar();
        AvatarPanel = new javax.swing.JPanel();
        Interactfriend = new javax.swing.JLabel();
        StatScreenPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avatar");

        healthIndicatorLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        healthIndicatorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        healthIndicatorLabel.setText("Healthy");

        healthPointsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        healthPointsLabel.setText("Health Points:");
        healthPointsLabel.setToolTipText("Health Can be derived as follows = (3*Fullness +2*Happiness+1*Wellness)/6");

        HealthBar.setStringPainted(true);

        javax.swing.GroupLayout HealthPanelLayout = new javax.swing.GroupLayout(HealthPanel);
        HealthPanel.setLayout(HealthPanelLayout);
        HealthPanelLayout.setHorizontalGroup(
            HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HealthPanelLayout.createSequentialGroup()
                        .addComponent(HealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(HealthPanelLayout.createSequentialGroup()
                        .addComponent(healthPointsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(healthIndicatorLabel)
                        .addGap(39, 39, 39))))
        );
        HealthPanelLayout.setVerticalGroup(
            HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HealthPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthPointsLabel)
                    .addComponent(healthIndicatorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        AvatarPanel.setBackground(new java.awt.Color(255, 255, 255));
        AvatarPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Interactfriend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout AvatarPanelLayout = new javax.swing.GroupLayout(AvatarPanel);
        AvatarPanel.setLayout(AvatarPanelLayout);
        AvatarPanelLayout.setHorizontalGroup(
            AvatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvatarPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Interactfriend, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        AvatarPanelLayout.setVerticalGroup(
            AvatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvatarPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Interactfriend, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout StatScreenPanelLayout = new javax.swing.GroupLayout(StatScreenPanel);
        StatScreenPanel.setLayout(StatScreenPanelLayout);
        StatScreenPanelLayout.setHorizontalGroup(
            StatScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        StatScreenPanelLayout.setVerticalGroup(
            StatScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HealthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AvatarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StatScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(HealthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AvatarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(StatScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AvatarPanel;
    private javax.swing.JProgressBar HealthBar;
    private javax.swing.JPanel HealthPanel;
    private javax.swing.JLabel Interactfriend;
    private javax.swing.JPanel StatScreenPanel;
    private javax.swing.JLabel healthIndicatorLabel;
    private javax.swing.JLabel healthPointsLabel;
    // End of variables declaration//GEN-END:variables
}
