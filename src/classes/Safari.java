package src.classes;

import src.models.InternetBrowser;

public final class Safari extends InternetBrowser {
    @Override
    public void displayPage(String url) {
        System.out.println("Safari displaying page:"  + url);
    }
}
