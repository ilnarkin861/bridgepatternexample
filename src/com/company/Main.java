package com.company;


public class Main {

    public static void main(String[] args) {
        Remote remote = new AdvancedRemote(new TV());
        remote.channelDown();

        Remote simpleRemote = new SimpleRemote(new Radio());
        simpleRemote.volumeUp();

    }
}
