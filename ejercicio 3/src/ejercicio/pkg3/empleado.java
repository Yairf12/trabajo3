/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3;

/**
 *
 * @author Uciel
 */
public class Facturas {
        public String numeroPieza;
    public String descripcionPieza;
    public int cantidadArticulos;
    public double precioArticulo;
    
    public Facturas(String numeroPieza, String descripcionPieza, int cantidadArticulos, double precioArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidadArticulos = cantidadArticulos;
        this.precioArticulo = precioArticulo;
    }
    
    public String getNumeroPieza() {
        return numeroPieza;
    }
    
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }
    
    public String getDescripcionPieza() {
        return descripcionPieza;
    }
    
    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public double getPrecioArticulo(double par) {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        if (precioArticulo<0){
            System.out.println("0.0");
        } else{
            this.precioArticulo = precioArticulo;
        }
    }
    
    public Facturas() {
    }
    
    public double obtenerMontoFactura(){
        double nc;
        
        nc= (cantidadArticulos * precioArticulo);
        System.out.println("El total a pagar por su compra es: ");
        
        if(nc<0){
            System.out.println("0");
        }
        return nc;
    }

}
