
package poliformismo;

import java.util.ArrayList;


public class Empresa {
    private ArrayList<Empleado> empleados;
    
    public Empresa(){
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }
    public double calcularNomina(){
        double nomina=0;
        //poliformismo asignacion
        for( Empleado empleado : empleados){
            //for(int i=0; i < empleados.size(); i++)
            //Ligadura tardia
            nomina += empleado.CalcularSalario();
        }
        return nomina;
    }
    public double calcularNominaProgramadores(){
        double nomina =0;
        for( Empleado empleado : empleados){
            if(empleado instanceof Programador){
                nomina += empleado.CalcularSalario();
            }
        }
        return nomina;
    }
    public ArrayList<Empleado> ListarEmpleado(){
        return this.empleados;
    }
}
