package wecancodeIT.newstore;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
	Collection<Product> findAllByCategory(Category category);
}
