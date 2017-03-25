
package Datos;

import java.sql.Date;


public class Varticulo {
    
    // atributos
    
    private String articulo_codigo;
    private String articulo_descripcion;
    private String articulo_talle;
    private double articulo_precio_contado;
    private double articulo_precio_lista;
    private int articulo_stock;
    private int articulo_categoria;
    private Date articulo_fecha_alta;
    
    // CONSTRUCTORES

    public Varticulo() {
    }

    public Varticulo(String articulo_codigo, String articulo_descripcion, String articulo_talle, double articulo_precio_contado, double articulo_precio_lista, int articulo_stock, int articulo_categoria, Date articulo_fecha_alta) {
        this.articulo_codigo = articulo_codigo;
        this.articulo_descripcion = articulo_descripcion;
        this.articulo_talle = articulo_talle;
        this.articulo_precio_contado = articulo_precio_contado;
        this.articulo_precio_lista = articulo_precio_lista;
        this.articulo_stock = articulo_stock;
        this.articulo_categoria = articulo_categoria;
        this.articulo_fecha_alta = articulo_fecha_alta;
    }
    
    
    // METODOS SETTERS

    public void setArticulo_codigo(String articulo_codigo) {
        this.articulo_codigo = articulo_codigo;
    }

    public void setArticulo_descripcion(String articulo_descripcion) {
        this.articulo_descripcion = articulo_descripcion;
    }

    public void setArticulo_talle(String articulo_talle) {
        this.articulo_talle = articulo_talle;
    }

    public void setArticulo_precio_contado(double articulo_precio_contado) {
        this.articulo_precio_contado = articulo_precio_contado;
    }

    public void setArticulo_precio_lista(double articulo_precio_lista) {
        this.articulo_precio_lista = articulo_precio_lista;
    }

    public void setArticulo_stock(int articulo_stock) {
        this.articulo_stock = articulo_stock;
    }

    public void setArticulo_categoria(int articulo_categoria) {
        this.articulo_categoria = articulo_categoria;
    }

    public void setArticulo_fecha_alta(Date articulo_fecha_alta) {
        this.articulo_fecha_alta = articulo_fecha_alta;
    }
    
    // METODOS GETTERS

    public String getArticulo_codigo() {
        return articulo_codigo;
    }

    public String getArticulo_descripcion() {
        return articulo_descripcion;
    }

    public String getArticulo_talle() {
        return articulo_talle;
    }

    public double getArticulo_precio_contado() {
        return articulo_precio_contado;
    }

    public double getArticulo_precio_lista() {
        return articulo_precio_lista;
    }

    public int getArticulo_stock() {
        return articulo_stock;
    }

    public int getArticulo_categoria() {
        return articulo_categoria;
    }

    public Date getArticulo_fecha_alta() {
        return articulo_fecha_alta;
    }
    
    
    
    
}
