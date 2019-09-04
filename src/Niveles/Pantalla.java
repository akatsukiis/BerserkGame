package Niveles;
import javax.swing.JFrame;
import Atributos.Personaje;
import Niveles.Nivel1.Panel;
import Personajes.Guts;

public class Pantalla extends JFrame  {
    public PanelAbstract panel;

	 
	public Pantalla(Personaje guts) {
		panel=new Panel(guts) ;
	     setLayout(null);
	     setSize(550,350);
	     setLocationRelativeTo(null);


		 
		 
		 add(panel);
		 
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	
	
	
	}