public class Procesamiento
{
    public String duchaInfoTurn(){
        String duchaInfoTurn ="********\n*      *  \n*      *\n*    *****\n*   ¡ ¡ ¡\n*    ¡ ¡\n*    ¡  ¡\n*    ¡ ¡ ¡";
        return duchaInfoTurn;
    }

    public String duchaInfoOff(){
        String  duchaInfoOff ="********   \n*      *\n*      *\n*    *****\n*\n*\n*\n*";          
        return duchaInfoOff;
    } 

    public void metprocesamiento(int apagado)
    {       
        Actuador act = new Actuador();
        act.Multiplicar(apagado);
        for(int cont = 0; cont<apagado; cont++){
            System.out.println(duchaInfoTurn());
            System.out.println(cont);
        }
        System.out.println(duchaInfoOff());
    }
}

