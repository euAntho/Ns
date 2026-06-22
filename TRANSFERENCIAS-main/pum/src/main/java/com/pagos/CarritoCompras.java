package com.pagos;

public class CarritoCompras {

    private Producto[]productos;
    private int cantidadProductos;
    public CarritoCompras() {
        productos = new Producto[3];
        cantidadProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cantidadProductos < 3) {
            productos[cantidadProductos] = new Producto(producto.getNombre(), producto.getPrecio());
            cantidadProductos++;
        } else {
            System.out.println("El carrito de compras está lleno. No se pueden agregar más productos.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void pagar(MetodoPago metodoPago) {
        double total = calcularTotal();
        metodoPago.pagar(total);
    }

    public void mostrarProductos() {
        System.out.println("Productos en el carrito de compras:");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("- " + productos[i].getNombre() + ": $" + productos[i].getPrecio());
        }
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}