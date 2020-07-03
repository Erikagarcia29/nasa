package ar.com.ada.api.nasa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Temperatura {
    @Id
    @OneToOne(mappedBy = "codigo_pais", cascade = CascadeType.ALL)
    private int id;
    
    private int pais;
    
    private int anio ;

    private double grados;
    private List<Temperatura>temperaturas = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public List<Temperatura> getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(List<Temperatura> temperaturas) {
        this.temperaturas = temperaturas;
    }

    
}