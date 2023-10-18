import Application.Album;
import Application.Song;
import java.util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     // create album object and songs directly without creating songs object because internally its creating
        Album album1 = new Album("MyAlbum","Arjith singh");
        album1.addSong("nanna neenu mareyalaare" , 4.32);
        album1.addSong("Bohemian Rhapsody", 5.55);
        album1.addSong("Hotel California", 6.30);
        album1.addSong("Imagine", 3.02);
        album1.addSong("Yesterday", 2.30);
        album1.addSong("Stairway to Heaven", 8.02);
        album1.addSong("Shape of You", 3.54);
        album1.addSong("Smells Like Teen Spirit", 4.38);
        album1.addSong("Billie Jean", 4.54);
        album1.addSong("Sweet Child o' Mine", 5.55);
        album1.addSong("Purple Haze", 2.52);
        album1.addSong("Hey Jude", 7.11);
        album1.addSong("Boogie Wonderland", 4.30);
        album1.addSong("Wonderwall", 4.18);
        album1.addSong("Superstition", 4.25);
        album1.addSong("Every Breath You Take", 3.55);
        album1.addSong("Under Pressure", 4.03);
        album1.addSong("Like a Rolling Stone", 6.12);
        album1.addSong("Don't Stop Believin'", 4.10);
        album1.addSong("Black Dog", 4.55);
        album1.addSong("Piano Man", 5.35);


        Album album2 = new Album("Kannada" , "SPB");
        album2.addSong("Naguva Nayana", 4.15);
        album2.addSong("Muthina Haara", 5.02);
        album2.addSong("Ninna Hinde", 3.30);
        album2.addSong("Usire Usire", 4.45);
        album2.addSong("Baanigondu Elle Ellide", 3.58);
        album2.addSong("Sanju Mattu Geetha", 2.59);
        album2.addSong("Kannadave Nammamma", 5.12);
        album2.addSong("Naadamaya", 4.10);
        album2.addSong("Yello Bittu", 3.25);
        album2.addSong("Bhagyada Lakshmi Baramma", 4.55);
        album2.addSong("Mareyada Haadu", 2.52);
        album2.addSong("Huttidare Kannada", 4.30);
        album2.addSong("Jogada Siri Belakinalli", 3.15);
        album2.addSong("Siri Malle Poo", 4.25);
        album2.addSong("Madhyarathrili", 3.55);
        album2.addSong("Kadamba", 4.03);
        album2.addSong("Nodamma Hudugi", 6.12);
        album2.addSong("Nee Bandu Ninthaga", 4.10);
        album2.addSong("Ee Sundara", 4.55);
        album2.addSong("Jeeva Veene", 5.35);


        //i created the playlist and i need to some of my fav songs to my playlist





        List<Song> playList = new ArrayList<>();
        album1.addSongToPlayList("Black Dog",playList);
        album1.addSongToPlayList("Black Dog", playList);
        album1.addSongToPlayList("Bohemian Rhapsody", playList);
        album1.addSongToPlayList("Imagine", playList);
        album1.addSongToPlayList("Hotel California", playList);
        album1.addSongToPlayList("Sweet Child o' Mine", playList);
        album1.addSongToPlayList(5, playList); //using index

        album2.addSongToPlayList("Naguva Nayana", playList);
        album2.addSongToPlayList("Muthina Haara", playList);
        album2.addSongToPlayList("Ninna Hinde", playList);
        album2.addSongToPlayList("Usire Usire", playList);
        album2.addSongToPlayList("Baanigondu Elle Ellide", playList);

//        for(Song song : album1.getSongList()){
//            System.out.println(song.getname() +" "+ song.getDuration());
//        }


        //if i have songs list already and i want to add them to a album

        List<Song> songs = new ArrayList<>();
        songs.add( new Song("Song Title 1", 3.45));
        songs.add( new Song("Song Title 2", 4.02));
        songs.add( new Song("Song Title 3", 3.15));
        songs.add( new Song("Song Title 4", 4.20));
        songs.add( new Song("Song Title 5", 3.58));
        songs.add( new Song("Song Title 6", 2.59));


        //i can create album

        Album album3 = new Album("Vinay",songs , "MC BIJJU");

  //to print songs of playlist
         for(Song song : playList){
            System.out.println(song.toString());
        }
        //if i want songs from album3
            for(Song song : album3.getSongList()){
                System.out.println(song.toString());
            }


    }
}