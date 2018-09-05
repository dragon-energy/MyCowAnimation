import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
final public class Animate {

    JFrame frame;
    DrawPanel drawPanel;

    private int oneX = 200; // Starting X coordinate
    private int oneY = 80; // Starting Y coordinate
    private int earArc= -80;
    private int pupilX = 310;
    private int pupilY= 300;
    private int eyebrowX = 300;
    private int cloudX = 0;
    private int textX = 0;
	private int textY = 0;
	private int horseY = 10;

	
	private boolean textRight = false;
	private boolean textLeft= false;
	private boolean textUp = false;
	private boolean textDown = false;
    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;
    boolean add = false;
    boolean subtract = false; 
    boolean pupilLeft = false;
    boolean pupilRight = true;
    boolean subtractEyebrow = true;
    boolean addEyebrow = false;
    boolean addCloud = false;
    boolean backCloud = false; 
    boolean darken = false;
    boolean upHorse = false;
    boolean downHorse = false;
    
    public static void main(String[] args) {
        new Animate().go();
    }

    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(800, 500);
        frame.setLocation(375, 55);
        moveIt();

    }
    class DrawPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3030379568821478211L;
		public void paintComponent(Graphics g) {
			g.setColor(new Color(193,230, 255));
			g.fillRect(0, 0, 800, 700);
			
			g.setColor(new Color(255,255,255));
            g.fillOval(cloudX+30, 90, 40, 40);
            g.fillOval(cloudX+50, 80, 40, 40);
            g.fillOval(cloudX+40, 60, 40, 50);
            g.fillOval(cloudX+20, 70, 60, 50);//Cloud1
            
            g.fillOval(cloudX+600, 290, 40, 40);
            g.fillOval(cloudX+630, 250, 80, 40);
            g.fillOval(cloudX+580, 260, 70, 50);
            g.fillOval(cloudX+610, 270, 80, 50);//Cloud2  
            
            g.fillOval(cloudX+140, 160, 60, 90);
            g.fillOval(cloudX+130, 180, 80, 60);
            g.fillOval(cloudX+170, 160, 70, 90);
            g.fillOval(cloudX+168, 170, 60, 50);//Cloud3
            
            g.fillOval(cloudX+500, 60, 60, 90);
            g.fillOval(cloudX+530, 80, 80, 60);
            g.fillOval(cloudX+550, 60, 70, 90);
            g.fillOval(cloudX+568, 70, 60, 50);//Cloud4
            
            g.fillOval(cloudX-100, 290, 40, 40);
            g.fillOval(cloudX-79, 250, 80, 40);
            g.fillOval(cloudX-120, 260, 70, 50);
            g.fillOval(cloudX-90, 270, 80, 50);//Cloud5
            
            g.fillOval(cloudX-200, 390, 60, 90);
            g.fillOval(cloudX-179, 350, 80, 70);
            g.fillOval(cloudX-220, 360, 70, 90);
            g.fillOval(cloudX-190, 370, 60, 50);//Cloud6
            
            g.fillOval(cloudX-300, 10, 60, 90);
            g.fillOval(cloudX-330, 70, 80, 60);
            g.fillOval(cloudX-350, 50, 70, 90);
            g.fillOval(cloudX-368, 60, 60, 50);//Cloud6
            
			g.setColor(new Color(239, 252, 0));
            g.fillOval(cloudX+35, 30, 100, 100);//sun
            
			g.setColor(Color.GREEN);
			g.fillRect(0, 400, 800, 300);//Grass
			g.setColor(Color.RED);
			g.fillRect(500,200, 200, 200);//farm
			g.setColor(Color.RED);
            g.fillArc(500,100,200,200,0,180);// roof of farm
			g.setColor(Color.BLACK);
			g.fillRect(570, 320, 50, 80); //door 
			g.setColor(Color.BLACK);
			g.fillRect(570, 200, 50, 50); //window			
			g.setColor(new Color(142, 33, 0));
			g.fillRect(570, 320, 50,80); //door 
			
			g.setColor(new Color(209, 189, 75));
            g.fillOval(390, pupilX, 200, 300);//his body
			g.setColor(new Color(209, 189, 75));
            g.fillOval(190, 270, 200, 125); // This is the muzzle
			g.setColor(new Color(255, 178, 249));
            g.fillOval(180, 280, 70, 90); // This is the nose
            g.setColor(new Color(201, 80, 192));
            g.fillRoundRect(230, 300, 5, 50, 50, 25);//his beautiful nostril
            g.fillRoundRect(190, 300, 5, 40, 50, 25);//his beautiful nostril
            g.setColor(new Color(255,255,255));
            g.fillArc(270,100,100,170,305,90);// his back horn
            g.setColor(new Color(209, 189, 75));
            g.fillOval(270, 170, 200, 235);//his head
            g.setColor(new Color(255,255,255));
            g.fillArc(370,100,100,170,305,90);// his horn
            g.setColor(new Color(0,0,0));
            g.fillArc(390,230,100,60,75,earArc);// his ear
            g.setColor(new Color(255,255,255));
            g.fillOval(300, 250, 75, 75);// his eye 
            g.setColor(new Color(0,0,0));
            g.fillOval(pupilX, pupilY, 20, 20);// his pupil 
            g.setColor(new Color(0, 10, 0));
            g.drawArc(eyebrowX, 250, 20, 90, 80, 90);// his eyebrow
            g.setColor(new Color(209, 189, 75));
            g.fillRoundRect(220, 366, 100,(oneY+10), 30 , 20);//his jaw
            g.setColor(new Color(102, 0, 153));
            g.fillRoundRect(230, 370, 50,oneY, 30 , 20);//his mouth
            
            g.setColor(Color.GRAY);
            g.fillOval(580,horseY+250, 35,50);//horse head
            g.fillArc(580,horseY+225,15,33,225,90);
            g.fillArc(600,horseY+225,15,33,225,90);
            g.setColor(new Color(211, 143, 122));
            g.fillOval(587,horseY+275, 20,20);//horse nose
            g.setColor(Color.WHITE);
            g.fillOval(584,horseY+265, 10,10);
            g.fillOval(600,horseY+265, 10,10);
            g.setColor(Color.BLACK);
            g.fillOval(584,horseY+265, 8,8);
            g.fillOval(600,horseY+265, 8,8);
            g.setColor(Color.RED);
			g.fillRect(550,250, 100, 80);//the block hiding the horse
            g.setColor(Color.WHITE);
            g.fillOval(630,150, 100,90);//speech bubble
            g.fillArc(580,220,100,33,75,-40);
            g.setColor(Color.BLACK);
            Font courierBold10 = new Font("TimesRoman", Font.BOLD, 20);//Font
            g.setFont(courierBold10);
            g.drawString("Johhny JOhnny", 520,120);//Text
            
            Font courierBold11 = new Font("Courier", Font.BOLD, 50);//Font
            g.setColor(Color.red);
            g.setFont(courierBold11);
            g.drawString("BOTTOM TEXT", textX+120,textY+120);//Text
            g.setColor(Color.yellow);
            g.setFont(courierBold11);
            g.drawString("BOTTOM TEXT", textX+125,textY+125);//Text
            g.setColor(Color.blue);
            g.setFont(courierBold11);
            g.drawString("LIT", textX+600,textY-57);//Text
            


			
        }
    }

    private void moveIt() {
        while(true){
            checkBounds();
            checkEarBounds();
            checkPupilBounds();
            checkEyebrowBounds();
            checkCloudBounds();
            checkHorseBounds();
            moveHorse();
            textBounds();
            moveEyebrow();
            movePupil();
            moveLoc();
            moveEar();
            moveClouds();
            moveText();
            try{
                Thread.sleep(10);
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
    	if(oneX >= 360){
            right = false;
            left = true;
        }
        if(oneX <= 200){
            right = true;
            left = false;
        }
        if(oneY >= 100){
            up = true;
            down = false;
        }
        if(oneY <= 0){
            up = false;
            down = true;
        }	
        
    }
    private void moveEar(){
    	if(add) {
    		earArc++;
    	}
    	if(subtract) {
    		earArc--;
    	}
    }
    private void checkEarBounds(){
    	if(earArc == -80){
            add = true;
            subtract = false;
        }
        if(earArc == -20) {
        	subtract = true;
        	add = false;
        }
        
    }
    private void movePupil(){
        if(pupilLeft){
            pupilX--;
        }
        if(pupilRight){
            pupilX++;
        }	
    }
    private void checkPupilBounds(){
    	if(pupilX == 350){
            pupilRight = false;
            pupilLeft = true;
        }
        if(pupilX == 310){
        	pupilRight = true;
        	pupilLeft = false;
        }
        
        
    }
    private void moveEyebrow(){
        if(subtractEyebrow){
            eyebrowX--;
        }
        if(addEyebrow){
            eyebrowX++;
        }	
    }
    private void checkEyebrowBounds(){
    	if(eyebrowX == 300){
            addEyebrow = false;
            subtractEyebrow = true;
        }
        if(eyebrowX == 275){
        	addEyebrow = true;
        	subtractEyebrow = false;
        }
        
        
    }

        
    
    private void moveClouds(){
        if(backCloud){
        	cloudX= 0;
        }
        if(addCloud){
        	cloudX++;
        }	
    }
    private void checkCloudBounds(){
    	if(cloudX == 400){
    		addCloud = false;
            backCloud = true;
        }
        if(cloudX == 0){
        	addCloud = true;
        	backCloud = false;

        }
        
        
    }
    private void moveText(){
    	if(textUp){
            textY--;
        }
        if(textDown){
            textY++;
        }
        if(textLeft){
            textX--;
        }
        if(textRight){
            textX++;
        }	
    }
    private void textBounds(){
    	if(textX >= 300){
            textRight = false;
            textLeft = true;
        }
        if(textX <= -13){
            textRight = true;
            textLeft = false;
        }
        if(textY >= 300){
            textUp = true;
            textDown = false;
        }
        if(textY <= 0){
            textUp = false;
            textDown = true;
        }	
    }
    private void moveHorse(){
        if(downHorse){
        	horseY++;
        }
        if(upHorse){
        	horseY--;
        }	
    }
    private void checkHorseBounds(){
    	if(horseY == -50){
    		upHorse = false;
            downHorse = true;
        }
        if(horseY == 10){
        	upHorse = true;
        	downHorse = false;

        }
        
        
    }


}