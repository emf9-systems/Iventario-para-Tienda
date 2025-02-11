package com.aplicacion;

import com.clases.ComputadorPortatil;
import com.clases.Televisor;
import com.clases.TiendaElectronica;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        Televisor tv = new Televisor("Smart TV 32” HD ROKU Caixun", 99990.0, 12, 32.0,
    			768, "Caixun", true);
        ComputadorPortatil laptop = new ComputadorPortatil("HP VICTUS 15-fb0130la", 529990.0, 6, "HP", "AMD Ryzen 5 5600H", "GTX 1650 4GB", true, 8, 512, "SSD", "FreeDOS", 1080, 15.6, 144);
        ComputadorPortatil laptop2 = new ComputadorPortatil("HP VICTUS 15-fb0130la", 529990.0, 3, "HP", "AMD Ryzen 5 5600H", "GTX 1650 4GB", true, 8, 512, "SSD", "FreeDOS", 1080, 15.6, 144);
        ComputadorPortatil laptop3 = new ComputadorPortatil("HP VICTUS 15-fa1108la", 989990.0, 6, "HP", "Intel Core i7-13620H", "RTX 3050 6GB", true, 16, 1000, "SSD", "FreeDOS", 1080, 15.6, 144);

        
        tienda.agregarProducto(tv);
        tienda.agregarProducto(laptop);
        tienda.agregarProducto(laptop3);

        
        tienda.mostrarProductos();

        tienda.venderProducto("SMART TV 32” HD ROKU CAIXUN");
        tienda.venderProducto("hp victus 15-FB0130lA");
        tienda.venderProducto("hp victus 15-FB0130lA");
        tienda.venderProducto("hp victus 15-FB0130lA");

        tienda.mostrarProductos();
        
        tienda.agregarProducto(laptop2);
        
        tienda.mostrarProductos();

    }
}
