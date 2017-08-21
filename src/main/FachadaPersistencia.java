package main;

import DTOs.DTOCriterio;
import java.util.*;

public class FachadaPersistencia
{

    private static FachadaPersistencia instance;

    public FachadaPersistencia ()
    {
    }

    public static FachadaPersistencia getInstance ()
    {
        if (instance == null)
        {
            instance = new FachadaPersistencia();
        }
        return instance;
    }

    public List<Object> buscar (String claseABuscar, List<DTOCriterio> criterioList)
    {
        return FachadaInterna.getInstance().buscar(claseABuscar, criterioList);
    }

    public void guardar (Object objeto)
    {
        FachadaInterna.getInstance().guardar(objeto);
    }

}
