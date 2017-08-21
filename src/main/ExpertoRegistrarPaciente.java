package main;

import DTOs.*;
import entidades.*;
import static java.lang.Math.abs;
import java.util.*;

public class ExpertoRegistrarPaciente
{
    private Paciente paciente1;
    
    
    
    public List<DTOPaciente> buscarPaciente(DTOPacienteB DtoPaciente1){
        List<DTOPaciente> listaDTOPaciente = new ArrayList<>();
        
        List<DTOCriterio> criterioList1 = new ArrayList<>();
        DTOCriterio criterio1 = new DTOCriterio();
        criterio1.setAtributo("dnipaciente");
        criterio1.setOperacion("=");
        criterio1.setValor(DtoPaciente1.getDni());
        criterioList1.add(criterio1);

        List<Object> listpaciente  =  FachadaPersistencia.getInstance().buscar("Paciente", criterioList1);//porque el uso get(0)??
        
          for(Object us: listpaciente){
            DTOPaciente dtoUL = new DTOPaciente();
            String nombre = ((Paciente)us).getNombreP();
            dtoUL.setNombreP(nombre);
            String apellido = ((Paciente)us).getApellidoP();
            dtoUL.setApellidoP(apellido);
            int dni = ((Paciente)us).getDniP();
            dtoUL.setDniP(dni);
            String direccion = ((Paciente)us).getDireccionP();
            dtoUL.setDireccionP(direccion);
            int telf = ((Paciente)us).getTelefonoP();
            dtoUL.setTelefonoP(telf);
            Object tipo = ((Paciente)us).getM_TipoPaciente();
            dtoUL.setM_TipoPaciente(us);
            listaDTOPaciente.add(dtoUL);
            
            
            
            
             
        }
        //armar otro criterio con atributo "usuario" Operacion = VAlor DtoNombre.getNombreUsusario()
            return listaDTOPaciente;
      
        }
        
    

    
    /*public List<DTOUsuario> buscarUsuario(DTOUsuario DtoNombre){
        List<DTOUsuario> listaDTOUsuario = new ArrayList<>();
        
        List<DTOCriterio> criterioList1 = new ArrayList<>();
        DTOCriterio criterio1 = new DTOCriterio();
        criterio1.setAtributo("nombreEstadoUsuario");
        criterio1.setOperacion("=");
        criterio1.setValor("habilitado");
        criterioList1.add(criterio1);

        EstadoUsuario estado  = (EstadoUsuario) FachadaPersistencia.getInstance().buscar("EstadoUsuario", criterioList1).get(0);
        
        
        
        List<DTOCriterio> criterioList2 = new ArrayList<>();
        DTOCriterio criterio2 = new DTOCriterio();
        criterio2.setAtributo("usuario");
        criterio2.setOperacion("=");
        criterio2.setValor(DtoNombre.getUsuario());
        criterioList2.add(criterio2);
        criterioList2.add(criterio1);
        
        UsuarioLab user  = (UsuarioLab) FachadaPersistencia.getInstance().buscar("UsuarioLab", criterioList2);
        
        DTOUsuario user1 = new DTOUsuario();       
        
        user1.setUsuario(user.getUsuario());
        user1.setContraseña(user.getContraseña());
        List<DTOUsuario>  dtoUS = new ArrayList();
        dtoUS.add(user1);*/
        /*List<DTOCriterio> criterioList2 = new ArrayList<>();
        DTOCriterio criterio2 = new DTOCriterio();
        criterio2.setAtributo("estado");
        criterio2.setOperacion("=");
        criterio2.setValor(estado);
        criterioList2.add(criterio2);

        List<Object> listaTI = FachadaPersistencia.getInstance().buscar("TipoImpuesto", criterioList2);
        
        for(Object ti: listaTI){
            DTOTipoImpuesto dtoTI = new DTOTipoImpuesto();
            int codigo = ((TipoImpuesto)ti).getCodigoTipoImpuesto();
            dtoTI.setCodigo(codigo);
            String nombre = ((TipoImpuesto)ti).getNombreTipoImpuesto();
            dtoTI.setNombre(nombre);
            boolean editable = ((TipoImpuesto)ti).isImporteEditable();
            dtoTI.setImporteEditable(editable);
            listaDTOTipoImpuesto.add(dtoTI);
        }
        
        return dtoUS;*/
    }
    /*
    public List<DTOUsuarioLab> crearTipoImpuesto(String nombreTI, boolean importeEditableTI){
        
        TipoImpuesto nuevoTI = new TipoImpuesto();
        nuevoTI.setNombreTipoImpuesto(nombreTI);
        nuevoTI.setImporteEditable(importeEditableTI);
        
        List<DTOCriterio> criterioList0 = new ArrayList<>();
        DTOCriterio criterio0 = new DTOCriterio();
        criterio0.setAtributo("nombreEstadoTipoImpuesto");
        criterio0.setOperacion("=");
        criterio0.setValor("Habilitado");
        criterioList0.add(criterio0);

        EstadoTipoImpuesto estadoTI  = (EstadoTipoImpuesto) FachadaPersistencia.getInstance().buscar("EstadoTipoImpuesto", criterioList0).get(0);
        nuevoTI.setEstado(estadoTI);
        
        tipoImpuesto = nuevoTI;
        
        List<DTOCriterio> criterioList1 = new ArrayList<>();
        DTOCriterio criterio1 = new DTOCriterio();
        criterio1.setAtributo("nombreEstadoAtributo");
        criterio1.setOperacion("=");
        criterio1.setValor("Habilitado");
        criterioList1.add(criterio1);

        EstadoAtributo estado  = (EstadoAtributo) FachadaPersistencia.getInstance().buscar("EstadoAtributo", criterioList1).get(0);
        
        List<DTOCriterio> criterioList2 = new ArrayList<>();
        DTOCriterio criterio2 = new DTOCriterio();
        criterio2.setAtributo("estado");
        criterio2.setOperacion("=");
        criterio2.setValor(estado);
        criterioList2.add(criterio2);

        List<Object> listaAtributo = FachadaPersistencia.getInstance().buscar("Atributo", criterioList2);
        
        List<DTOUsuarioLab> listaDTOAtributo = new ArrayList<>();
        
        for(Object atributo: listaAtributo){
            DTOUsuarioLab dtoAtributo = new DTOUsuarioLab();
            
            int codigo = ((Atributo)atributo).getCodigoAtributo();
            dtoAtributo.setCodigo(codigo);
            
            String nombre = ((Atributo)atributo).getNombreAtributo();
            dtoAtributo.setNombre(nombre);
            
            TipoDato tipo = ((Atributo)atributo).getTipoDato();
            String nombreTipo = tipo.getNombreTipoDato();
            dtoAtributo.setTipo(nombreTipo);
            
            listaDTOAtributo.add(dtoAtributo);
        }
        
        return listaDTOAtributo;
    }
    
    public void guardarNuevo(List<DTONuevoAtributo> atributos){
        
        tipoImpuesto.setCodigoTipoImpuesto(abs(tipoImpuesto.getNombreTipoImpuesto().hashCode()));
        
        FachadaPersistencia.getInstance().guardar(tipoImpuesto);
        
        for(DTONuevoAtributo nuevoAtr: atributos){
            TipoImpuestoAtributo nuevoTIA = new TipoImpuestoAtributo();
            int orden = nuevoAtr.getOrden();
            nuevoTIA.setOrden(orden);
            int codigo = nuevoAtr.getCodigo();
            
            List<DTOCriterio> criterioList1 = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("codigoAtributo");
            criterio1.setOperacion("=");
            criterio1.setValor(codigo);
            criterioList1.add(criterio1);
            
            Atributo atributo  = (Atributo) FachadaPersistencia.getInstance().buscar("Atributo", criterioList1).get(0);
            
            nuevoTIA.setAtributo(atributo);
            nuevoTIA.setTipoImpuesto(tipoImpuesto);
            FachadaPersistencia.getInstance().guardar(nuevoTIA);
        }
    }
    
    public List<DTOTipoImpAtrib> modificarTipoImpuesto(int codigoTipoImpuesto){
        
        List<DTOCriterio> criterioList1 = new ArrayList<>();
        DTOCriterio criterio1 = new DTOCriterio();
        criterio1.setAtributo("codigoTipoImpuesto");
        criterio1.setOperacion("=");
        criterio1.setValor(codigoTipoImpuesto);
        criterioList1.add(criterio1);

        tipoImpuesto  = (TipoImpuesto) FachadaPersistencia.getInstance().buscar("TipoImpuesto", criterioList1).get(0);
        
        List<DTOCriterio> criterioList2 = new ArrayList<>();
        DTOCriterio criterio2 = new DTOCriterio();
        criterio2.setAtributo("tipoImpuesto");
        criterio2.setOperacion("=");
        criterio2.setValor(tipoImpuesto);
        criterioList2.add(criterio2);

        List<Object> listaTIA  = FachadaPersistencia.getInstance().buscar("TipoImpuestoAtributo", criterioList2);
        
        List<DTOCriterio> criterioList3 = new ArrayList<>();
        DTOCriterio criterio3 = new DTOCriterio();
        criterio3.setAtributo("nombreEstadoAtributo");
        criterio3.setOperacion("=");
        criterio3.setValor("Habilitado");
        criterioList3.add(criterio3);

        EstadoAtributo estadoAtr = (EstadoAtributo) FachadaPersistencia.getInstance().buscar("EstadoAtributo", criterioList3).get(0);
        
        List<DTOCriterio> criterioList4 = new ArrayList<>();
        DTOCriterio criterio4 = new DTOCriterio();
        criterio4.setAtributo("estado");
        criterio4.setOperacion("=");
        criterio4.setValor(estadoAtr);
        criterioList4.add(criterio4);
        
        List<Object> listaAtr  = FachadaPersistencia.getInstance().buscar("Atributo", criterioList4);
        
        List<DTOTipoImpAtrib> listaDTOTIA = new ArrayList<>();
        
        for(Object tipoImpAtr: listaTIA){
            DTOTipoImpAtrib dtoTIA = new DTOTipoImpAtrib();
            
            int orden = ((TipoImpuestoAtributo)tipoImpAtr).getOrden();
            dtoTIA.setOrden(orden);
            
            Atributo atributo = ((TipoImpuestoAtributo)tipoImpAtr).getAtributo();
            DTOUsuarioLab dtoAtributo = new DTOUsuarioLab();
            
            String nombre = atributo.getNombreAtributo();
            dtoAtributo.setNombre(nombre);
            
            int codigo = atributo.getCodigoAtributo();
            dtoAtributo.setCodigo(codigo);
            
            String tipo = atributo.getTipoDato().getNombreTipoDato();
            dtoAtributo.setTipo(tipo);
            
            dtoTIA.setDtoAtributo(dtoAtributo);
            
            listaDTOTIA.add(dtoTIA);
            
            listaAtr.remove(atributo);
        }
        
        for(Object excAtr: listaAtr){
            DTOTipoImpAtrib dtoTIAFicticio = new DTOTipoImpAtrib();
            dtoTIAFicticio.setOrden(-1);
            
            DTOUsuarioLab dtoExcAtr = new DTOUsuarioLab();
            dtoExcAtr.setCodigo(((Atributo)excAtr).getCodigoAtributo());
            dtoExcAtr.setNombre(((Atributo)excAtr).getNombreAtributo());
            dtoExcAtr.setTipo(((Atributo)excAtr).getTipoDato().getNombreTipoDato());
            
            dtoTIAFicticio.setDtoAtributo(dtoExcAtr);
            
            listaDTOTIA.add(dtoTIAFicticio);
        }
        
        return listaDTOTIA;
    }
    
    public void guardarModificado(List<DTOModificarAtributo> atributos, String nombre, boolean editable){
        tipoImpuesto.setNombreTipoImpuesto(nombre);
        tipoImpuesto.setImporteEditable(editable);
        
        List<DTOCriterio> criterioList2 = new ArrayList<>();
        DTOCriterio criterio2 = new DTOCriterio();
        criterio2.setAtributo("tipoImpuesto");
        criterio2.setOperacion("=");
        criterio2.setValor(tipoImpuesto);
        criterioList2.add(criterio2);

        List<Object> listaTIA  = FachadaPersistencia.getInstance().buscar("TipoImpuestoAtributo", criterioList2);
        
        for(DTOModificarAtributo modAtr: atributos){
            TipoImpuestoAtributo nuevoTIA = null;
            int codigo = modAtr.getCodigo();
            boolean existe = false;
            for(Object actualTIA: listaTIA){
                Atributo actualAtr = ((TipoImpuestoAtributo)actualTIA).getAtributo();
                if(actualAtr.getCodigoAtributo() == codigo){
                    existe = true;
                    nuevoTIA = (TipoImpuestoAtributo)actualTIA;
                    break;
                }
            }
            
            boolean descartar = modAtr.isDescartar();
            if(!existe && descartar) continue;
            
            if(!existe){
                nuevoTIA = new TipoImpuestoAtributo();
                
                List<DTOCriterio> criterioList1 = new ArrayList<>();
                DTOCriterio criterio1 = new DTOCriterio();
                criterio1.setAtributo("codigoAtributo");
                criterio1.setOperacion("=");
                criterio1.setValor(codigo);
                criterioList1.add(criterio1);
                
                Atributo nuevoAtr  = (Atributo) FachadaPersistencia.getInstance().buscar("Atributo", criterioList1).get(0);
                
                nuevoTIA.setAtributo(nuevoAtr);
            }
            int orden = modAtr.getOrden();
            nuevoTIA.setOrden(orden);
            nuevoTIA.setDescartado(descartar);
            nuevoTIA.setTipoImpuesto(tipoImpuesto);
            
            FachadaPersistencia.getInstance().guardar(nuevoTIA);
        }
        
        FachadaPersistencia.getInstance().guardar(tipoImpuesto);
    }
    
    public void eliminarTipoImpuesto(int codigoTipoImpuesto){
        List<DTOCriterio> criterioList1 = new ArrayList<>();
        DTOCriterio criterio1 = new DTOCriterio();
        criterio1.setAtributo("nombreEstadoTipoImpuesto");
        criterio1.setOperacion("=");
        criterio1.setValor("Deshabilitado");
        criterioList1.add(criterio1);

        EstadoTipoImpuesto estado  = (EstadoTipoImpuesto) FachadaPersistencia.getInstance().buscar("EstadoTipoImpuesto", criterioList1).get(0);
        
        List<DTOCriterio> criterioList2 = new ArrayList<>();
        DTOCriterio criterio2 = new DTOCriterio();
        criterio2.setAtributo("codigoTipoImpuesto");
        criterio2.setOperacion("=");
        criterio2.setValor(codigoTipoImpuesto);
        criterioList2.add(criterio2);

        tipoImpuesto  = (TipoImpuesto) FachadaPersistencia.getInstance().buscar("TipoImpuesto", criterioList2).get(0);
        
        tipoImpuesto.setEstado(estado);
        
        FachadaPersistencia.getInstance().guardar(tipoImpuesto);
    }*/

