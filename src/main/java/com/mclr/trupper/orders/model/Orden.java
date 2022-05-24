package com.mclr.trupper.orders.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Sucursal sucursal;
    @Column(nullable = true)
    private Date fecha;
    @Column(nullable = true)
    private Double precio;
    @OneToMany(mappedBy = "orden", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> prouctos;
    public Orden() {
    }

    public Orden(Integer id, Sucursal sucursal, Date fecha, Double precio) {
        this.id = id;
        this.sucursal = sucursal;
        this.fecha = fecha;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public List<Producto> getProuctos() {
        return prouctos;
    }

    public void setProuctos(List<Producto> prouctos) {
        this.prouctos = prouctos;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", sucursal=" + sucursal +
                ", fecha=" + fecha +
                ", precio=" + precio +
                '}';
    }
}
