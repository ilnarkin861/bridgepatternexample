package com.company;

public class SimpleRemote extends Remote {
    public SimpleRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower(){
        if (device.isEnabled()) device.disable();
        else device.enable();
    }

    @Override
    public void volumeDown(){
        int old = device.getVolume();
        device.setVolume(old-1);
    }

    @Override
    public void volumeUp(){
        int old = device.getVolume();
        device.setVolume(old+1);
    }

    @Override
    public void channelDown() {

    }

    @Override
    public void channelUp() {

    }
}
