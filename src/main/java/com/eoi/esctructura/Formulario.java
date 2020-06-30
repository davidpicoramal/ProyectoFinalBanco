
package com.eoi.esctructura;


public class Formulario {
    String nombre;
    String apellido1;
    String apellido2;
    String dni;
    String telefono;
    String email;
    String calle ;
    String numero;
    String piso;
    String poblacion;
    String fechanac;
    String cp;
    String contrasenya;
    
    public Formulario(){
    
}

    public Formulario(String nombre, String apellido1, String apellido2, String dni, String telefono, String email, String calle, String numero, String piso, String poblacion, String fechanac, String cp, String contrasenya) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.poblacion = poblacion;
        this.fechanac = fechanac;
        this.cp = cp;
        this.contrasenya = contrasenya;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    @Override
    public String toString() {
        return "Formulario{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + ", telefono=" + telefono + ", email=" + email + ", calle=" + calle + ", numero=" + numero + ", pisoLetra=" + piso + ", poblacion=" + poblacion + ", fechanac=" + fechanac + ", cp=" + cp + ", contrasenya=" + contrasenya + '}';
    }
    
    

    
    
    
    
    
    
       
}
