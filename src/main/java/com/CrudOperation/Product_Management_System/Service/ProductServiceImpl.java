package com.CrudOperation.Product_Management_System.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.CrudOperation.Product_Management_System.Entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	List<Product> list;

	public ProductServiceImpl() {

		list = new ArrayList<>();
		list.add(new Product(1, "Laptop", "This is Laptop"));
		list.add(new Product(2, "Keyboard", "This is Keyboard"));
		list.add(new Product(3, "T.V", "This is TV"));

	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Product addProducts(Product product) {
		// TODO Auto-generated method stub
		list.add(product);
		return product;
	}

	@Override
	public Product searchProductById(long productId) {
		// TODO Auto-generated method stub
		Product searchedProduct = null;

		for (Product p : list) {
			if (p.getId() == productId) {
				searchedProduct = p;
				break;
			}

		}

		return searchedProduct;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub

		for (Product p : list) {

			if (p.getId() == product.getId()) {
				p.setName(product.getName());
				p.setDescription(product.getDescription());
				break;
			}
		}

		return product;
	}

	@Override
	public String deleteProduct(long productId) {
		// TODO Auto-generated method stub

		List<Product> removeProduct = new ArrayList<>();

		for (Product p : list) {

			if (p.getId() == productId) {

				removeProduct.add(p);
				break;
			}
		}
		list.removeAll(removeProduct);

		return "Product Deleted Successfully";
	}

}
