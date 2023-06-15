package proyectoherencia2;

public class ProyectoHerencia2 {

    public static void main(String[] args) {
      EmpleadoPorComision empleado = new EmpleadoPorComision("Sue", "Jones", "222-22-2222", 10000, .06);
      System.out.println("Informacion del empleado obtenida por los metodos establecer: ");
      System.out.printf("%n%s %s%n", "El primer nombre es: ", empleado.obtenerPrimerNombre());
      System.out.printf("%n%s %s%n", "El apellido paterno es: ", empleado.obtenerApellidoPaterno());
      System.out.printf("%n%s %s%n", "El numero de seguro social es: ", empleado.obtenerNomeroSeguroSocial());
      System.out.printf("%n%s %s%n", "Las ventas brutas son: ", empleado.obtenerVentasBrutas());
      System.out.printf("%n%s %s%n", "La tarifa de comsion es: ", empleado.obtenerTarifaComision());
      
      empleado.establecerVentasBrutas(500);
      empleado.establecerTarifaComision(.1);
      System.out.printf("%n%s:%n%n5s%n","Informacion actualizada del empleado, obtenida mediante toString: ", empleado);
    }
}