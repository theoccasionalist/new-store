/*
 * package wecancodeIT.newstore;
 * 
 * import java.util.Arrays; import java.util.Collection; import
 * java.util.HashSet;
 * 
 * import javax.persistence.Entity; import javax.persistence.OneToMany;
 * 
 * @Entity public class ShoppingCart {
 * 
 * @OneToMany(mappedBy = "products") private Collection<Product> products;
 * 
 * public String name;
 * 
 * public ShoppingCart(String name, Product... products) { this.name = name;
 * this.products = new HashSet<>(Arrays.asList(products)); }
 * 
 * public void addProduct(Product product) { products.add(product); }
 * 
 * public Product getProduct(Product product) { return prod } }
 */
