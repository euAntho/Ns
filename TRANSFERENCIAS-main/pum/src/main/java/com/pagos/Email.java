package com.pagos;

    public class Email extends Notificacion {
        
        @Override
        public void enviarNotificacion(String mensaje, String destinatario) {
            System.out.println("Enviando Email: " + mensaje + " a " + destinatario);
        }
    }