//1. Start a new Processing sketch.
//2. Copy the code below into the sketch.
//3. Run the program to see the holes.
//4. Write code in the draw method, to put moles in the holes.

void draw() {
drawMole(70,110);
/* Use the method below to put moles in the holes. */
drawMole(300,40);
drawMole(300,340);
drawMole(200,190);

}

void drawMole(int moleX, int moleY) {
     noStroke();
     fill(125, 93, 43);
     ellipse(moleX, moleY, 60, 60); // face
     fill(255, 237, 209);
     ellipse(moleX, moleY+10, 33, 28); 
     fill(0, 0, 0);
     ellipse(moleX-10, moleY-15, 10, 10); // eyes
     ellipse(moleX+10, moleY-15, 10, 10);
     ellipse(moleX, moleY-5, 10, 10); // nose
     ellipse(moleX, moleY+10, 20, 5); // mouth
}

void setup() {
     size(400, 400);
     background(78, 166, 51); // green grass
     fill(0, 0, 0);
     ellipse(200, 200, 100, 30); // holes!
     ellipse(70, 119, 100, 30);
     ellipse(300, 60, 100, 30);
     ellipse(297, 350, 100, 30);
}