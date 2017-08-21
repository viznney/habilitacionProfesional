package main;

import DTOs.*;
/*import DTOs.DTOModificarAtributo;
import DTOs.DTONuevoAtributo;
import DTOs.DTOTipoImpAtrib;
import DTOs.DTOTipoImpuesto;*/
import java.util.ArrayList;
import java.util.List;

public class ControladorRegistrarPaciente
{

    private ExpertoRegistrarPaciente experto1 = (ExpertoRegistrarPaciente) FabricaExpertos.getInstancia().crearExperto("RegistrarPaciente");

    public List<DTOPaciente> buscarPaciente(DTOPacienteB usr1){
        return experto1.buscarPaciente(usr1);
        
    }
    
    /*
    public List<DTOUsuarioLab> crearTipoImpuesto(String nombreTI, boolean importeEditableTI){
       return experto.crearTipoImpuesto(nombreTI, importeEditableTI);
    }
    
    public void guardarNuevo(List<DTONuevoAtributo> atributos){
        experto.guardarNuevo(atributos);
    }
    
    public List<DTOTipoImpAtrib> modificarTipoImpuesto(int codigoTipoImpuesto){
        return experto.modificarTipoImpuesto(codigoTipoImpuesto);
    }
    
    public void guardarModificado(List<DTOModificarAtributo> atributos, String nombre, boolean editable){
        experto.guardarModificado(atributos, nombre, editable);
    }
    
    public void eliminarTipoImpuesto(int codigoTipoImpuesto){
        experto.eliminarTipoImpuesto(codigoTipoImpuesto);
    }*/

}
