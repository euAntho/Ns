package com.pagos;

    public class App extends Notificacion {
        
        @Override
        public void enviarNotificacion(String mensaje, String destinatario) {
            System.out.println("Enviando notificación a la App: " + mensaje + " a " + destinatario);
        }
    }

