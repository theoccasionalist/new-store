package wecancodeIT.newstore;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {
	Collection<Inventory> findAllByCategory(Category category);
}
