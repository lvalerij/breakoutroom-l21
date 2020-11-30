package com.company;

import java.util.HashMap;
import java.util.Map;

public class Player {

    int totalPlays;

    Map<Artist,ArtistStatistics> artistsStatistics = new HashMap<>();

//    Our streaming service should have one player, that, once it is invoked
//    with a track, will print "Now playing: <artist_name> - <track_name>".
    // 1. make Player with play method
    // player should out to console -
    //  System.out.println("Now playing: <artist_name> - <track_name>");
    // 2. create statistics for:
    //      a) business - 1 question
    //      b) artist - 2 question
    //      c) user - 2 questions


    void play(Song song, User user){
        System.out.println("Now playing: " + song.artist.name + " - " + song.name);
        totalPlays++;
        ArtistStatistics artistStatistics = artistsStatistics.get(song.artist);
        if (artistStatistics == null) {
            artistsStatistics.put(song.artist, new ArtistStatistics());
        }
        //call some method from artistStatistics
    }
}
