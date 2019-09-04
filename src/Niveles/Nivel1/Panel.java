package Niveles.Nivel1;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import Atributos.Personaje;
import Niveles.PanelAbstract;
import Personajes.Guts;

public class Panel extends  PanelAbstract{

	public Panel(Personaje guts) {
		super(guts);
		guts.cargaImagenes("/Personajes");
		// TODO Auto-generated constructor stub
	}
	@Override
    public void paint(Graphics g) {
			super.paint(g);

			Graphics2D g2d = (Graphics2D) g;
			g.fillOval(Personaje.getX()+10, Personaje.getY()+10, 10, 10);
		}
	

}
