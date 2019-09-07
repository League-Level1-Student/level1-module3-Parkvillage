int frogX=200;
int frogY=800;
void draw(){

  fill(frogX, frogY, 255);
ellipse(frogX, frogY, 30, 20);
 stroke(frogX, frogY, 0);

     
}

void setup(){
    background(0,0,0);
size(1000, 1000);
  
}
void keyPressed()
{
    if(key == CODED){
        if(keyCode == UP && frogY>0 )
        {
           frogY-=20;
        }
        else if(keyCode == DOWN && frogY<1000)
        {
            frogY+=20;
        }
        else if(keyCode == RIGHT && frogX<1000)
        {
            frogX+=20;
        }
        else if(keyCode == LEFT&& frogX>0)
        {
           frogX-=20;
        }
       
        
    }
}
