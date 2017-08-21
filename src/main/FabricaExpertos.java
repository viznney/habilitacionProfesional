package main;

public class FabricaExpertos
{

    private static FabricaExpertos instancia;

    public FabricaExpertos ()
    {
    }

    public static FabricaExpertos getInstancia ()
    {
        if (instancia == null)
        {
            instancia = new FabricaExpertos();
        }
        return instancia;
    }

    public Object crearExperto (String cu)
    {
        switch (cu)
        {
            case "Login":
                return new DecoradorLogin();
            default:
                return null;
        }
    }

}
