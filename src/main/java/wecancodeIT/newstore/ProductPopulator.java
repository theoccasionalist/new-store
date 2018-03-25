package wecancodeIT.newstore;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductPopulator implements CommandLineRunner {

	@Resource
	private InventoryRepository inventoryRepo;

	@Resource
	CategoryRepository categoryRepo;

	@Override
	public void run(String... args) throws Exception {
		Category sticks = new Category("Sticks");
		sticks = categoryRepo.save(sticks);
		Category threeInOne = new Category("Three in One");
		threeInOne = categoryRepo.save(threeInOne);
		Inventory stick1 = new Inventory("Oak Stick", "Ugly Stick", sticks);
		stick1 = inventoryRepo.save(stick1);
		Inventory stick2 = new Inventory("Pine Stick", "Beautiful Stick", sticks);
		stick2 = inventoryRepo.save(stick2);
		Inventory dove = new Inventory("Dove Three in One", "Great Wash", threeInOne);
		dove = inventoryRepo.save(dove);
	}
}
