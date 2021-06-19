package adapter;

public class SongAdapter extends Song {
    private Tune tune;
    Song song;
    
    String[] title = tune.getDisplayTitle().split(" ");
    String[] name = tune.getArtistName().split(" ");

    //I KEEP GETTING NP AND I DONT KNOW WHY
    //the whole program works except adding in the tunes even though tunes are not null
    // I know they are not because i can see their values when debugging it just here where i get np
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    public String getTitle() {
        return  String.valueOf(title[0]);
    }

    public String getAlbum() {
        return String.valueOf(title[1]);
    }

    public String getArtistFirstName() {

        return String.valueOf(name[0]);
    }

    public String getArtistLastName() {
        return String.valueOf(name[1]);
    }

    public String getGenre() {
        return String.valueOf(Genre.OTHER);
    }


}
