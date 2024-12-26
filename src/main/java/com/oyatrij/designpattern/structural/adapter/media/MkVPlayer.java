package com.oyatrij.designpattern.structural.adapter.media;

public class MkVPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMkv(String fileName) {
        //아무것도 안함
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MKV file: " + fileName);
    }
}
