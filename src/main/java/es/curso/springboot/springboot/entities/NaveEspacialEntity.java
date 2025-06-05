package es.curso.springboot.springboot.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "NaveEspacial")
public class NaveEspacialEntity {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String tipo;
    private int vida = 1000;
    private int ataque;
    private int defensa;
    
	public NaveEspacialEntity() {
		super();
	}

	public NaveEspacialEntity(Long id, String nombre, String tipo, int ataque, int defensa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.ataque = ataque;
		this.defensa = defensa;
	}
	
	



	public NaveEspacialEntity(String nombre, String tipo, int vida, int ataque, int defensa) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
    
	
    

}
