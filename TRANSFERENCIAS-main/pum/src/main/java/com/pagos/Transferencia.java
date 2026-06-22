package com.pagos;

public class Transferencia implements MetodoPago {
    
    private String numeroCuenta;
    private String banco;
    private String cedula;

    public Transferencia(String numeroCuenta, String banco, String cedula) {
        this.numeroCuenta = numeroCuenta;
        this.banco = banco;
        this.cedula = cedula;
    }


    @Override
    public boolean pagar(double monto) {
        if (validarCuenta()){
             System.out.println("Se está validando su numero de cuenta");
        if (monto<5) {
            System.out.println("No se pudo procesar su transferencia, monto muy bajo");
            return false;
        }else{
            System.out.println("Se proceso su transferencia por: "+monto);
        return true;
        }
    }else{
        return false;
    }

        }
       

    @Override
    public String mostrarRecibo(double monto) {
       return "Su recibo de transferencia es: "+monto;
    }

    private boolean validarCuenta(){
        System.out.println("Validando numero de cuenta: "+numeroCuenta);
        System.out.println("Validando banco: "+banco);
        System.out.println("Validando cedula: "+cedula);
        if (cedula.length()!=10) {
            System.out.println("Su cedula no es correcta: ");
            return false;
        }else{
            System.err.println("Su cedula es correcta: "+cedula);
            return true;
        }
    }


}