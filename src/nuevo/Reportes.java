/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nuevo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Reportes {
private String cliente;
private String producto;
private String unidades;
private String kilos;
private String precioxunidad;
private String precioxkilo;

public Reportes (String cliente,String producto,String unidades,String kilos,String precioxunidad,String precioxkilo){
this.cliente=cliente;
this.producto=producto;
this.unidades=unidades;
this.kilos=kilos;
this.precioxkilo=precioxkilo;
this.precioxunidad=precioxunidad;
}

    Reportes() {

    }

 
public String getCliente() {
return cliente;
}

public void setCliente(String cliente) {
this.cliente = cliente;
}

public String getProducto() {
return producto;
}

public void setProducto(String producto) {
this.producto = producto;
}

public String getUnidades() {
return unidades;
}

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getKilos() {
        return kilos;
    }

    public void setKilos(String kilos) {
        this.kilos = kilos;
    }

    public String getPrecioxunidad() {
        return precioxunidad;
    }

    public void setPrecioxunidad(String precioxunidad) {
        this.precioxunidad = precioxunidad;
    }

    public String getPrecioxkilo() {
        return precioxkilo;
    }

    public void setPrecioxkilo(String precioxkilo) {
        this.precioxkilo = precioxkilo;
    }


    

                        
}
