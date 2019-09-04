package Niveles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import Atributos.Personaje;
import Personajes.Guts;

public abstract class PanelAbstract extends JPanel {
	private boolean left = false;
    private boolean up = false;
    private boolean down = false;
    private boolean right = false;
	public  Personaje Personaje;
	public PanelAbstract(Personaje Personaje) {
		this.Personaje=Personaje;
		 


		 
		  inicializador();
		  addKeyListener(new KeyListener() {
			  @Override
	            public void keyTyped(KeyEvent e) {}
	            @Override
	            public void keyReleased(KeyEvent e) {
	                if (e.getKeyCode() == KeyEvent.VK_LEFT) left = false;
	                if (e.getKeyCode() == KeyEvent.VK_RIGHT) right = false;
	                if (e.getKeyCode() == KeyEvent.VK_UP) up = false;
	                if (e.getKeyCode() == KeyEvent.VK_DOWN) down = false;
	            }
	            @Override
	            public void keyPressed(KeyEvent e) {
	                if (e.getKeyCode() == KeyEvent.VK_LEFT) left = true;
	                if (e.getKeyCode() == KeyEvent.VK_RIGHT) right = true;
	                if (e.getKeyCode() == KeyEvent.VK_UP) up = true;
	                if (e.getKeyCode() == KeyEvent.VK_DOWN) down = true;
	            }
	        });
		  new Thread(new Runnable() {
	            @Override
	            public void run() {
	                try {

	                    while (true) {  
	                        if (left && up) {
	                            Personaje.setX(Personaje.getX()-1);
	                            Personaje.setY(Personaje.getY()-1);

	                        } else if (left && down) {
	                            Personaje.setX(Personaje.getX()-1);
	                            Personaje.setY(Personaje.getY()+1);

	                        } else if (right && up) {
	                            Personaje.setY(Personaje.getY()-1);
	                            Personaje.setX(Personaje.getX()+1);

	                        } else if (right && down) {
	                            Personaje.setX(Personaje.getX()+1);
	                            Personaje.setY(Personaje.getY()+1);

	                        } else if (left) {
	                            Personaje.setX(Personaje.getX()-1);
	                        } else if (up) {
	                            Personaje.setY(Personaje.getY()-1);
	                        } else if (right) {
	                            Personaje.setX(Personaje.getX()+1);
	                        } else if (down) {
	                            Personaje.setY(Personaje.getY()+1);
	                        } 

	                        Thread.sleep(30);
	                    }

	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                    System.exit(0);
	                }
	            }
	        }).start();
			setFocusable(true);
	 }
		 
	 private void inicializador() {
		  setBounds(0, 0, 550,350);
		  setBackground(Color.ORANGE);
		  setVisible(true);
		 }
	 @Override
      public void paint(Graphics g) {
			super.paint(g);

			Graphics2D g2d = (Graphics2D) g;
			g.fillOval(Personaje.getX(), Personaje.getY(), 10, 10);
		}
}
