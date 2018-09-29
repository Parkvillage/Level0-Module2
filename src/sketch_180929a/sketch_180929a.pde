//Dot Race
//1. Make a variable to hold the X co-ordinate of the dot, and set it to something.
int X= 50;
void setup() {
    size(800, 200);
    
}

void draw() {
    //3. make it a nice color
     background (123,23,23);
    //4. if the mouse is pressed...
    if(mousePressed){
      X=X+20;
    }

    //5. ... change the X co-ordinate so that the dot moves to the right
    //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
    fill(#2AE8B0);
    ellipse(X,100,100,100);
    //6. Make your dot move really fast so that it can win the race 
       // (you have to figure out what part of your code to change)
    //7. Use this method to play a ding when your dot crosses the finish line.
    if(X>800){
      
      playSound();
    }




}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
 