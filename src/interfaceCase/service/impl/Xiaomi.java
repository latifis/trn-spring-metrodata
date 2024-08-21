package interfaceCase.service.impl;

import interfaceCase.service.Remote;

public class Xiaomi implements Remote {
    @Override
    public void play() {
        System.out.println("Playing hp xiaomi");
    }

    @Override
    public void stop() {
        System.out.println("Stopping hp xiaomi");
    }

    @Override
    public int setVolume(int volume) {
        return 0;
    }
}
