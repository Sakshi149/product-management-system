package com.CrudOperation.Product_Management_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CrudOperation.Product_Management_System.Entities.Product;
import com.CrudOperation.Product_Management_System.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/home")
	public String home() {
		return "This is HomePage";

	}

	@GetMapping("/view-products")
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	@PostMapping("/add-product")
	public Product addProducts(@RequestBody Product product) {

		return productService.addProducts(product);
	}

	@GetMapping("/product/{productId}")
	public Product searchProductById(@PathVariable String productId) {

		return productService.searchProductById(Long.parseLong(productId));
	}
	
	
	@DeleteMapping("/delete-product/{productId}")
	public String deleteProduct(@PathVariable String productId) {
		return productService.deleteProduct(Long.parseLong(productId));
	}
	

	@PutMapping("update-product")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

}
