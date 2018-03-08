package com.loschidos.servidorcuentasporcobrar.model;

public class ProductoModel {

    private String clave;
    private String descripcion;
    private String tipo;
    private String almacenable;

    public ProductoModel(){}

    public ProductoModel(String clave, String descripcion, String tipo, String almacenable) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.almacenable = almacenable;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAlmacenable() {
        return almacenable;
    }

    public void setAlmacenable(String almacenable) {
        this.almacenable = almacenable;
    }

    @Override
    public String toString() {
        return "ProductoModel{" +
                "clave='" + clave + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", almacenable='" + almacenable + '\'' +
                '}';
    }
}
