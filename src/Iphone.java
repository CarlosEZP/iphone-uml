package src;

import src.exceptions.IllegalMusicExecution;
import src.interfaces.MusicPlayer;
import src.models.MusicPlayerV1;

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