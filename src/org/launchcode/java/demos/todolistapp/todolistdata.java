package org.launchcode.java.demos.todolistapp;
import java.util.ArrayList;
public class todolistdata {
    private ArrayList<String> listData;

    public todolistdata(){
        listData = new ArrayList<String>();
    }
    public ArrayList<String> gettodolistdata(){
        return this.listData;
    }
    public void addListItem(String item) {
        listData.add(item);
    }
    public void removeListItem(int itemId) {
        listData.remove(itemId);
    }
}
