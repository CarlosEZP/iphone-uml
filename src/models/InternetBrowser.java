package src.models;

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
