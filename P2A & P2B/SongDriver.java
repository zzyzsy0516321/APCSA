
/**
 * Write a description of class SongDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SongDriver
{
    
    public static void main (String[] args) {
    
    Song wakeUpSong = new Song ();
    wakeUpSong.transformToString();
    
    Song goToSleepSong = new Song ("Wake Up Now!","Zach Zhong",100000);
    goToSleepSong.transformToString();
    
    }
    
}
