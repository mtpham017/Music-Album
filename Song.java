
package musicalbum;


public class Song implements Comparable<Song>
{
    private String artist;
    private double length;
    
    public String getArtist()
    {
        return artist;
    }
    
    public Song (String Artist, double Length)
    {
        artist = Artist;
        length = Length;
    }
    
    public int compareTo(Song other)
    {
        if(artist.compareToIgnoreCase(other.artist) == 0)
        {
            return Double.compare(length, other.length);
        }
        return artist.compareToIgnoreCase(artist);
    }
    
    public String getSongInfo()
    {
        return artist + " " + length + "s.";
    }
            
    
    
           
    
}
