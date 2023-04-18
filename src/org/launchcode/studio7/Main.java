package org.launchcode.studio7;

import java.util.*;

public class Main {

    public static void main(String[] args){

        ArrayList<String> lyrics = new ArrayList<>();
        lyrics.add("Little ditty about Jack and Diana");
        lyrics.add("ROCK in the USA");
        lyrics.add("holding hands meant something baby");
        lyrics.add("cuban band is crucifying John Lennon");
        CD mellencamp = new CD("John Mellencamp", 64, 28, lyrics, "CD");

        ArrayList<String> video = new ArrayList<>();
        video.add("Introduction");
        video.add("Meet Hero");
        video.add("Villain Arrives");
        video.add("Fight Begins");
        DVD marvelMovie = new DVD("Iron Man", 64, 50, video, "DVD");



        System.out.println(mellencamp.toString());
        mellencamp.spinDisk();
        mellencamp.readData();
        mellencamp.writeData("all kinds of data", 40);

        System.out.println(marvelMovie.toString());
        marvelMovie.spinDisk();
        marvelMovie.readData();
        marvelMovie.writeData("all kinds of data", 10);


        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
