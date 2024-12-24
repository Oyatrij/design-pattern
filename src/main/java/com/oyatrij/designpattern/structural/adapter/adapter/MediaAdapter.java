package com.oyatrij.designpattern.structural.adapter.adapter;

import com.oyatrij.designpattern.structural.adapter.AdvancedMediaPlayer;
import com.oyatrij.designpattern.structural.adapter.MediaPlayer;
import com.oyatrij.designpattern.structural.adapter.MkVPlayer;
import com.oyatrij.designpattern.structural.adapter.Mp4Player;

//어댑터 클래스
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType) {
            case "mp4" -> advancedMediaPlayer = new Mp4Player();
            case "MKV" -> advancedMediaPlayer = new MkVPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch(audioType) {
            case "mp4" -> advancedMediaPlayer.playMp4(fileName);
            case "MKV" -> advancedMediaPlayer.playMkv(fileName);
        }
    }
}
