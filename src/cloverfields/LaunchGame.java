package cloverfields;

import javax.swing.WindowConstants;

public class LaunchGame{
    
    public static void main(String[] args){
        

          Display display = new Display();
    
          display.setSize(Constants.screenWidth, Constants.screenHeigth);
          display.setResizable(true);
          display.setVisible(true);
          display.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
          display.setTitle(Constants.windowName);
          display.setLocationRelativeTo(null);
          display.addWindowListener(display);
        System.out.println("This is really cool, right?");
        
    }

}
