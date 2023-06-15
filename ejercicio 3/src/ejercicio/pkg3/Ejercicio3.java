/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

/**
 *
 * @author Uciel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Facturas PruebaFactura1 = new Facturas();
        PruebaFactura1.setDescripcionPieza(" Martillos");
        PruebaFactura1.setNumeroPieza("tres  piezas");
        PruebaFactura1.setCantidadArticulos(3);
        PruebaFactura1.setPrecioArticulo(322.72);
        System.out.println("Factura 1: ");
        System.out.println("Descripcion del producto: "+PruebaFactura1.getDescripcionPieza());
        System.out.println("Numero de piezas: "+PruebaFactura1.getNumeroPieza());
        System.out.println("Cantidad de articulos a comprar: "+PruebaFactura1.getCantidadArticulos());
        System.out.println("El precio de un articulo es: "+PruebaFactura1.getPrecioArticulo(322.72));
        System.out.println(PruebaFactura1.obtenerMontoFactura());
        System.out.println("");   
        
        Facturas PruebaFactura2 = new Facturas();
        PruebaFactura2.setDescripcionPieza("Taladros");
        PruebaFactura2.setNumeroPieza("Seis piezas");
        PruebaFactura2.setCantidadArticulos(6);
        PruebaFactura2.setPrecioArticulo(240.56);
        System.out.println("Factura 2: ");
        System.out.println("Descripcion del producto: "+PruebaFactura2.getDescripcionPieza());
        System.out.println("Numero de piezas: "+PruebaFactura2.getNumeroPieza());
        System.out.println("Cantidad de articulos a comprar: "+PruebaFactura2.getCantidadArticulos());
        System.out.println("El precio de un articulo es: "+PruebaFactura2.getPrecioArticulo(246.56));
        System.out.println(PruebaFactura2.obtenerMontoFactura());
        System.out.println(""); 
        
        Facturas PruebaFactura3 = new Facturas();
        PruebaFactura3.setDescripcionPieza("Tuberia");
        PruebaFactura3.setNumeroPieza("Dos piezas");
        PruebaFactura3.setCantidadArticulos(2);
        PruebaFactura3.setPrecioArticulo(-220);
        System.out.println("Factura 3: ");
        System.out.println("Descripcion del producto: "+PruebaFactura3.getDescripcionPieza());
        System.out.println("Numero de piezas: "+PruebaFactura3.getNumeroPieza());
        System.out.println("Cantidad de articulos a comprar: "+PruebaFactura3.getCantidadArticulos());
        System.out.println("El precio de un articulo es: "+PruebaFactura3.getPrecioArticulo(-220));
        System.out.println(PruebaFactura3.obtenerMontoFactura());
        System.out.println("");
    }  
}





    
    
    

