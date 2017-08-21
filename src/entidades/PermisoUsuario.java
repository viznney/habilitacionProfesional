package entidades;

/**
 * @author DANI
 * @version 1.0
 * @created 30-mar-2017 20:41:05
 */
public class PermisoUsuario extends Entidad{

	private int codPermiso;
	private String nombrePermiso;

	public PermisoUsuario(){

	}

    public int getCodPermiso() {
        return codPermiso;
    }

    public void setCodPermiso(int codPermiso) {
        this.codPermiso = codPermiso;
    }

    public String getNombrePermiso() {
        return nombrePermiso;
    }

    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }
        

	public void finalize() throws Throwable {

	}
}//end PermisoUsuario