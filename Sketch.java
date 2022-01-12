//import java.util.Random;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	int num = 25;
  float[] myMouseX = new float[num];
  float[] myMouseY = new float[num];
  int i = 0;
 // float[] circleY = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
  float[] circleY = new float[400];
  int j = num;
  float[] finalY = new float[10];
  int pile = height; 
  float[] startX = new float[80];
  int p = 0;
  int h;
  float[] rectHeights = new float[25];
  float rectHeight = 5;
 
  /**
   * Called once at the beginning of execution, putmyMouseYour size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(22);
    
   //snow
    for(int c = 0; c<50; c++){
      circleY[c] = (float)Math.floor(Math.random()*(width-0+1)+0);
    }
  }

  
  public void draw() {
	  //mouse
    //float circleX = random.nextFloat(width);
    fill(255, 255, 255, 75);
    stroke(255, 255, 255, 75);
    background(22);
    //mouse
    // Shift the values to the right
  for (int i = num-1; i > 0; i--) {
   myMouseX[i] =myMouseX[i-1];
   myMouseY[i] =myMouseY[i-1];
  }
    myMouseX[0] = mouseX;
    myMouseY[0] = mouseY;
  for (int i = 0; i < num; i++) {
    ellipse(myMouseX[i],myMouseY[i], 25 - i, 25 - i);
    
    }
  

    
   //snow  
   for(p = 0; p < 20; p++){
     fill(255);
     float circleX = 30 *(p+2);
     ellipse(circleX, circleY[p], 4, 4);
     circleY[p]++;
      
    if (circleY[p] > height) {
      circleY[p] = 0;
      rectHeights[p]++;
   }
   
   
  }

  for(int j = 0; j < 16; j++){
    rect(j * 25, 395, 25, rectHeights[j] * -2);
  }
  for(int x = 0; x < width; x += 5){
    for(int h = 0; h < 80; h += 5){
      startX[h] = x;
      
      rect(startX[h], height, startX[h]+5, pile);  
    }
  }  
   
}
}


  
  
  
