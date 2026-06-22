package com.pagos;

public interface MetodoPago {
    
    boolean pagar(double monto);
    String mostrarRecibo(double monto);

}