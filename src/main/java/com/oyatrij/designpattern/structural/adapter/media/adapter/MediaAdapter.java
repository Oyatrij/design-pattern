package com.oyatrij.designpattern.structural.adapter.media.adapter;

import com.oyatrij.designpattern.structural.adapter.media.AdvancedMediaPlayer;
import com.oyatrij.designpattern.structural.adapter.media.MediaPlayer;
import com.oyatrij.designpattern.structural.adapter.media.MkVPlayer;
import com.oyatrij.designpattern.structural.adapter.media.Mp4Player;

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
