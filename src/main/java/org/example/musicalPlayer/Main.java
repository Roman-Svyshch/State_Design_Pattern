package org.example.musicalPlayer;

import org.example.musicalPlayer.context.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.pressPlay();   // Music is now Playing.
        player.pressPause();  // Music is now Paused.
        player.pressPlay();   // Music is now Playing.
        player.pressStop();   // Music is now Stopped.
        player.pressPause();  // Music is already stopped. Can't pause.
        player.pressStop();   // Music is already stopped.
    }
}
