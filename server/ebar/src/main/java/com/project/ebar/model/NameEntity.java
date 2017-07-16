/**
 * 
 */
package com.project.ebar.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Manuel
 *
 */
@MappedSuperclass
public class NameEntity extends IdEntity{

	@Column(name="nombre")
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
