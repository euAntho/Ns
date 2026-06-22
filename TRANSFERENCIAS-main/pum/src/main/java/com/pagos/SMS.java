package com.pagos;

    public class SMS extends Notificacion {
        
        @Override
        public void enviarNotificacion(String mensaje, String destinatario) {
            System.out.println("Enviando SMS: " + mensaje + " a " + destinatario);
        }
    }