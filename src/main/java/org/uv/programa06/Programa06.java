/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa06;

import java.sql.Date;
import org.hibernate.Session;

/**
 *
 * @author yarel
 */
public class Programa06 {

    public static void main(String[] args) {
        
       DAOVenta dao=new DAOVenta();
        Venta venta= new Venta();
        
        venta.setClave(10);
        venta.setFecha("07/05/2020");
        venta.setMonto("Av 3");
        dao.create(venta);
        
        DAODetalleVenta daod=new DAODetalleVenta();
        DetalleVenta detventa= new DetalleVenta();
        
        detventa.setClaveProducto(20);
        detventa.setCantidad("10");
        detventa.setPrecio("$20");
        detventa.setSubtotal("$200");
        daod.create(detventa);
        
        
        
        System.out.println("Hello World!");
    }
}
