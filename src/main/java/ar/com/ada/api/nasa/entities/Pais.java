package ar.com.ada.api.nasa.entities;
import java.util.*;
import javax.persistence.*;

@Entity
@Table
public class Pais {
    @Id
    @Column(name="codigo_pais")
   
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
     private int  codigoPais;
     
    private String nombre ;
    private List<Pais>paises = new ArrayList<>();

	public int getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Pais> getPaises() {
		return paises;
	}
	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}
}