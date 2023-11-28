/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagui;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Arpita Sakshee
 */

public class ToDoList extends AbstractListModel<String> {

    ArrayList<Task> list = new ArrayList<>();

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public String getElementAt(int index) {
        Task task = list.get(index);
        return task.getTaskName() + " - " + task.getDifficulty() + " - "+ task.getDueDate() + " - " + task.getDueTime();
      
    }
    
    public Task getTaskAt(int index) {
        
        return list.get(index);
    }

    public void add(Task task) {
        list.add(task);
        fireIntervalAdded(this, list.size() - 1, list.size() - 1);
    }

    public void remove(int index) {
        list.remove(index);
        fireIntervalRemoved(this, index, index);
    }

    public boolean isEmpty() {
        boolean empty = false;
        if (this.getSize() == 0) {
            empty = true;
        }
        return empty;
    }
    
}