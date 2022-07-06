/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Asus
 */
public class Usuario_socio {
    
    private int id;
    private String Nombre;
    private String Direccion;
    private int telefono;
    private char sexo;
    private int año_de_nacimiento; 

    public Usuario_socio(int id, String Nombre, String Direccion, int telefono, char sexo, int año_de_nacimiento) {
        this.id = id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.año_de_nacimiento = año_de_nacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAño_de_nacimiento() {
        return año_de_nacimiento;
    }

    public void setAño_de_nacimiento(int año_de_nacimiento) {
        this.año_de_nacimiento = año_de_nacimiento;
    }

    
    
    


}
           
    
    
