package n1exercici1;

public class n1exercici1 {

	public static void main(String[] args) {
		String objeto1 = "Objeto1";
		String objeto2 = "Objeto2";
		String objeto3 = "Objeto3";
		
		//En este caso he utilizado tipo Object pero obviamente ocurriria lo mismo con otro objeto mas complejo
		//Al ser los tres objetos del mismo tipo, los argumentos no tienen un orden fijo
		NoGenericMethods noGeneric1 = new NoGenericMethods (objeto1, objeto2, objeto3);
		NoGenericMethods noGeneric2 = new NoGenericMethods (objeto2, objeto3, objeto1);
	}

}
