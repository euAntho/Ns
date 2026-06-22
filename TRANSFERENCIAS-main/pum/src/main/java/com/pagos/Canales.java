package com.pagos;

public class Canales {

    String canales [] = {"SMS", "Email", "App"};
    Notificacion notificaciones [] = new Notificacion[3];

    public void agregarNotificacion(Notificacion notificacion) {
        for (int i = 0; i < notificaciones.length; i++) {
            if (notificaciones[i] == null) {
                notificaciones[i] = notificacion;
                break;
            }
        }
    }
    public void enviarNotificacion(String mensaje, String destinatario) {
        for (Notificacion notificacion : notificaciones) {
            if (notificacion != null) {
                notificacion.enviarNotificacion(mensaje, destinatario);
            }
        }
    }
}
