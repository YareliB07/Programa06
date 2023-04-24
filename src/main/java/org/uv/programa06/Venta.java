/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa06;

import java.sql.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author yarel
 */
@Entity
@Table(name = "venta")
public class Venta  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clave;
    
    @Column(name ="monto")
    private double monto;
    
    @Column(name ="fecha")
    private Date fecha;
    
    
    @OneToMany(mappedBy="venta")
    private Set<DetalleVenta> detalleventa;

    public Set<DetalleVenta> getDetalleventa() {
        return detalleventa;
    }

    public void setDetalleventa(Set<DetalleVenta> detalleventa) {
        this.detalleventa = detalleventa;
    }
   

    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
