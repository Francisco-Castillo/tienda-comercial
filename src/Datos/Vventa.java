/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

public class Vventa {
    
    private int numero_comp;
    private int cli_cod;
    private int pro_cod;
    private Double precio_unitario;
    private int cantidad_venta;
    private String fecha;

    public Vventa() {
    }

    public Vventa(int numero_comp, int cli_cod, int pro_cod, double precio_unitario, int cantidad_venta, String fecha) {
        this.numero_comp = numero_comp;
        this.cli_cod = cli_cod;
        this.pro_cod = pro_cod;
        this.precio_unitario = precio_unitario;
        this.cantidad_venta = cantidad_venta;
        this.fecha = fecha;
    }

    public int getNumero_comp() {
        return numero_comp;
    }

    public int getCli_cod() {
        return cli_cod;
    }

    public int getPro_cod() {
        return pro_cod;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public int getCantidad_venta() {
        return cantidad_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setNumero_comp(int numero_comp) {
        this.numero_comp = numero_comp;
    }

    public void setCli_cod(int cli_cod) {
        this.cli_cod = cli_cod;
    }

    public void setPro_cod(int pro_cod) {
        this.pro_cod = pro_cod;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public void setCantidad_venta(int cantidad_venta) {
        this.cantidad_venta = cantidad_venta;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
     
}
