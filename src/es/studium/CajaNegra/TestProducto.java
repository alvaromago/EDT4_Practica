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
        double resultadoReal = producto.getPrecio();
        int resultadoEsperado = 80;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void aplicarDescuento_invalido1() 
    {
        Producto producto = new Producto();
        producto.setPrecio(100);
        producto.aplicarDescuento(-20);
        double resultadoReal = producto.getPrecio();
        int resultadoEsperado = 100;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void aplicarDescuento_invalido2() 
    {
        Producto producto = new Producto();
        producto.setPrecio(100);
        producto.aplicarDescuento(200);
        double resultadoReal = producto.getPrecio();
        int resultadoEsperado = 100;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void setPrecio_valido() 
    {
        Producto producto = new Producto();
        producto.setPrecio(100);
        double resultadoReal = producto.getPrecio();
        double resultadoEsperado = 100;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void setPrecio_invalido() 
    {
        Producto producto = new Producto();
        producto.setPrecio(-100);
        double resultadoReal = producto.getPrecio();
        double resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void setIVA_valido() 
    {
        Producto producto = new Producto();
        producto.setIVA(10);
        int resultadoReal = producto.getIVA();
        int resultadoEsperado = 10;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void setIVA_invalido() 
    {
        Producto producto = new Producto();
        producto.setIVA(-10);
        int resultadoReal = producto.getIVA();
        int resultadoEsperado = 21;
        assertEquals(resultadoEsperado, resultadoReal);
    }
}
