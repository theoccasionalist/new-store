package wecancodeIT.newstore;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	@OneToMany(mappedBy = "category")
	private Collection<Inventory> inventory;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Inventory> getInventory() {
		return inventory;
	}

	@SuppressWarnings("unused")
	private Category() {
	}

	public Category(String name) {
		this.name = name;
	}

}
