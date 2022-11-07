package n3exercici1;

public class n3exercici1 {

	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone();
		Generica generica = new Generica();
		
		generica.limitatTel(smartphone); //smartphone.ferFotos() No es pot cridar a un mètode que no pertany a la classe Telèfon
		generica.limitatSmart(smartphone);
	}

}
