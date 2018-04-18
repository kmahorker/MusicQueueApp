package com.musicq;

import java.util.List;

/**
 * Created by kmaho on 4/17/2018.
 */

public class QList {
    private String name;
    private List<Song> songs;

    public QList(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
