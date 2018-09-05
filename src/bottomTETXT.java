
public class bottomTETXT {
	private int textX = 0;
	private int textY = 0;
	
	private boolean textRight = false;
	private boolean textLeft= false;
	private boolean textUp = false;
	private boolean textDown = false;
	
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
    	if(textX >= 283){
            textRight = false;
            textLeft = true;
        }
        if(textX <= 7){
            textRight = true;
            textLeft = false;
        }
        if(textY >= 259){
            textUp = true;
            textDown = false;
        }
        if(textY <= 7){
            textUp = false;
            textDown = true;
        }	
    }
}
