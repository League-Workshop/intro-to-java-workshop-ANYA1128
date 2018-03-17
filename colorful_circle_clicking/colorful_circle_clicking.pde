
void setup(){
size(1600,1024);
fill(250,0,250);
ellipse(100,50,75,100);
fill(0,250,250);
rect(50,100,100,150);
triangle(25,30,17,29,50,100);
}
void draw(){
background(0,50,50);
  if(mousePressed==true){
  fill(0,100,100);
  ellipse(1000,500,500,500);
  }
  if(mousePressed==true){
  fill(100,0,100);
  ellipse(1000,500,500,500);
 }
}