package com.company;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {
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
    public void channelDown(){
        int old = device.getChannel();
        device.setChannel(old-1);
    }

    @Override
    public void channelUp(){
        int old = device.getChannel();
        device.setChannel(old+1);
    }


}
