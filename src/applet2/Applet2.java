/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package applet2;
import java.applet.*;
//import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Harmeen
 */
/*
<applet code="Applet2" width="800" height="600"></applet>
*/
public class Applet2 extends Applet {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        // TODO code application logic here
   // }
    
    int x1,y1;
    int L,M;
    public Applet2()
    {
        x1=10;
        y1=590;
    Toolkit tool=Toolkit.getDefaultToolkit();
    Dimension size=tool.getScreenSize();
    this.setBounds((size.width/2)-400, (size.height/2)-300, 800, 600);
    L=400;
    M=300;
    draw();
    }
    public void paint(Graphics g)
    {
    g.setColor(Color.RED);
    g.fillOval(x1, y1, 20, 20);
    }
    void draw()
    {
    while(true)
    {
    if(x1<L)
    {
    x1+=5;
    y1-=5;
    }
    else
    {
    x1+=5;
    y1+=5;
    if(x1==800)
    {
    x1=10;
    y1=590;
    }
    repaint();
    }
    }
}
}