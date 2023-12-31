package model.entities;//pacote de entidades do negocio

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable { 	//serializable p/ q o objeto seja transformado em sequencia de bytes(p/objeto ser gravado em arquivo, trafegar em redes etc

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	public Department() {
		
	}

	public Department(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//hashcode e equals p/ comparar os elementos por seus valores e nao por ponteiros
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	
	
	
}
