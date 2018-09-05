import javax.swing.*;
import java.awt.*;

final public class MyAnimation {

    JFrame frame;
    DrawPanel drawPanel;

    private int oneX = 200; // Starting X coordinate
    private int oneY = 300; // Starting Y coordinate

    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;
    
    public static void main(String[] args) {
        new MyAnimation().go();
    }

    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(700, 500);
        frame.setLocation(375, 55);
        //moveStomach();
    }

    class DrawPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3030379568821478211L;
		
		public void paintComponent(Graphics g) {
        	//Pink Border
            g.setColor(Color.yellow);
            g.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 60, 5);
            //BlueBorder
            g.setColor(new Color(79, 78, 250));
            g.fillRoundRect(3, 3, this.getWidth()-6, this.getHeight()-6, 60, 5);
            //Inside Color
            g.setColor(new Color(19,4,43));
            g.fillRoundRect(6, 6, this.getWidth()-12, this.getHeight()-12, 60 , 7);
            
            //Cat color is 226 161 86
            
            //Cat'stomach
            g.setColor(new Color(39, 46, 56));
            g.fillOval(190, 270, 200, 125); // This is the nose
            g.setColor(new Color(39, 46, 56));// His head
            g.fillOval(300, 170, 200, 225);
            g.setColor(new Color(39,46,56));
            g.fillOval(300, 170, 200, 225);
            g.setColor(new Color(255,255,255));
            g.fillOval(oneX,oneY, 50, 50);
            
            
            g.setColor(new Color(215, 224, 240)); 
            int [ ] heck = {200, 200, 275};
            int [ ] heckers = {200, 300, 300};
            g.fillPolygon(heck, heckers, 3);
    }

	    private void moveDot() {
	        while(true){
	            checkBounds();
	            moveLoc();
	            try{
	                Thread.sleep(3);
	            } catch (Exception exc){}
	            frame.repaint();
	        }
	    }
	    private void moveLoc(){
	    	if(up){
	            oneY--;
	        }
	        if(down){
	            oneY++;
	        }
	        if(left){
	            oneX--;
	        }
	        if(right){
	            oneX++;
	        }	
	    }
	    private void checkBounds(){
	    	if(oneX >= 700){
	            right = false;
	            left = true;
	        }
	        if(oneX <= 7){
	            right = true;
	            left = false;
	        }
	        if(oneY >= 700){
	            up = true;
	            down = false;
	        }
	        if(oneY <= 7){
	            up = false;
	            down = true;
	        }	
	    }
    }
}