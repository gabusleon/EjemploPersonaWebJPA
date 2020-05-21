package ec.edu.ups.entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *
 */
@Entity
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int codigo;
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private GregorianCalendar fechaNacimiento;
    @Transient
    private String fechaFormatoJSP;

    public Persona() {
    }

    public Persona(int codigo, String nombre, String apellido, GregorianCalendar fechaNacimiento) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNacimiento = fechaNacimiento;
    }

    // getters & setters
    public int getCodigo() {
	return codigo;
    }

    public void setCodigo(int codigo) {
	this.codigo = codigo;
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

    public GregorianCalendar getFechaNacimiento() {
	return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getFechaFormatoJSP() {
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");	
	return formato.format(fechaNacimiento.getTime());
    }
    
    public void setFechaFormatoJSP(String fechaFormatoJSP) {
	this.fechaFormatoJSP = fechaFormatoJSP;
    }

    // hashCode & equals
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + codigo;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Persona other = (Persona) obj;
	if (codigo != other.codigo)
	    return false;
	return true;
    }

    // toString
    @Override
    public String toString() {
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");
	return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + "fechaDeNacimiento="
		+ formato.format(fechaNacimiento.getTime()) + "]";
    }

}
