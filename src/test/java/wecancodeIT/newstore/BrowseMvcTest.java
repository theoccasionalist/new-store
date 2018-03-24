package wecancodeIT.newstore;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(BrowseController.class)
public class BrowseMvcTest {

	@Resource
	private MockMvc mvc;
	
	@MockBean
	private CrudRepository<Product, Long> productRepo;
	
	@Test
	public void shouldRetrieveProducts() throws Exception {
		mvc.perform(get("/products")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldRetrieveAnIndividualProduct() throws Exception {
		when(productRepo.findOne(42L)).thenReturn(new Product("some product"));
		mvc.perform(get("/products/42")).andExpect(status().isOk());
	}

	@Test
	public void shouldNotFindProductId() throws Exception {
		mvc.perform(get("/products/42")).andExpect(status().isNotFound());
	}
}
