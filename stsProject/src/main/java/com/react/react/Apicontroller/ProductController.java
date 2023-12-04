package com.react.react.Apicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.react.ApiService.ProductService;
import com.react.react.AppEntity.Product;



@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    private ProductService ser;


    @GetMapping("/productsDetails")
    public List<Product> getStudentList(){
        return ser.getProduct();
    }


    @PutMapping("/productsDetails/update")
    public String  updateProductDetails(@PathVariable int product_id,Product product){
         ser.updateProduct(product_id, product);
         return "Product saved successfully";
    }

}
