package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        Song song = new Song();
        song.name = "Redi";
        Artist artist = new Artist();
        artist.name = "Fadi";
        song.artist = artist;

        User user = new User();
        player.play(song, user);
        player.play(song, user);
        player.play(song, user);

        BusinessStatistics businessStatistics = new BusinessStatistics();

        System.out.println(businessStatistics.getTimes(player));

    }
}
