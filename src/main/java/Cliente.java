public class Cliente {
	private String nombre;
	private String rut;
	private Cuenta cuenta;
	private Usuario_web usuario;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Cliente(String nombre, String rut) {
		throw new UnsupportedOperationException();
	}
}