
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private String title;
    private double cost;
    private String artist;


    public Song(String songTitle,String songArtist, double songCost )
    {
        title = songTitle;
        cost = songCost;
        artist = songArtist;
        
    }
    
    public Song(){
        
                  
        
        
    
    }
    
    public void transformToString() {
    
        System.out.println("Song Title: " + title);
        System.out.println("Song Artist: " + artist);
        System.out.println("Song Cost: $ " + cost);
        
    
    } 

  
    
}
