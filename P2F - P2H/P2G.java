import java.util.*;
public class P2G
{
  
    public static void main (String[] args) {
    
        String[] colleges = {"MIT","Stanford","Caltech","UC Berkeley"};
        int index_fewestLetters; 
        int fewestLetters = colleges[0].length();
        String fewestLettersCollege = colleges[0];
        
        for (String college: colleges){
            
            System.out.println(college + " is " + college.length() + " words long");
            
        }
        
        for (String college: colleges){
            
            if (college.length() <= fewestLetters){
            
                fewestLetters = college.length();
                fewestLettersCollege = college;
                index_fewestLetters = Arrays.binarySearch(colleges, college);
            }
            
        }
            //Array.binary search returns the index of the particular element found in the array
            System.out.println(colleges[Arrays.binarySearch(colleges, fewestLettersCollege)] + " has the shortest length.");
            
            System.out.println(colleges[0] + " is set to null\n");
            colleges[0] = null;
            

            
            for (String college: colleges){
            
                
            if (college != null){
            System.out.println(college + " is " + college.length() + " words long");
            }
        }
    
    }
}
