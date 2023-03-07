package es.studium.CajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProducto
{
	@Test
    public void aplicarDescuento_valido() 
	{
        Producto producto = new Producto();
        producto.setPrecio(100);
        producto.aplicarDescuento(20);
        assertEquals(80, producto.getPrecio(), 0.001);
    }
    
    @Test
    public void aplicarDescuento_invalido() 
    {
        Producto producto = new Producto();
        producto.setPrecio(100);
        producto.aplicarDescuento(-20);
        assertEquals(100, producto.getPrecio(), 0.001);
    }
    
    @Test
    public void setPrecio_valido() 
    {
        Producto producto = new Producto();
        producto.setPrecio(100);
        assertEquals(100, producto.getPrecio(), 0.001);
    }
    
    @Test
    public void setPrecio_invalido() 
    {
        Producto producto = new Producto();
        producto.setPrecio(-100);
        assertEquals(0, producto.getPrecio(), 0.001);
    }
    
    @Test
    public void setIVA_valido() 
    {
        Producto producto = new Producto();
        producto.setIVA(10);
        assertEquals(10, producto.getIVA());
    }
    
    @Test
    public void setIVA_invalido() 
    {
        Producto producto = new Producto();
        producto.setIVA(-10);
        assertEquals(21, producto.getIVA());
    }
}
