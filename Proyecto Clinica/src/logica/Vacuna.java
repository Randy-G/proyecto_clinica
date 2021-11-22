package logica;

import java.io.Serializable;
import java.util.Date;

public class Vacuna implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2769523749078563771L;
	private String codigo;
	private String nombre;
	private Date fechaDosis;
	
	public Vacuna(String codigo, String nombre, Date fechaDosis) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaDosis = fechaDosis;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaDosis() {
		return fechaDosis;
	}

	public void setFechaDosis(Date fechaDosis) {
		this.fechaDosis = fechaDosis;
	}
	
}