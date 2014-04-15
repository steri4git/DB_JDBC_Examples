package de.steri.jdbc.domain;

/**
 * @author aeia
 *
 */
public class Person {
	
    /**
     * Definition von Attributen 
     */
	private int id;
	private String name;
	private String vorname;
	private String alter;

	/**
     * Getter und Setter
     */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getAlter() {
		return alter;
	}
	public void setAlter(String alter) {
		this.alter = alter;
	}
	
	/**
     * hashCode(), equals() und toString()
     */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alter == null) ? 0 : alter.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (alter == null) {
			if (other.alter != null)
				return false;
		} else if (!alter.equals(other.alter))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=").append(id).append(", name=").append(name)
				.append(", vorname=").append(vorname).append(", alter=")
				.append(alter).append("]");
		return builder.toString();
	}
}




