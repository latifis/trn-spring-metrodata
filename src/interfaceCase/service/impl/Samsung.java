package interfaceCase.service.impl;

import interfaceCase.service.Remote;

public class Samsung implements Remote {
    @Override
    public void play() {
        System.out.println("Playing tv Samsung");
    }

    @Override
    public void stop() {
        System.out.println("Stopping tv Samsung");
    }

    @Override
    public int setVolume(int volume) {
        return 0;
    }
}
