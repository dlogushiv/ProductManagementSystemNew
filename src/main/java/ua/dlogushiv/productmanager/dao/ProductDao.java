package ua.dlogushiv.productmanager.dao;

import ua.dlogushiv.productmanager.model.Product;

import java.util.List;

public interface ProductDao {
    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void deleteProduct(int id);

    public Product getProductById(int id);

    public List<Product> getAllProducts();
}
