package eva1_19_static2;

/**
 *
 * @author invitado
 */
public class EVA1_19_STATIC2 {
    int x = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //.out.println(x);
        //mensajeNoEstatico();
        EVA1_19_STATIC2 obj = new EVA1_19_STATIC2();
        System.out.println(obj.x);
        obj.mensajeNoEstatico();
        mensajeEstatico();        
    }
    
    public void mensajeNoEstatico(){
        System.out.println("MENSAJE NO ESTATICO");
    }
    public static void mensajeEstatico(){//EXISTE AL INICIAR EL PROGRAMA
        System.out.println("MENSAJE NO ESTATICO");
    }
    
    
}
