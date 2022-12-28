import javax.swing.JOptionPane;

public class JavaProgramming{
    public static void main(String[]args){
        String input;
        int time, hour, minute, second;
        
        //input 4870 seconds
        input = JOptionPane.showInputDialog("Input number in seconds: ");
        time = Integer.parseInt(input);
        
        hour = time/3600;
        minute = (((time/60) - 60)%60);
        second = time%60;

        JOptionPane.showMessageDialog(null, time + " Seconds = " + hour + ":" + minute + ":" + second );
        // output 1:21:10
    }
