package logica;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Consulta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1170647756290026293L;
	private String codigo;
	private Calendar fecha;
	private String sintomas;
	private String diagnostico;
	private Enfermedad enfermedad;
	private Medico miMedico;
	
	public Consulta(String codigo) {
		super();
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public Medico getMiMedico() {
		return miMedico;
	}

	public void setMiMedico(Medico miMedico) {
		this.miMedico = miMedico;
	}
	
}
