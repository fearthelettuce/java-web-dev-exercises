package org.launchcode.java.demos.todolistapp;

public class TodoList {

    public static void main(String[] args) {
        todolistdata listData = new todolistdata();
        userinterface ui = new userinterface();
        boolean continueLoop;
        do {
            int selectedAction = ui.selectAction();
            continueLoop = uiactions.executeAction(selectedAction, listData, ui);
        } while (continueLoop);

    }
}
