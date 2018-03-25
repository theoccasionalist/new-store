package wecancodeIT.newstore;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductByCategoryController {

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private ProductRepository productRepo;

	@RequestMapping("/product-by-category")
	public String showProductByCategory(@RequestParam Long id, Model model) {
		model.addAttribute("productByCategoryModel", productRepo.findAllByCategory(categoryRepo.findOne(id)));
		return "productByCategoryView";
	}

}
