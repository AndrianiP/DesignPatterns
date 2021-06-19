package adapter;

import java.util.HashMap;

public class JukeBox {
    private HashMap<String, Song> songs = new HashMap<String, Song>();
    private int currentSong;

    public JukeBox() {

    }

    public void addSong(Song song) {
        songs.put(song.getTitle(), song);
    }

    public void play(String songName) {
        if(songs.containsKey(songName)) {
            Song song = songs.get(songName);
            System.out.println(song.toString());
        }
        
    }
}
