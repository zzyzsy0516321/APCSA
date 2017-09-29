public class P2F
{
  
    public static void main (String[] args) {
    
        double[] averages = new double[9];
        double maximum = 0;
        
        System.out.println("Batting averages are: ");
        
        for (int index = 0; index < averages.length; index ++){
        
            averages[index] = (Math.random()/2);

            
            System.out.print(String.format("%.3f", averages[index]) + "  ");
        
        }
        
        System.out.println("\nCorrect averages are: ");
        
        for (int index = 0; index < averages.length; index ++){
        
            averages[index] += 0.2;
            
            System.out.print(String.format("%.3f", averages[index]) + "  ");
        
        }
               
        System.out.println("\nIn reverse order: ");
        for (int index = averages.length - 1; index >= 0; index --){
        
            System.out.print(String.format("%.3f", averages[index]) + "  ");
        
        }
    
        for (int index = 0; index < averages.length; index ++){
        
            if (averages[index] >= maximum) {
                
                maximum = averages[index];
            
            }
        
        }
        
            System.out.println("\nMaximum batting average: " + String.format("%.3f", maximum));
        
        
    }
    
    
}
