package org.example.musicalPlayer.models;

import org.example.musicalPlayer.context.MusicPlayer;
import org.example.musicalPlayer.stateInteface.State;

import java.util.Set;

public class StoppedState implements State {
    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        System.out.println("Music now is playing");
        musicPlayer.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer musicPlayer) {
        System.out.println("Music is stopped.Can`t pause");
    }

    @Override
    public void pressSTop(MusicPlayer musicPlayer) {
        System.out.println("Music is already stopped");
    }
}
