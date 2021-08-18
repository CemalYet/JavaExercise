package com.company;

import java.util.ArrayList;
import java.util.List;

public class PlayListAlbum {
    private String name;
    private SongList songs;

    public PlayListAlbum(String name) {
        this.name =name;
        this.songs = new SongList();
    }



    public String getName() {
        return name;
    }

    public boolean addSong(PlayListSong song){
        return this.songs.addSong(song);
    }

    public  PlayListSong  findSong(String name){
        return this.songs.findSong(name);
    }


    private class SongList {
        private List<PlayListSong> listOfSongs;

        public SongList() {
           this.listOfSongs = new ArrayList<PlayListSong>();
        }

        private boolean addSong(PlayListSong song){
           if (listOfSongs.contains(song)){
               return false;
           }
            this.listOfSongs.add(song);
            return true;
        }

        private PlayListSong findSong(String name){
            for (PlayListSong song:listOfSongs
            ) {
                if (song.getName().equals(name)){
                    return song;
                }
            }
            return null;
        }
    }
}
