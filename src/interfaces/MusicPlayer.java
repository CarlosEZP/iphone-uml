package src.interfaces;

import src.exceptions.IllegalMusicExecution;

public interface MusicPlayer {
    void play() throws IllegalMusicExecution;
    void pause();
    void selectMusic(String music);
}
