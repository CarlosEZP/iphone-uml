package src;

import src.classes.Safari;
import src.exceptions.IllegalMusicExecution;
import src.interfaces.MusicPlayer;
import src.classes.MusicPlayerV1;
import src.models.InternetBrowser;

import java.util.Scanner;

public class Iphone{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean iphoneOn = true;
        System.out.println("Welcome to your Iphone!");
        while(iphoneOn) {
            System.out.println("What you wanna do?");
            System.out.println("1 - Music");
            System.out.println("2 - Phone");
            System.out.println("3 - Internet");
            System.out.println("4 - Turn Off");

            int input = 0;
            input = getAndValidateInput();

            if(input == 1)
                musicPlayer();
            if(input == 3)
                internetBrowser();
            if(input == 4)
                iphoneOn = false;
        }
    }

    public static void musicPlayer(){
        System.out.println("Open music player...");
        MusicPlayer musicPlayer = new MusicPlayerV1();
        boolean onMusicPlayer = true;
        while (onMusicPlayer){
            int input = 0;
            System.out.println("What you wanna do?");
            System.out.println("1 - Play music");
            System.out.println("2 - Pause music");
            System.out.println("3 - Select music");
            System.out.println("4 - Exit");
            input = getAndValidateInput();
            try {
                if (input == 1)
                    musicPlayer.play();
                if (input == 2)
                    musicPlayer.pause();
                if (input == 3) {
                    System.out.println("Type the music you want to play:");
                    sc.nextLine();
                    String music = sc.nextLine();
                    musicPlayer.selectMusic(music);
                }
                if (input == 4)
                    onMusicPlayer = false;
            }catch (IllegalMusicExecution e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void internetBrowser(){
        System.out.println("Opening Safari...");
        InternetBrowser browser = new Safari();
        boolean onBrowser = true;
        while(onBrowser){
            int input = 0;
            System.out.println("What you wanna do?");
            System.out.println("1 - Go to page");
            System.out.println("2 - Add new Tab");
            System.out.println("3 - Refresh Page");
            System.out.println("4 - Exit");
            input = getAndValidateInput();
            if (input == 1) {
                System.out.println("Type the url of page:");
                sc.nextLine();
                String url = sc.nextLine();
                browser.displayPage(url);
            }
            if (input == 2)
                browser.addNewTab();
            if (input == 3)
                browser.refreshPage();
            if (input == 4)
                onBrowser = false;
        }
    }

    public static int getAndValidateInput(){
        int input = 0;
        do {
            input = sc.nextInt();
            if(input < 1 || input > 4)
                System.out.println("Invalid Option! Try again.");
        }while (input < 1 || input > 4);
        return input;
    }
}