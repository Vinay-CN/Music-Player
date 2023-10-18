package Application;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName ;

    private List<Song> songList = new ArrayList<>() ; //get the list of songs and each song will have name and duration

    private String singerName ;

    public Album(String albumName , List<Song> songList , String singerName){
        this.albumName = albumName ;
        this.songList = songList ;
        this.singerName = singerName ;
    }

    //suppose a user has not created any songs yet he need to create the album 
    
    public Album(String albumName , String singerName){
        this.albumName = albumName;
        this.singerName = singerName ;
        List<Song> songList = new ArrayList<>();
    }


    public void setalbumName(String albumName){
        this.albumName = albumName;

    }

    public String getalbumName(){
        return  albumName;
    }

    public void setSingerName(String singerName){
        this.singerName = singerName;
    }

    public String getSingerName(){
        return  singerName ;
    }

    public void setSongList(List<Song> songList){
        this.songList = songList ;
    }

    public List<Song> getSongList(){
        return songList;
    }

    public boolean searchSong(String songName){
        for(Song song : songList){ //get each song from the songList and check the songname  , initializing each Song as song data tye
            if(song.getname().equals(songName)) return true; // we are using getter to get the current song name
        }
        return false ;
    }
    //we can aslo match keyword using DSA : check the substring of a string albumName

    //now i need to add new song to an existing album ,if there is no album then we can use constructore to create and intialize
    //this but  now we are adding new song to the existing list

    public String addSong(String name , double duration){
        if(searchSong(name)) return name+"Song is already present";
        else{
            Song newSong = new Song(name,duration);
            songList.add(newSong) ; // since the list is already created for this album we can create new song add it to the
            //songList
            return name + " Song has benn added to "+ getalbumName() +" Album" ;
        }
    }


    //to add the song to the favourites or my playlist

    public String addSongToPlayList(int songNo , List<Song> playList){

        int index = songNo - 1; //it is 0 based indexing so
        if(index>=0  && index<=songList.size()){
            Song song = songList.get(index); //get the song from the songList
            playList.add(song); // add it to the playlist
            return "Song has been added to your playlist" ;
        }
        else return "Song is not present in the songList" ;
    }

    //to add the song to playlist with title


    public String addSongToPlayList(String songName , List<Song> playList) {

        for(Song song : songList){
            if(song.getname().equals(songName)) {
                playList.add(song);
                return songName+" has been added to playlist succesfully" ;
            }
        }
        return songName +" could not be found in the album";

    }
//    @Override
//    public String toString(){
//        return
//    }


    @Override
    public String toString() {
        return "Album { " +
                " albumName = '" + albumName + '\'' +
               "\n"+ " , songList = " + songList +
                " , singerName = ' " + singerName + '\'' +
                " } ";
    }
}
