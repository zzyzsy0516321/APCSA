public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private double gpa;
    private String ethnicity;
    
    public Student()
    {
        
        firstName = "Not set";
        lastName = "Not set";
        gpa = 0.0;
        ethnicity = "Unknown";
 
        
    }
    
    public Student (String firstName, String lastName, String ethnicity, double GPA) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = GPA;
        this.ethnicity = ethnicity;
    
    }
    
    public String toString (){
    
        
        return "Student Name: " + firstName + " " + lastName + "\n" + "GPA: " + gpa + "\n" + "Ethnicity: " + ethnicity;
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
        
}
