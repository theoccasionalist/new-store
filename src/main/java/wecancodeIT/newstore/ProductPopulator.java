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
		Category threeInOne = new Category("The One");
		threeInOne = categoryRepo.save(threeInOne);
		Category bots = new Category("Home Assistant Robot");
		bots = categoryRepo.save(bots);
		Category food = new Category("Micheal's Favorite");
		food = categoryRepo.save(food);
		Inventory stick1 = new Inventory("A Stick", "The only stick you'll ever need.", "/images/stick.png", sticks);
		stick1 = inventoryRepo.save(stick1);
		Inventory dove = new Inventory("Suave Three in One Body Wash", "The best wash--the only wash.",
				"/images/three-in-one.jpg", threeInOne);
		dove = inventoryRepo.save(dove);
		Inventory robot = new Inventory("The Happy Helper", "The Latest and Greatest in Homecare Assistance",
				"/images/robot.png", bots);
		robot = inventoryRepo.save(robot);
		Inventory melt = new Inventory("Melt's Barbeque Tofu Wings", "Better than Beef", "/images/melt.jpg", food);
		melt = inventoryRepo.save(melt);

	}
}
