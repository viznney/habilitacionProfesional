package entidades;

/**
 * @author DANI
 * @version 1.0
 * @created 30-mar-2017 20:41:05
 */
public class TipoPaciente {

	private int codTipoPaciente;
	private String nombre;
	//public TipoPacienteLugarInternacion m_TipoPacienteLugarInternacion;
	

	public TipoPaciente(){

	}

    public int getCodTipoPaciente() {
        return codTipoPaciente;
    }

    public void setCodTipoPaciente(int codTipoPaciente) {
        this.codTipoPaciente = codTipoPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        

	public void finalize() throws Throwable {

	}
}//end TipoPaciente