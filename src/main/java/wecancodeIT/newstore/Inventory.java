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

	private String description;

	private String image;

	@ManyToOne
	private Category category;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}

	@SuppressWarnings("unused") // needed for JSON/JPA
	private Inventory() {
	}

	public Inventory(String name) { // in for testing
		this.name = name;
	}

	public Inventory(String name, String description, String image, Category category) {
		this.name = name;
		this.description = description;
		this.image = image;
		this.category = category;
	}
}
