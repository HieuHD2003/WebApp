package hieu.dev.data.dao;

import java.util.List;

import hieu.dev.data.model.Product;

public interface ProductDao {
	public boolean insert(Product product);
	public boolean update(Product product);	
	public boolean delete(int productId);
	public Product find(int productId);
	public List<Product> findAll();
}

