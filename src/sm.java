
public class sm {
    private void movePupil() {
        while(true){
            checkPupilBounds();
            moveLoc();
            
            try{
                Thread.sleep(6);
            } catch (Exception exc){}
            frame.repaint();
        }
    }
    private void movePupilLoc(){
    	if(up){
            pupilY--;
        }
        if(down){
            pupilY++;
        }
        if(left){
            pupilX--;
        }
        if(right){
            pupilX++;
        }	
    }
    private void checkBounds(){
    	if(pupilX >= 320){
            right = false;
            left = true;
        }
        if(pupilX <= 7){
            right = true;
            left = false;
        }
        if(pupilY >= 100){
            up = true;
            down = false;
        }
        if(pupilY <= 0){
            up = false;
            down = true;
        }	
    }
}
