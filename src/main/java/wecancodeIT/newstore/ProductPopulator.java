package wecancodeIT.newstore;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductPopulator implements CommandLineRunner {

	@Resource
	private ProductRepository productRepo;

	@Resource
	CategoryRepository categoryRepo;

	@Override
	public void run(String... args) throws Exception {
		Category sticks = new Category("Sticks");
		sticks = categoryRepo.save(sticks);
		Product stick1 = new Product("Oak Stick", sticks);
		stick1 = productRepo.save(stick1);
		Product stick2 = new Product("Pine Stick", sticks);
		stick2 = productRepo.save(stick2);
	}
}
