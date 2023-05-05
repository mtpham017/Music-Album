
package musicalbum;


public class MusicAlbum {


    public static void main(String[] args) {
        
  
        Album myAlbum = new Album();
        
        myAlbum.addSongs("Taylor Swift", 300);
        myAlbum.addSongs("Ed Sheran", 400);
        myAlbum.addSongs("Elvis", 600);
        myAlbum.addSongs("Ed Sheran", 250);
        
        myAlbum.listSongs();
        
        myAlbum.findArtist("Adam Levine");
        myAlbum.findArtist("taylor swift");
        

    }
    
}
