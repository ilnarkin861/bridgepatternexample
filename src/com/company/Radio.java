package com.company;

public class Radio implements Device{

    private boolean on;
    private int volume;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        if (on == false) on = true;
    }

    @Override
    public void disable() {
        if (on == true) on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (getVolume() > 100) this.volume = 100;
        else if (getVolume() < 0) this.volume = 0;
        else this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (getChannel() < 1) this.channel = 1;
        else this.channel = channel;
    }
}