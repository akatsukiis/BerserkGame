import Atributos.Personaje;
import Niveles.Pantalla;
import Personajes.Guts;

public class Inicio {
	public static Personaje guts= new Guts();
	

	public static void main(String[] args) throws InterruptedException {
		Pantalla ventana;
	      ventana = new Pantalla(guts);
	      ventana.setVisible(true);
	      while (true) {
				ventana.repaint();
				Thread.sleep(10);
			}

	}



}
