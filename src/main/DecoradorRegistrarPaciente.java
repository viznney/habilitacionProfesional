package main;

import DTOs.*;
import java.util.List;

public class DecoradorRegistrarPaciente extends ExpertoRegistrarPaciente
{

    public DecoradorRegistrarPaciente() {
    }
    
    @Override
    public List<DTOPaciente> buscarPaciente(DTOPacienteB DtoUser1) {
        FachadaInterna.getInstance().iniciarTransaccion();
        return super.buscarPaciente(DtoUser1);
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
