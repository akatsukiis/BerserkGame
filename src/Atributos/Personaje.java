package Atributos;

import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

public abstract class Personaje {
	private int x,y;
	private int vida;
	private int daño;
	private int defesa;
	private int gold;
	private Map<String, ImageIcon> Imagenes = new HashMap<String, ImageIcon>();
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return this.x;	
		}
	public int getY() {
		return this.y;
	}	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDaño() {
		return daño;
	}
	public void setDaño(int daño) {
		this.daño = daño;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public void cargaImagenes(String Direccion){
		 System.out.println(Direccion+"/abajo.png");
		ImageIcon Img = new ImageIcon(getClass().getResource(Direccion+"/abajo.png")); 
		Imagenes.put("abajo",Img);
		Img = new ImageIcon(getClass().getResource(Direccion+"/arriba.png")); 
		Imagenes.put("arriba",Img);
		Img = new ImageIcon(getClass().getResource(Direccion+"/derecha.png")); 
		Imagenes.put("derecha",Img);
		Img = new ImageIcon(getClass().getResource(Direccion+"/izquieda.png")); 
		Imagenes.put("izquieda",Img);
		


		
	}
}
