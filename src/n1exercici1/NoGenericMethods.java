package n1exercici1;

public class NoGenericMethods {	
	private Object Objeto1;
	private Object Objeto2;
	private Object Objeto3;
	
	public NoGenericMethods(Object objeto1, Object objeto2, Object objeto3) {
		
		this.Objeto1 = objeto1;
		this.Objeto2 = objeto2;
		this.Objeto3 = objeto3;
	}

	public Object getObjeto1() {
		return Objeto1;
	}

	public void setObjeto1(Object objeto1) {
		Objeto1 = objeto1;
	}

	public Object getObjeto2() {
		return Objeto2;
	}

	public void setObjeto2(Object objeto2) {
		Objeto2 = objeto2;
	}

	public Object getObjeto3() {
		return Objeto3;
	}

	public void setObjeto3(Object objeto3) {
		Objeto3 = objeto3;
	}
}
