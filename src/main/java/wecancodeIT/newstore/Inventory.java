package wecancodeIT.newstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Inventory {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	@ManyToOne
	private Category category;

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	@SuppressWarnings("unused") // needed for JSON/JPA
	private Inventory() {
	}

	public Inventory(String name) {
		this.name = name;
	}

	public Inventory(String name, Category category) {
		this.name = name;
		this.category = category;
	}
}
