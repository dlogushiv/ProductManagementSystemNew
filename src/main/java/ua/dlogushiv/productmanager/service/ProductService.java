package ua.dlogushiv.productmanager.service;

import ua.dlogushiv.productmanager.model.Product;

import java.util.List;

public interface ProductService {
    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void deleteProduct(int id);

    public Product getProductByID(int id);

    public List<Product> getAllProducts();

}
