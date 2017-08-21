package entidades;

/**
 * @author DANI
 * @version 1.0
 * @created 30-mar-2017 20:41:04
 */
public class EstadoSolicitud {

	private int codEstadoS;
	private String nombreEstadoS;

	public EstadoSolicitud(){

	}

    public int getCodEstadoS() {
        return codEstadoS;
    }

    public void setCodEstadoS(int codEstadoS) {
        this.codEstadoS = codEstadoS;
    }

    public String getNombreEstadoS() {
        return nombreEstadoS;
    }

    public void setNombreEstadoS(String nombreEstadoS) {
        this.nombreEstadoS = nombreEstadoS;
    }
        

	public void finalize() throws Throwable {

	}
}//end EstadoSolicitud