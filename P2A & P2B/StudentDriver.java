import javax.swing.JOptionPane;
public class StudentDriver
{
    
    public static void main (String[] args) {
    
        Student senior001 = new Student ();
        JOptionPane.showMessageDialog(null,senior001.toString());
        
        Student frosh001 = new Student ("Zach", "Zhong", "Chinnese", 4.0);
        JOptionPane.showMessageDialog(null,frosh001.toString());
    
    
    }
    
    
}
