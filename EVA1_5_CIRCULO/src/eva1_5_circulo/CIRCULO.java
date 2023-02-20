package eva1_5_circulo;

/**
 *
 * @author HP
 */
public class CIRCULO {
   //ATRIBUTOS
    private double area;
    private double perimetro;
    private double radio;
    private double pi;
    
    //METODOS
    public CIRCULO(double rad){ //CONSTRUCOR
        area = 0;
        perimetro = 0;
        radio = rad;
        pi = 3.141592;
    }

    CIRCULO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setRadio(double rad){
        radio = rad;
    }
    
    public double calcularArea(){
        area = pi*(radio*radio);
            return area; 
    }
    
    public double calcularPerimetro(){
        perimetro = pi*(2*radio);
             return perimetro;
    }
    
    public void Imprimir(){
        System.out.println("El area un circulo con radio de "+radio+" es");
        System.out.println("area");
        System.out.println("El perimetro de un circulo con radio de "+radio+" es");
        System.out.println("perimetro");
    }
}
