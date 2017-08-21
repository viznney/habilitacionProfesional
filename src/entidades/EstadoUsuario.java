package entidades;

/**
 * @author DANI
 * @version 1.0
 * @created 30-mar-2017 20:41:04
 */
public class EstadoUsuario extends Entidad{

	private int codEstadoUsuario;
	private String nombreEstadoUsuario;

	public EstadoUsuario(){

	}

    public int getCodEstadoUsuario() {
        return codEstadoUsuario;
    }

    public void setCodEstadoUsuario(int codEstadoUsuario) {
        this.codEstadoUsuario = codEstadoUsuario;
    }

    public String getNombreEstadoUsuario() {
        return nombreEstadoUsuario;
    }

    public void setNombreEstadoUsuario(String nombreEstadoUsuario) {
        this.nombreEstadoUsuario = nombreEstadoUsuario;
    }
        
        

	public void finalize() throws Throwable {

	}
}//end EstadoUsuario