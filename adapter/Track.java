package adapter;

public class Track extends Song {
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    public Track(String title, String album, String firstName, String lastName, Genre genre) {

    }

    public String getTitle() {
        return this.title;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getArtistFirstName() {
        return this.firstName;
    }

    public String getArtistLastName() {
        return this.lastName;
    }

    public String getGenre() {
        return String.valueOf(this.genre);
    }

}
