public class Coordenada{

    // ------------
    // Atributos
    // ------------
    
    private double x;
    private double y;

    // ------------
    // Métodos
    // ------------
    public Coordenada(){

    }
    
    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada z){
        x = z.x;
        y = z.y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    // -----------------
    // Métodos de acceso
    // -----------------
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    // Verificar si las coordenadas son iguales
    public Boolean verificarIgualdad(){
        
    }

    // -----------------
    // Método ejecutable
    // -----------------

    public static void main(String[] args) {
        
        Coordenada z1 = new Coordenada(1,2);
        System.out.println("Coordenada 1" + z1);
        Coordenada z2 = new Coordenada(z1);
        System.out.println("Coordenada 2 "+ z2);
    }
}   