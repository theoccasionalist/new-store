package wecancodeIT.newstore;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	@Resource
	private CategoryRepository categoryRepo;

	@RequestMapping("/categories")
	public String showCategories(Model model) {
		model.addAttribute("categoriesModel", categoryRepo.findAll());
		return "categoriesView";
	}

}
