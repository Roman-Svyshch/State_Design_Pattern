package org.example.musicalPlayer.stateInteface;

import org.example.musicalPlayer.context.MusicPlayer;

public interface State {
    void pressPlay(MusicPlayer musicPlayer);
    void pressPause(MusicPlayer musicPlayer);
    void pressSTop(MusicPlayer musicPlayer);
}
