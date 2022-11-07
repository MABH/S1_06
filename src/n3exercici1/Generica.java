package n3exercici1;

public class Generica <T>{
	public <T extends Telefon> void limitatTel(T telefon) {
		telefon.trucar();
		telefon.ferFotos(); //No es pot cridar a un mètode que no pertany a la classe Telèfon
	}
	
	public <T extends Smartphone> void limitatSmart(T smartphone) {
		smartphone.trucar();
		smartphone.ferFotos();
	}
}
