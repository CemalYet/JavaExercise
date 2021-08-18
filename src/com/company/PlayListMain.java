package com.company;

import java.util.*;

public class PlayListMain {

    private static List<PlayListSong> playListSongs = new LinkedList<PlayListSong>();
    private static List<PlayListAlbum> albums = new ArrayList<PlayListAlbum>();

    public static void main(String[] args) {
        PlayListSong song1=new PlayListSong("Dunya",2.52);
        PlayListSong song2=new PlayListSong("Heart",2.52);
        PlayListSong song3=new PlayListSong("Brain",2.52);
        PlayListSong song4=new PlayListSong("Lonely",2.52);
        PlayListAlbum myAlbum1=new PlayListAlbum("myAlbum");
        myAlbum1.addSong(song1);
        myAlbum1.addSong(song2);
        myAlbum1.addSong(song3);
        myAlbum1.addSong(song4);

        PlayListAlbum myAlbum2=new PlayListAlbum("MyAlbum2");
        PlayListSong song12=new PlayListSong("Kalp",2.52);
        PlayListSong song22=new PlayListSong("Akil",2.52);
        PlayListSong song32=new PlayListSong("Insaf",2.52);
        PlayListSong song42=new PlayListSong("Insan",2.52);
        myAlbum2.addSong(song12);
        myAlbum2.addSong(song22);
        myAlbum2.addSong(song32);
        myAlbum2.addSong(song42);

        albums.add(myAlbum1);
        albums.add(myAlbum2);

        addSong(song1);
        addSong(song2);
        addSong(song3);
        addSong(song4);
        addSong(song12);
        addSong(song22);
        addSong(song32);
        addSong(song42);

        PlayListSong doesNexist=new PlayListSong("Ali",2.52);
        addSong(doesNexist);

        printList(playListSongs);

       playSong(playListSongs);




    }

    private static boolean addSong(PlayListSong song){
        for (PlayListAlbum album:albums
             ) {
            if (album.findSong(song.getName())!= null){
                PlayListSong newSong = new PlayListSong(song.getName(), song.getDuration());
                playListSongs.add(song);
                return true;
            }
        }
        System.out.println(song.getName()+" is not found in your albums");
        return false;
    }

    private static void playSong (List<PlayListSong> myPlayList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<PlayListSong> listIterator = playListSongs.listIterator();
        if (playListSongs.isEmpty()){
            System.out.println("Your play list is empty go and add some songs");
        }
        printMenu();
        while (!quit){
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("Bye bye");
                    quit=true;
                    break;

                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Playing song is "+listIterator.next().getName());
                    }else{
                        System.out.println("Emd of the list");
                        goingForward=false;
                    }
                    break;

                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if (listIterator.hasPrevious()){
                    System.out.println("Playing song is "+listIterator.previous().getName());
                    }else {
                        System.out.println("Start of the list");
                        goingForward=true;
                    }
                    break;
                case 3:
                    if (goingForward && listIterator.hasPrevious()){
                        System.out.println("Song "+listIterator.previous().getName()+" is replayed");
                        goingForward=false;
                    }
                    else {
                        if (listIterator.hasNext());
                        System.out.println("Song "+listIterator.next().getName()+" is replayed");
                        goingForward=true;
                    }
                    break;
            }
        }


    }
    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "0 - Quit\n" +
                "1 - Skip Forward to next song\n" +
                "2 - Skip backwards to previous\n"+
                "3 - Replay\n"+
                "4 - Remove");
    }
    private static void printList(List<PlayListSong> List) {
        Iterator<PlayListSong> i= playListSongs.iterator();
        while(i.hasNext()) {
            System.out.println("playing " + i.next().getName());
        }
        System.out.println("=========================");
    }


}
