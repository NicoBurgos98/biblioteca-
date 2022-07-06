/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Asus
 */
public class Prestamos extends libros {
 
    private int codigo;
    private int nummero_del_socio;
    private String fecha_emprestados;

    public Prestamos() {
    }

    public Prestamos(int codigo, int nummero_del_socio, String fecha_emprestados) {
        this.codigo = codigo;
        this.nummero_del_socio = nummero_del_socio;
        this.fecha_emprestados = fecha_emprestados;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNummero_del_socio() {
        return nummero_del_socio;
    }

    public void setNummero_del_socio(int nummero_del_socio) {
        this.nummero_del_socio = nummero_del_socio;
    }

    public String getFecha_emprestados() {
        return fecha_emprestados;
    }

    public void setFecha_emprestados(String fecha_emprestados) {
        this.fecha_emprestados = fecha_emprestados;
    }


    
    
    
    
    }
    
    

  

   





