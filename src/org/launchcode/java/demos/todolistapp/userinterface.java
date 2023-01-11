package org.launchcode.java.demos.todolistapp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class userinterface {
    public Scanner input = new Scanner(System.in);
    public int selectAction(){
        String textPrompt = "Please select an action. 1) Add Todo, 2) View Todo, 3) Remove item, 4) Exit"; //TODO pull this from actions hashmap
        return parseUserInput(getStringInput(textPrompt));
    }
    public String getStringInput(String prompt) {
        //Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = input.nextLine();
        //input.close();
        return userInput;
    }
//    public static void printArr(String[] textToPrint) {
//        for(String ele : textToPrint) {
//            System.out.println(ele);
//        }
//    }
    public int parseUserInput(String inputString) {
//        uiactions uiAvailableActions = new uiactions();
//        HashMap<Integer, String> actions = uiactions.getUIActions();
        int selectedAction = Integer.parseInt(inputString);
//        if (actions.containsKey(selectedAction)) {
            return selectedAction;
//        } else {
//            return 0;
//        }
    }

//    public boolean executeAction(int actionId) {
//
//        switch(actionId) {
//
//            case 1: {
//                String addItemPrompt = "What would you like to add to the todo list?";
//                String userInput = getStringInput(addItemPrompt);
//                listData.addListItem(userInput);
//                return true;
//            }
//            case 2: {
//                System.out.println(listData.gettodolistdata());
//                return true;
//            }
//            case 3: {
//                String addItemPrompt = "Delete which item?" + listData.gettodolistdata();
//                String userInput = getStringInput(addItemPrompt);
//                int itemToDelete = parseUserInput(userInput);
//                listData.removeListItem(itemToDelete);
//                return true;
//            }
//            case 4: {
//                System.out.println("Exiting program");
//                return false;
//            }
//            default: {
//                System.out.println("Action not recognized");
//                return true;
//            }
//        }
//    }


}
