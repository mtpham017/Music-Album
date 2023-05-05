
package musicalbum;

import java.util.ArrayList;
import java.util.Collections;

public class Album 
{
    ArrayList<Song> Mysongs = new ArrayList<>();
    
    public void addSongs(String Artist, double Length)
    {
        Mysongs.add(new Song(Artist, Length));
    }
    
    public void listSongs()
    {
        Collections.sort(Mysongs);
        
        for(Song s: Mysongs)
        {
            System.out.println(s.getSongInfo());
        }
    }
    
    public void findArtist(String Artist)
    {
        for(Song s: Mysongs)
        {
            if(s.getArtist().compareToIgnoreCase(Artist) == 0)
            {
                System.out.println("Found " + Artist);
                return;
            }
           
        }
        System.out.println(Artist + " Could not be found.");
        
        
    }

               
    
}
