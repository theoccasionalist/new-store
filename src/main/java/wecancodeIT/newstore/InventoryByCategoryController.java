package wecancodeIT.newstore;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InventoryByCategoryController {

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private InventoryRepository inventoryRepo;

	@Resource
	ProductRepository productRepo;

	@RequestMapping("/inventory-by-category")
	public String showProductByCategory(@RequestParam Long id, Model model) {
		model.addAttribute("inventoryByCategoryModel", inventoryRepo.findAllByCategory(categoryRepo.findOne(id)));
		model.addAttribute("productsModel", productRepo.findAll());
		return "inventoryByCategoryView";
	}

}
