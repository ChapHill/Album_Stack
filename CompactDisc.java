
/**
 * Class for the Album information.
 */
public class CompactDisc {

    private String artistName;
    private String albumName;
    private String lyricLanguage;

    public CompactDisc(){}

    public CompactDisc(String artistName, String albumName, String lyricLanguage){
        this.artistName = artistName;
        this.albumName = albumName;
        this.lyricLanguage = lyricLanguage;
    }


    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getLyricLanguage() {
        return lyricLanguage;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setLyricLanguage(String lyricLanguage) {
        this.lyricLanguage = lyricLanguage;
    }

    public String toString(){
        return "Artist: " + artistName +
                "\nAlbum: " + albumName +
                "\nLanguage: " + lyricLanguage + "\n";
    }


}
