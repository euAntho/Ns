package com.pagos;

public class Main {
    public static void main(String[] args) {
        
         Canales canal = new Canales();
        /*Transferencia transferencia1 = new Transferencia("1323213213", "Pichincha", "13213213213");
        TarjetaCredito tarjetaCredito1 = new TarjetaCredito("13123123", "Fabian", "02/67", "234");
       
        
      
        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(new Producto("Laptop", 1500));
        carrito.agregarProducto(new Producto("Smartphone", 800));
        carrito.agregarProducto(new Producto("Audífonos", 200));
        carrito.mostrarProductos();
        System.out.println();
        System.out.println("Pago con transferencia");
        carrito.pagar(transferencia1); 
        System.out.println();
        System.out.println("Pago con tarjeta de credito");
        carrito.pagar(tarjetaCredito1);


        */

        System.out.println("Enviando notificaciones");
        canal.agregarNotificacion(new SMS());
        canal.enviarNotificacion("ALERTA DE TRANSFERENCIA", "fabiandeus12@outlook.com");
        

    }
}