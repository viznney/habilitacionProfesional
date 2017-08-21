package entidades;

/**
 * @author DANI
 * @version 1.0
 * @created 30-mar-2017 20:41:05
 */
public class Paciente {

	private String apellidoP;
	private int dniP;
	private String nombreP;
	private int telefonoP;
        private String direccionP;
	public TipoPaciente m_TipoPaciente;

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public int getDniP() {
        return dniP;
    }

    public void setDniP(int dniP) {
        this.dniP = dniP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(int telefonoP) {
        this.telefonoP = telefonoP;
    }

    public String getDireccionP() {
        return direccionP;
    }

    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }

    public TipoPaciente getM_TipoPaciente() {
        return m_TipoPaciente;
    }

    public void setM_TipoPaciente(TipoPaciente m_TipoPaciente) {
        this.m_TipoPaciente = m_TipoPaciente;
    }
       
	
	
}//end Paciente