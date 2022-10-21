/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_03;

/**
 *
 * @author Juano
 */
public class LugarMatricula {
    String descripcion;
    String telefono;
    String provincia;
    int ciudad;

    public String mostrarInfo() {
        return "La descripcion del lugar es : " + this.descripcion + " su número de teléfono es:"
                + this.telefono + "la provincia es: " + this.provincia + " y la provincia "
                + this.ciudad + "años";

    }
}
