package org.example.springcoure;

public class MediaPlayer {
    public Music music;

    // инверсия управления
    public MediaPlayer(Music music) {
        this.music = music;
    }

    public void play() {
        System.out.println("Music in now: " + music.getSong());
    }
}
