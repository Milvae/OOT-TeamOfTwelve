package de.hsm.oot.werwars.dice;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;

import de.hsm.oot.werwars.Guitilities;

public class Symbol extends Component {
	private int value;
	private ImageIcon image;
	
	public Symbol(int value) {
		this.value = value;
		this.setPreferredSize(new Dimension(50,50));
	}
	
	protected Symbol(int value,String image) throws FileNotFoundException {
		this(value,Guitilities.createImageIcon(image));
	}
	protected Symbol(int value,ImageIcon image) {
		this(value);
		this.image = image;
	}
	
	public void paint(Graphics g) {
		if(image!=null)
			g.drawImage(this.image.getImage(),2,2,this.getWidth()-4,this.getHeight()-4,this.getBackground(),this);
		else if(this.value>0) {
			switch(this.value) {
			case 5: paintDot(g,this.getWidth()/4*3-2,this.getHeight()/4-2); //right-top
              paintDot(g,this.getWidth()/4-2,this.getHeight()/4*3-2); //left-bottom
			case 3: paintDot(g,this.getWidth()/4-2,this.getHeight()/4-2); //left-top
			        paintDot(g,this.getWidth()/4*3-2,this.getHeight()/4*3-2); //right-bottom
			case 1: paintDot(g,this.getWidth()/2-3,this.getHeight()/2-3); break; //center
			case 4: paintDot(g,this.getWidth()/4*3-2,this.getHeight()/4-2); //right-top
              paintDot(g,this.getWidth()/4-2,this.getHeight()/4*3-2); //left-bottom
			case 2: paintDot(g,this.getWidth()/4-2,this.getHeight()/4-2); //left-top
              paintDot(g,this.getWidth()/4*3-2,this.getHeight()/4*3-2); break; //right-bottom
			case 6: paintDot(g,this.getWidth()/4-2,this.getHeight()/4-3); //left-top
			        paintDot(g,this.getWidth()/4-2,this.getHeight()/2-3); //left-center
			        paintDot(g,this.getWidth()/4-2,this.getHeight()/4*3-1); //left-bottom
			        paintDot(g,this.getWidth()/4*3-2,this.getHeight()/4-3); //right-top
			        paintDot(g,this.getWidth()/4*3-2,this.getHeight()/2-3); //right-center
			        paintDot(g,this.getWidth()/4*3-2,this.getHeight()/4*3-1); break; //right-bottom
			default:
				g.setColor(Color.BLACK);
				g.setFont(new Font("Arial",Font.BOLD,40));
				g.drawString(Integer.toString(this.value),10,40);
			}
		}
		g.setColor(Color.GRAY); g.drawRect(1,1,this.getWidth()-3,this.getHeight()-3);
		g.setColor(Color.BLACK);g.drawRect(0,0,this.getWidth()-1,this.getHeight()-1);
	}
	
	private void paintDot(Graphics g,int x,int y) {
		int size = this.getWidth()/8;
		g.setColor(Color.GRAY);
		size += 4; g.fillOval(x-2,y-2,size,size);
		g.setColor(Color.DARK_GRAY);
		size -= 2; g.fillOval(x-1,y-1,size,size);
		g.setColor(Color.BLACK);
		size -= 2; g.fillOval(x,y,size,size);
	}
}
