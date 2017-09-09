package entidades;

/**
 * @author DANI
 * @version 1.0
 * @created 30-mar-2017 19:46:39
 */
public class UsuarioLab extends Entidad {

	private String contraseña;
	private String usuario;
	public EstadoUsuario m_EstadoUsuario;
	public PermisoUsuario m_PermisoUsuario;

	public UsuarioLab(){
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public EstadoUsuario getM_EstadoUsuario() {
        return m_EstadoUsuario;
    }

    public void setM_EstadoUsuario(EstadoUsuario m_EstadoUsuario) {
        this.m_EstadoUsuario = m_EstadoUsuario;
    }

    public PermisoUsuario getM_PermisoUsuario() {
        return m_PermisoUsuario;
    }

    public void setM_PermisoUsuario(PermisoUsuario m_PermisoUsuario) {
        this.m_PermisoUsuario = m_PermisoUsuario;
    }
      

}

	