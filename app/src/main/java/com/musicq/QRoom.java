package com.musicq;

import java.util.List;

/**
 * Created by kmaho on 4/17/2018.
 */

public class QRoom {
    private List<Integer> members;
    private String name;
    private String code;
    private boolean playing;
    private Song currentSong;
    private QList playlist;
    private int QLeader;

    public QRoom(List<Integer> members, String name, String code, boolean playing, Song currentSong, QList playlist, int QLeader) {
        this.members = members;
        this.name = name;
        this.code = code;
        this.playing = playing;
        this.currentSong = currentSong;
        this.playlist = playlist;
        this.QLeader = QLeader;
    }

    public List<Integer> getMembers() {
        return members;
    }

    public void setMembers(List<Integer> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(Song currentSong) {
        this.currentSong = currentSong;
    }

    public QList getPlaylist() {
        return playlist;
    }

    public void setPlaylist(QList playlist) {
        this.playlist = playlist;
    }

    public int getQLeader() {
        return QLeader;
    }

    public void setQLeader(int QLeader) {
        this.QLeader = QLeader;
    }
}
