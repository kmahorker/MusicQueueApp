package com.musicq;

/**
 * Created by kmaho on 4/17/2018.
 */

public class Song {
    private String title;
    private String artist;
    private int length;
    private boolean playing;
    private int upvotes;
    private int downvotes;
    private int position;
    private String spotifyURI;
    //Make call for image when needing it in the actual Activity

    public Song(String title, String artist, int length, boolean playing, int upvotes, int downvotes, int position, String spotifyURI) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.playing = playing;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.position = position;
        this.spotifyURI = spotifyURI;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getSpotifyURI() {
        return spotifyURI;
    }

    public void setSpotifyURI(String spotifyURI) {
        this.spotifyURI = spotifyURI;
    }
}
