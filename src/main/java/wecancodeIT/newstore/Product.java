package wecancodeIT.newstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {

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
	private Product() {
	}

	public Product(String name) {
		this.name = name;
	}

	public Product(String name, Category category) {
		this.name = name;
		this.category = category;
	}
}
