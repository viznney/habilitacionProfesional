package entidades;

/**
 * @author DANI
 * @version 1.0
 * @created 30-mar-2017 20:41:05
 */
public class TipoExamen {

	private int codTipoExamen;
	private String nombreTipoExamen;

	public TipoExamen(){

	}

    public int getCodTipoExamen() {
        return codTipoExamen;
    }

    public void setCodTipoExamen(int codTipoExamen) {
        this.codTipoExamen = codTipoExamen;
    }

    public String getNombreTipoExamen() {
        return nombreTipoExamen;
    }

    public void setNombreTipoExamen(String nombreTipoExamen) {
        this.nombreTipoExamen = nombreTipoExamen;
    }
        

	public void finalize() throws Throwable {

	}
}//end TipoExamen