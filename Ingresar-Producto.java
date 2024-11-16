/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author david
 */
class Producto {
    private int codigo;
    private String descripcion;
    private int precio;
    private int stock;
    private String categoria;

    // Constructor vacío
    public Producto() {}

    // Constructor con parámetros
    public Producto(int codigo, String descripcion, int precio, int stock, String categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    // Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "--- Datos del producto ---\n" +
               "Codigo: " + codigo + "\n" +
               "Descripcion: " + descripcion + "\n" +
               "Precio: " + precio + "\n" +
               "Stock: " + stock + "\n" +
               "Categoria: " + categoria + "\n";
    }
}