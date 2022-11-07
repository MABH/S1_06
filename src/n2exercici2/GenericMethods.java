package n2exercici2;

public class GenericMethods <T>{
	public <T> void imprimirGenerics (T... args) {
		int i=0;
		for (T t : args) {
			System.out.println("Objecte i: "+t+"\n");	
			i++;
		}
	}
}
