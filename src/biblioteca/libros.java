/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Asus
 */
public class libros {
    
    private int codigo;
    private String autor;
    private String titulo;
    private String entrega_de_libro;
    private String Disponibilidad_o_no;

    public libros() {
    }

    public libros(int codigo, String autor, String titulo, String entrega_de_libro, String Disponibilidad_o_no) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.entrega_de_libro = entrega_de_libro;
        this.Disponibilidad_o_no = Disponibilidad_o_no;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEntrega_de_libro() {
        return entrega_de_libro;
    }

    public void setEntrega_de_libro(String entrega_de_libro) {
        this.entrega_de_libro = entrega_de_libro;
    }

    public String getDisponibilidad_o_no() {
        return Disponibilidad_o_no;
    }

    public void setDisponibilidad_o_no(String Disponibilidad_o_no) {
        this.Disponibilidad_o_no = Disponibilidad_o_no;
    }
    
    
    
}
