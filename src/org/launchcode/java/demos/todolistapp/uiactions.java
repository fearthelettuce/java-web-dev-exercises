package org.launchcode.java.demos.todolistapp;

import java.util.HashMap;

public class uiactions {
        private static HashMap<Integer, String> actionOptions = new HashMap<Integer, String>();
//        private userinterface ui = new userinterface();
        public uiactions () {
            actionOptions.put(1, "Add Todo");
            actionOptions.put(2, "View Todos");
            actionOptions.put(3, "Remove Todo");
            actionOptions.put(4, "Exit");
        }

    static public HashMap<Integer, String> getUIActions(){
        return actionOptions;
    }

    public static boolean executeAction(int actionId, todolistdata listData, userinterface ui) {

        switch(actionId) {

            case 1: {
                String addItemPrompt = "What would you like to add to the todo list?";
                String userInput = ui.getStringInput(addItemPrompt);
                listData.addListItem(userInput);
                return true;
            }
            case 2: {
                System.out.println(listData.gettodolistdata());
                return true;
            }
            case 3: {
                String addItemPrompt = "Delete which item?" + listData.gettodolistdata();
                String userInput = ui.getStringInput(addItemPrompt);
                int itemToDelete = ui.parseUserInput(userInput);
                listData.removeListItem(itemToDelete);
                return true;
            }
            case 4: {
                System.out.println("Exiting program");
                return false;
            }
            default: {
                System.out.println("Action not recognized");
                return true;
            }
        }
    }
}
