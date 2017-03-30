
package poliformismo;


public class Arquitecto extends Empleado {

    public Arquitecto(String nombre) {
        super(nombre);
    }
    @Override
    public double CalcularSalario(){
        return 300;
    }
    
}
