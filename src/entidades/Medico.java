package entidades;

/**
 * @author DANI
 * @version 1.0
 * @created 30-mar-2017 20:41:05
 */
public class Medico {

	private String nombreM;
        private String apellidoM;
	private int nroMatricula;

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(int nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

	
}//end Medico