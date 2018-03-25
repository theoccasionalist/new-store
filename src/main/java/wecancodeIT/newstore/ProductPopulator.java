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
		Category threeInOne = new Category("Three in One");
		threeInOne = categoryRepo.save(threeInOne);
		Product stick1 = new Product("Oak Stick", sticks);
		stick1 = productRepo.save(stick1);
		Product stick2 = new Product("Pine Stick", sticks);
		stick2 = productRepo.save(stick2);
		Product dove = new Product("Dove Three in One", threeInOne);
		dove = productRepo.save(dove);
	}
}
