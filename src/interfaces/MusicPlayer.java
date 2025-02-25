package src.interfaces;

import src.exceptions.IllegalMusicExecution;

public interface MusicPlayer {
    void play() throws IllegalMusicExecution;
    void pause() throws IllegalMusicExecution;
    void selectMusic(String music);
}
