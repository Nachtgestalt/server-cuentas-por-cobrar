package com.loschidos.servidorcuentasporcobrar.entity;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "clave", unique = true, nullable = false, length = 45)
    private String clave;

    @Column(name = "descripcion", nullable = false, length = 45)
    private String descripcion;

    @Column(name = "tipo", nullable = false, length = 45)
    private String tipo;

    @Column(name = "almacenable", nullable = false, length = 45)
    private String almacenable;

    public Producto(String clave, String descripcion, String tipo, String almacenable) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.almacenable = almacenable;
    }

    public Producto(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Producto{" +
                "id=" + id +
                ", clave='" + clave + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", almacenable='" + almacenable + '\'' +
                '}';
    }
}
