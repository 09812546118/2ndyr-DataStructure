import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pacman extends JFrame implements KeyListener{
   PacmanCanvas canvas;
   PacmanThread thread;
   
   public Pacman(){
      canvas=new PacmanCanvas(this);
      thread=new PacmanThread(canvas);
      add(canvas);
     
      setTitle("pacman v1.0");
      setSize(500,500);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);
      setVisible(true);
      addKeyListener(this);
   }
   
   public void keyPressed(KeyEvent e){
      int key=e.getKeyCode();
      switch(key){
         case KeyEvent.VK_RIGHT: canvas.direction=0; break;
         case KeyEvent.VK_DOWN: canvas.direction=1; break;
         case KeyEvent.VK_LEFT: canvas.direction=2; break;
         case KeyEvent.VK_UP: canvas.direction=3;
      }
   }
   public void keyReleased(KeyEvent e){}
   public void keyTyped(KeyEvent e){}
   
   
   static public void main(String ...args){
      new Pacman();
   }
}//end of class
//
class PacmanCanvas extends Canvas{
   int x,y;
   int start=30,end=300;
   int direction;
   //direction=0; left-to-right
   //direction=1; up-to-down
   //direction=2; right-to-left
   //direction=3; down-to-up
   
   
   Pacman pacman;
   public PacmanCanvas(Pacman pacman){
      this.pacman=pacman;
   }
   
   public void paint(Graphics g){
      g.setColor(Color.BLUE);
      g.fillRect(0,0,getWidth(),getHeight());
      g.setColor(Color.YELLOW);
      g.fillArc(x,y,50,50,start,end); //pacman drawing
   }
}//end of canvas
//
class PacmanThread implements Runnable{
   PacmanCanvas canvas;
   Thread t;
   
   public PacmanThread(PacmanCanvas canvas){
      this.canvas=canvas;
      t=new Thread(this);
      t.start();
   }
   public void run(){
      for(;;){ //infinite loop
         switch(canvas.direction){
            case 0:  //left-to-right
               if(canvas.x<canvas.getWidth()-50){
                  canvas.x+=3;
                  canvas.start=30;
                  canvas.end=300;
               }
               else{ canvas.direction=1;}
               break;
            case 1://up-to-down
               if(canvas.y<canvas.getHeight()-50){
                  canvas.y+=3;
                  canvas.start=-60;
                  canvas.end=300;
               }
               else{ canvas.direction=2; }
               break;
            case 2://right-to-left              
            if(canvas.x>0){
                  canvas.x-=3;
                  canvas.start=150;
                  canvas.end=-300;
               }
               else{ canvas.direction=3; }
               break;
           case 3://right-to-left              
            if(canvas.y>0){
                  canvas.y-=3;
                  canvas.start=60;
                  canvas.end=-300;
               }
            else{ canvas.direction=0; }
         }
                  //we will put delay
         try{
            t.sleep(50);
            canvas.repaint();
   
         }catch(Exception e){}
      }
   }
}//end of thread