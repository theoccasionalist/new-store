package wecancodeIT.newstore;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private ProductRepository productRepo;

	@RequestMapping("/categories")
	public String showCategories(Model model) {
		model.addAttribute("categoriesModel", categoryRepo.findAll());
		model.addAttribute("productsModel", productRepo.findAll());
		return "categoriesView";
	}

}
