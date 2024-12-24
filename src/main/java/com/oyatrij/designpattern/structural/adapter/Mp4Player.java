package com.oyatrij.designpattern.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }

    @Override
    public void playMkv(String fileName) {
        //아무것도안함
    }
}
