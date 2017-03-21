package ua.dlogushiv.productmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.dlogushiv.productmanager.dao.ProductDao;
import ua.dlogushiv.productmanager.model.Product;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        this.productDao.addProduct(product);
    }

    @Override
    @Transactional
    public void updateProduct(Product product) {
        this.productDao.updateProduct(product);
    }

    @Override
    @Transactional
    public void deleteProduct(int id) {
this.productDao.deleteProduct(id);
    }

    @Override
    @Transactional
    public Product getProductByID(int id) {
        return this.productDao.getProductById(id);
    }

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        return this.productDao.getAllProducts();
    }
}
