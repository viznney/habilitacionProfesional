package Entidades;
import java.util.Date; 

/**
 * @author DANI
 * @version 1.0
 * @created 30-mar-2017 20:41:05
 */
public class SolicitudExamen {

	private Date fechaSolicitud;
	private int nroSolicitud;
	public EstadoSolicitud m_EstadoSolicitud;
	public Paciente m_Paciente;
	public UsuarioLab m_UsuarioLab;
	public Medico m_Medico;
	//public Solicitud/Determinacion m_Solicitud/Determinacion;
	public TipoExamen m_TipoExamen;

	public SolicitudExamen(){

	}

    public Date getFecha() {
        return fechaSolicitud       ;
    }

    public void setFecha(Date fecha) {
        this.fechaSolicitud = fecha;
    }

    public int getNroSolicitud() {
        return nroSolicitud;
    }

    public void setNroSolicitud(int nroSolicitud) {
        this.nroSolicitud = nroSolicitud;
    }

    public EstadoSolicitud getM_EstadoSolicitud() {
        return m_EstadoSolicitud;
    }

    public void setM_EstadoSolicitud(EstadoSolicitud m_EstadoSolicitud) {
        this.m_EstadoSolicitud = m_EstadoSolicitud;
    }

    public Paciente getM_Paciente() {
        return m_Paciente;
    }

    public void setM_Paciente(Paciente m_Paciente) {
        this.m_Paciente = m_Paciente;
    }

    public UsuarioLab getM_UsuarioLab() {
        return m_UsuarioLab;
    }

    public void setM_UsuarioLab(UsuarioLab m_UsuarioLab) {
        this.m_UsuarioLab = m_UsuarioLab;
    }

    public Medico getM_Medico() {
        return m_Medico;
    }

    public void setM_Medico(Medico m_Medico) {
        this.m_Medico = m_Medico;
    }

    public TipoExamen getM_TipoExamen() {
        return m_TipoExamen;
    }

    public void setM_TipoExamen(TipoExamen m_TipoExamen) {
        this.m_TipoExamen = m_TipoExamen;
    }
        

	public void finalize() throws Throwable {

	}
}//end SolicitudExamen