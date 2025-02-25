package src.models;

import src.exceptions.IllegalMusicExecution;
import src.interfaces.MusicPlayer;

public class MusicPlayerV1 implements MusicPlayer {
    private String selectedMusic = "";
    @Override
    public void play() throws IllegalMusicExecution {
        if(this.selectedMusic.isEmpty())
            throw new IllegalMusicExecution();
        else
            System.out.println("Music " + this.selectedMusic + " in execution");
    }

    @Override
    public void pause() {
        System.out.println("The music was been paused");
    }

    @Override
    public void selectMusic(String music) {
        this.selectedMusic = music;
        System.out.println("Music " + music + " was been selected");
    }
}
