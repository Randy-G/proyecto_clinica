package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Clinica implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1863189289817691555L;
	public static Clinica soul = null;
	private ArrayList<Paciente> misPacientes;
	private ArrayList<Usuario> misUsuarios;
	private ArrayList<Cita> misCitas;
	private ArrayList<Enfermedad> misEnfermedades;
	private ArrayList<Vacuna> misVacunas;
	private Usuario logedUser = null;
	private boolean login =  false;
	
	
	private Clinica() {
		super();
		
		this.misPacientes = new ArrayList<Paciente>();
		this.misUsuarios = new ArrayList<Usuario>();
		this.misCitas = new ArrayList<Cita>();
		this.misEnfermedades = new ArrayList<Enfermedad>();
		this.misVacunas = new ArrayList<Vacuna>();
	}
	
	public static Clinica getInstance() {
		if(soul == null) {
			soul = new Clinica();
		}
		
		return soul;
	}

	public static Clinica getSoul() {
		return soul;
	}

	public static void setSoul(Clinica soul) {
		Clinica.soul = soul;
	}

	public Usuario getLogedUser() {
		return logedUser;
	}

	public void setLogedUser(Usuario logedUser) {
		this.logedUser = logedUser;
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public ArrayList<Paciente> getMisPacientes() {
		return misPacientes;
	}

	public ArrayList<Usuario> getMisUsuarios() {
		return misUsuarios;
	}

	public ArrayList<Cita> getMisCitas() {
		return misCitas;
	}

	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}

	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}
	
	public void insertarPaciente (Paciente auxP) {
		misPacientes.add(auxP);
	}
	public void insertarCita (Cita AuxC) {
		misCitas.add(AuxC);
	}
	public void insertarEnfermedad(Enfermedad auxE) {
		misEnfermedades.add(auxE);
	}
	public void insertarVacuna(Vacuna auxV) {
		misVacunas.add(auxV);
	}
	public void insertarUsuario(Usuario auxU) {
		misUsuarios.add(auxU);
	}
	
	public Paciente buscarPacienteByCed(String CedPaciente) {
		Paciente auxP= null;
		boolean encontrado = false ;
		int i=0;
		while (!encontrado || i<misPacientes.size()) {
			if(misPacientes.get(i).getCedula().equalsIgnoreCase(CedPaciente)) {
				auxP = misPacientes.get(i);
				encontrado = true;
			}
			i++;
		}
		return auxP;
		
	}
	
	
	
	
}