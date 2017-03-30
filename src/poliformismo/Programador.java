
package poliformismo;


public class Programador extends Empleado {

    public Programador(String nombre) {
        super(nombre);
    }
    @Override
    public double CalcularSalario(){
        return 100;
    }
}
