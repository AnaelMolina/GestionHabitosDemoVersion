package modelo.entidades;

import java.io.Serializable;
import java.sql.Date;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idUsuario;
	private String nombre;
	private String apellido;
	private String nombreUsuario;
	private String email;
	private String contraseña;
	private Date fechaInicio;
	private boolean notificacionesActivas;

	public Usuario() {
	}

	public Usuario(int idUsuario, String nombre, String apellido, String nombreUsuario, String email, String contraseña,
			Date fechaInicio, boolean notificacionesActivas) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.contraseña = contraseña;
		this.fechaInicio = fechaInicio;
		this.notificacionesActivas = notificacionesActivas;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public boolean isNotificacionesActivas() {
		return notificacionesActivas;
	}

	public void setNotificacionesActivas(boolean notificacionesActivas) {
		this.notificacionesActivas = notificacionesActivas;
	}

}
