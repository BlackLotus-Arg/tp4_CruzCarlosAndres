package ar.edu.unju.fi.model;

import ar.edu.unju.fi.enums.Modalidad;

public class Materia {
	private Integer codigo;
	private String nombre;
	private String curso;
	private Float cantidad_horas;
	private Modalidad modalidad;
	private Docente docente;
	private Carrera carrera;
	
	public Materia() {}

	public Materia(Integer codigo, String nombre, String curso, Float cantidad_horas, Modalidad modalidad,
			Docente docente, Carrera carrera) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cantidad_horas = cantidad_horas;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Float getCantidad_horas() {
		return cantidad_horas;
	}

	public void setCantidad_horas(Float cantidad_horas) {
		this.cantidad_horas = cantidad_horas;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
}

