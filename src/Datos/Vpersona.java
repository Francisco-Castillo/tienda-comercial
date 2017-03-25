
package Datos;

import java.sql.Date;


public class Vpersona {
    // ATRIBUTOS
    
private int    idpersona;
private String nombre ;
private String apellido;
private Date   fechanac;
private int    tipoDni ;
private String numDni ;
private String domicilio; 
private String numdomicilio ;
private String barrio ;
private int    ciudad ;
private String localidad ;
private String telefono ;
private String email;
private Date   fechaalta;

    public Vpersona() {
    }

    public Vpersona(int idpersona, String nombre, String apellido, Date fechanac, int tipoDni, String numDni, String domicilio, String numdomicilio, String barrio, int ciudad, String localidad, String telefono, String email, Date fechaalta) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanac = fechanac;
        this.tipoDni = tipoDni;
        this.numDni = numDni;
        this.domicilio = domicilio;
        this.numdomicilio = numdomicilio;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.localidad = localidad;
        this.telefono = telefono;
        this.email = email;
        this.fechaalta = fechaalta;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public void setTipoDni(int tipoDni) {
        this.tipoDni = tipoDni;
    }

    public void setNumDni(String numDni) {
        this.numDni = numDni;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setNumdomicilio(String numdomicilio) {
        this.numdomicilio = numdomicilio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public int getTipoDni() {
        return tipoDni;
    }

    public String getNumDni() {
        return numDni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getNumdomicilio() {
        return numdomicilio;
    }

    public String getBarrio() {
        return barrio;
    }

    public int getCiudad() {
        return ciudad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Date getFechaalta() {
        return fechaalta;
    }
    
    




  


  
    
    
}
