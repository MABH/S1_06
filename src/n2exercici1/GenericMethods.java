package n2exercici1;

public class GenericMethods <T>{
	public <T> void imptimirGenerics (String t1, T t2, T t3) {
		System.out.println("Objecte 1: "+t1+"\n"+"Objecte 2: "+t2.toString()+"\n"+"Objecte 3: "+t3.toString()+"\n");
		
	}
}
