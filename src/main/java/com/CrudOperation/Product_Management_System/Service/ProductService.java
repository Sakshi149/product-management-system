package com.CrudOperation.Product_Management_System.Service;

import java.util.List;

import com.CrudOperation.Product_Management_System.Entities.Product;

public interface ProductService {

	List<Product> getProducts();

	Product addProducts(Product product);

	Product searchProductById(long productId);

	Product updateProduct(Product product);

	String deleteProduct(long productId);

}
