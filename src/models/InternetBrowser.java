package src.models;

import src.classes.Safari;

public abstract class InternetBrowser {
    public void displayPage(String url){
        System.out.println("Displaying page: " + url);
    }
    public void addNewTab(){
        System.out.println("Added new Tab");
    }
    public void refreshPage(){
        System.out.println("Page was refreshed");
    }
}
