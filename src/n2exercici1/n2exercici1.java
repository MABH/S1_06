package n2exercici1;

public class n2exercici1 {

	public static void main(String[] args) {
		GenericMethods generic = new GenericMethods();
		Persona persona = new Persona();
		generic.imptimirGenerics("string", persona, 99);
		//Al tenir el primer argument de tipus String s'ha de pasar un paràmetre d'aquest tipus
		//Els altres paràmetres tant se val el tipus perque segueixen sent genèrics	
		}

}
