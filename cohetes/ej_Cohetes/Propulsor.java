package ej_Cohetes;

public class Propulsor {

	public String propulsor;

	public Propulsor(String propulsor) {

		this.propulsor = propulsor;

	}

	public String getProp() {

		return propulsor;

	}

	public void setProp() {

		this.propulsor = propulsor;

	}

	@Override
	public String toString() {
		return "Propulsor: [" + this.getProp() + "]";
	}
	
	

}
