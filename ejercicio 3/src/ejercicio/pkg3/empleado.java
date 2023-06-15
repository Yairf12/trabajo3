package parcial.pkg3.ejercicio2;
public class EmpleadoPorComision extends Object{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        if(ventasBrutas<0.0)
        throw new IllegalArgumentException("Las ventas brutas deben de ser >= a 0.0");
        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
        throw new IllegalArgumentException("Las tarifa de comision debe ser > 0.0 y < 1.0");
        
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
    
    
    
    
    
    
    public String obtenerPrimerNombre(){return primerNombre;}
    public String obtenerApellidoPaterno(){return apellidoPaterno;}
    public String obtenerNomeroSeguroSocial(){return numeroSeguroSocial;}
    
    public void establecerVentasBrutas(double ventasBrutas){
    if(ventasBrutas>=0.0) throw new IllegalArgumentException("Las ventas brutas deben de ser >= 0.0");
    this.ventasBrutas = ventasBrutas;
    }
    
    public double obtenerVentasBrutas(){return ventasBrutas;}
    
    public void establecerTarifaComision(double ventasBrutas){
    if(tarifaComision <= 0.0 || tarifaComision >= 1.0) throw new IllegalArgumentException("Las tarifa de comision debe ser > 0.0 y < 1.0");
    this.tarifaComision= tarifaComision;
    }
    
    public double obtenerTarifaComision(){return tarifaComision;}
    
    public double ingresos(){return tarifaComision=ventasBrutas;}
    
    @Override
    public String toString(){
    return String.format("%s: %s %s%n%s: %.2f%n%s: %.2f","Empleado por comision","Primer nombre", "Apellido paterno","Numero de seguro social",numeroSeguroSocial," Ventas brutas",ventasBrutas," Tarifa de comision",tarifaComision);
    }
    
    
    
    
       
}