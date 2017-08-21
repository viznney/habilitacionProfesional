package main;

import DTOs.*;
import java.util.List;

public class DecoradorLogin extends ExpertoLogin
{

    public DecoradorLogin() {
    }
    
    @Override
    public List<DTOUsuario> buscarUsuario(DTOUsuario DtoUser) {
        FachadaInterna.getInstance().iniciarTransaccion();
        return super.buscarUsuario(DtoUser);
    }
    /*
    @Override
    public void guardarNuevo(List<DTONuevoAtributo> atributos) {
        super.guardarNuevo(atributos);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
    
    @Override
    public void guardarModificado(List<DTOModificarAtributo> atributos, String nombre, boolean editable) {
        super.guardarModificado(atributos, nombre, editable);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
    
    @Override
    public void eliminarTipoImpuesto(int codigoTipoImpuesto) {
        super.eliminarTipoImpuesto(codigoTipoImpuesto);
        FachadaInterna.getInstance().finalizarTransaccion();
    }*/
    
}
