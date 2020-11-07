public class Actuador
{    

    public void Multiplicar(int apagado)
    {   
        int litroxmin = 20;
        int resultado = apagado*litroxmin;
        Visualizacion vis = new Visualizacion();
        vis.imprimir(resultado);
    }   
}
