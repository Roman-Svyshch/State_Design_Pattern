package org.example.musicalPlayer.models;

import org.example.musicalPlayer.context.MusicPlayer;
import org.example.musicalPlayer.stateInteface.State;

public class PausedState implements State {
    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        System.out.println("music is now playing");
        musicPlayer.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer musicPlayer) {
        System.out.println("Music is already paused");
    }

    @Override
    public void pressSTop(MusicPlayer musicPlayer) {
        System.out.println("music is now stopped");
        musicPlayer.setState(new StoppedState());
    }
}
