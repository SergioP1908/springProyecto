package es.curso.springboot.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")
public class UsuarioEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String usuario;
	    private String contrasena;
	    
	    
	    
		public UsuarioEntity() {
			super();
		}
		
		
		public UsuarioEntity(Long id, String usuario, String contrasena) {
			super();
			this.id = id;
			this.usuario = usuario;
			this.contrasena = contrasena;
		}


		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getContrasena() {
			return contrasena;
		}
		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}

	    // getters y setters
	    
}
