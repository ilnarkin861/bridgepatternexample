package com.company;

public abstract class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public abstract void togglePower();

    public abstract void volumeDown();

    public abstract void volumeUp();

    public abstract void channelDown();

    public abstract void channelUp();
}
