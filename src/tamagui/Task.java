/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagui;

/**
 * Authors/Contributors in alphabetical order.
 * @author Arpita Sakshee
 * @author Christian Villanueva
 * @author Katrina Mai
 * @author Maya Louise Dagdag
 */
public class Task {
    private final String taskName;
    private final String difficulty;
    private final String dueDate;
    private final String dueTime;
     /**
     * @param taskname
     * @param difficulty
     * @param dueDate
     * @param dueTime
     */
    public Task(String taskname, String difficulty, String dueDate, String dueTime) {
        this.taskName = taskname;
        this.difficulty = difficulty;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
    }

    public  String getTaskName(){
        return this.taskName;
    }

    public  String getDifficulty(){
        return this.difficulty;
    }
    
    public  String getDueDate(){
        return this.dueDate;
    }
    public  String getDueTime(){
        return this.dueTime;
    }
    

    public String toString(int index) {

        return this.getTaskName() + " - " + this.getDifficulty() + " - "+ this.getDueDate() + " - " + this.getDueTime();
    } 
}