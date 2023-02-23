package eva_1_9_mensaje;

/**
 *
 * @author invitado
 */
public class EVA_1_9_MENSAJE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nPrintLn("HOLA",5);//llamada a funcion
    }
    public static void nPrintLn(String message, int num){
         for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
            
        }
   
}

