package org.example.musicalPlayer.context;

import org.example.musicalPlayer.models.StoppedState;
import org.example.musicalPlayer.stateInteface.State;

public class MusicPlayer {
   private State state;

    public MusicPlayer() {
        state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }
    public void pressPlay(){
        state.pressPlay(this);
    }
    public void pressPause(){
        state.pressPause(this);
    }
    public void pressStop(){
        state.pressSTop(this);
    }
}
