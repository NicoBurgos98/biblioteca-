/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Asus
 */
public class Tematica  extends libros{
 
    private String infantiles;
    private String narrativa;
    private String ensayo;
    private String poesia;

    public Tematica() {
    }

    public Tematica(String infantiles, String narrativa, String ensayo, String poesia) {
        this.infantiles = infantiles;
        this.narrativa = narrativa;
        this.ensayo = ensayo;
        this.poesia = poesia;
    }

    public Tematica(String infantiles, String narrativa, String ensayo, String poesia, int codigo, String autor, String titulo, String entrega_de_libro, String Disponibilidad_o_no) {
        super(codigo, autor, titulo, entrega_de_libro, Disponibilidad_o_no);
        this.infantiles = infantiles;
        this.narrativa = narrativa;
        this.ensayo = ensayo;
        this.poesia = poesia;
    }

    public String getInfantiles() {
        return infantiles;
    }

    public void setInfantiles(String infantiles) {
        this.infantiles = infantiles;
    }

    public String getNarrativa() {
        return narrativa;
    }

    public void setNarrativa(String narrativa) {
        this.narrativa = narrativa;
    }

    public String getEnsayo() {
        return ensayo;
    }

    public void setEnsayo(String ensayo) {
        this.ensayo = ensayo;
    }

    public String getPoesia() {
        return poesia;
    }

    public void setPoesia(String poesia) {
        this.poesia = poesia;
    }

    
    
}
