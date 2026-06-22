package com.pagos;

public class TarjetaCredito implements MetodoPago {
    private String numeroTarjeta;
    private String nombreTitular;
    private String FechaExpiracion;
    private String cvv;

    

    public TarjetaCredito(String numeroTarjeta, String nombreTitular, String fechaExpiracion, String cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.FechaExpiracion = FechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    @Override
    public boolean pagar(double monto) {

        if (validarTarjeta()){
             System.out.println("Se está validando su numero de tarjata");
        if (monto>3000) {
            System.out.println("No se pudo procesar su transferencia, sobrepaso el monto");
            return false;
        }else{
            System.out.println("Se proceso su transferencia por: "+monto+" fue exitoso");
        return true;
        }
    }else{
        return false;
    }
    }

    @Override
    public String mostrarRecibo(double monto) {
        return "Recibo de pago por: "+monto+" con tarjeta de credito: "+numeroTarjeta+ " A nombre de: "+nombreTitular;
    }

    private boolean validarTarjeta(){
        System.out.println("Validando numero de cuenta: "+numeroTarjeta);
        System.out.println("Validando nombre del titular: "+nombreTitular);
        System.out.println("Validando fecha de expiracion: "+FechaExpiracion);
        System.out.println("Validando cvv: "+cvv);

        if (cvv.length()!= 3) {
            System.out.println("CVV no valido");
            return false;
        }else{
            System.out.println("Tarjeta validada correctamente");
            return true;
        }
    }


}
