/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasofinal;

/**
 *
 * @author T-102
 */
public class Direccion {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Direccion(int id, long cp, String calle, String municipio) {
        this.id = id;
        this.cp = cp;
        this.calle = calle;
        this.municipio = municipio;
    }
    private long cp;
    private String calle;
    private String municipio;

    public Direccion(long cp, String calle, String municipio) {
        this.cp = cp;
        this.calle = calle;
        this.municipio = municipio;
    }

    public Direccion() {
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
