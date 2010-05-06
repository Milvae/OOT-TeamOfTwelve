package de.hsm.oot.werwars.dice;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Symbol {
	public Symbol(int value) {
		
	}
	public Symbol(int value,Image image) {
		
	}
	
	private class ValueImage extends Image {
		private int value; 
		public ValueImage(int value) {
			this.value = value;
			
		}
		public int getHeight(ImageObserver arg0) { return 50; }
		public int getWidth(ImageObserver arg0) { return 50; }
		public Graphics getGraphics() {
			// TODO Auto-generated method stub
			return null;
		}
		public Object getProperty(String arg0, ImageObserver arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ImageProducer getSource() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
