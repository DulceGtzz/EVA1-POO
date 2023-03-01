package paquete2;

import paquete1.claseA;

/**
 *
 * @author invitado
 */
public class claseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
}
class claseF{
    public int publicF;
    int defaultF;
    private int privateF;
    
    public void prueba(){
        claseA objA = new claseA();
         //objA.publicA;
        
        //claseD es defaut en otro paquete es invisible
        //claseD objD = new claseD();
    }
}
