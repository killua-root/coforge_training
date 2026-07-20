package com.coforge.pms.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.coforge.pms.model.Product;

@Service
public class ProductService {

	private Map<Integer, Product> map = new HashMap<>();

	// INSERT
	public String addProduct(Product product) {

		if (product.getPid() <= 0)
			return "Product ID must be greater than 0";

		if (product.getpName() == null || product.getpName().trim().isEmpty())
			return "Product Name cannot be empty";

		if (product.getpPrice() <= 0)
			return "Product Price must be greater than 0";

		if (product.getpQty() <= 0)
			return "Product Quantity must be greater than 0";

		if (map.containsKey(product.getPid()))
			return "Product ID Already Exists";

		map.put(product.getPid(), product);

		return "SUCCESS : Product Added";
	}

	// UPDATE
	public String updateProduct(Product product) {

		if (product.getPid() <= 0)
			return "Product ID must be greater than 0";

		if (product.getpName() == null || product.getpName().trim().isEmpty())
			return "Product Name cannot be empty";

		if (product.getpPrice() <= 0)
			return "Product Price must be greater than 0";

		if (product.getpQty() <= 0) {
			return "Product Quantity must be greater than 0";}

		if (!map.containsKey(product.getPid())) {
			return "Product Not Found";
			}

		Product p = map.get(product.getPid());

		p.setpName(product.getpName());
		p.setpPrice(product.getpPrice());
		p.setpQty(product.getpQty());

		return "SUCCESS : Product Updated";
	}

	// DELETE
	public String deleteProduct(int pid) {

		if (pid <= 0) {
			return "Invalid Product ID";
		}
		if (!map.containsKey(pid)) {
			return "Product Not Found";
		}
		map.remove(pid);

		return "SUCCESS : Product Deleted";
	}
	public String findProduct(int pid) {

		if (pid <= 0) {
			return "Invalid Product ID";
		}
		Product product = map.get(pid);

		if (product == null) {
			return "Product Not Found";
		}
		return product.toString();
	}
	public Collection<Product> findAllProducts() {

		return map.values();
	}
}