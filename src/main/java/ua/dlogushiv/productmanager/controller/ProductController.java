package ua.dlogushiv.productmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.dlogushiv.productmanager.model.Product;
import ua.dlogushiv.productmanager.service.ProductService;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired(required = true)
    @Qualifier(value = "productService")
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "products", method = RequestMethod.GET)
    public String allProducts(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("allProducts", this.productService.getAllProducts());
        return "products";
    }

    @RequestMapping(value = "/products/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("product") Product product) {
        if (product.getId() == 0) {
            this.productService.addProduct(product);
        } else {
            this.productService.updateProduct(product);
        }
        return "redirect:/products";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id) {
        this.productService.deleteProduct(id);
        return "redirect:/products";
    }

    @RequestMapping(value = "edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", this.productService.getProductByID(id));
        model.addAttribute("allProducts", this.productService.getAllProducts());
        return "products";
    }

    @RequestMapping(value = "productinfo/{id}")
    public String productInfo(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", this.productService.getProductByID(id));
        return "productinfo";
    }
}
