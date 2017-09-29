import javax.swing.JOptionPane;
public class P2H
{
    public static void main (String args[]){
        
        //Correct logins
        String actualPassword = "0516";
        String actualUserName = "zzy";

        //Change the 3 to however number of attempts you want
        for (int errorCount = 0; errorCount < 3; errorCount ++ ){

            String userName = JOptionPane.showInputDialog("Please enter a username");
            String passWord = JOptionPane.showInputDialog("Please enter a password");

            if(passWord.equals(actualPassword)&& userName.equals(actualUserName)){
                System.out.println("Login successful");
                return;

            } else if (errorCount == 2) {

                System.out.println("You have exceeded your three attempts.Please try again next period.");
                return;
            } else {

                System.out.println("Wrong username or password");

            }

        }
    }

}
