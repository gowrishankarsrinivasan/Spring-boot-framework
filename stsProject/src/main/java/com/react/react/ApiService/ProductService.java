package com.react.react.ApiService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.react.AppEntity.Product;
import com.react.react.AppRepository.ApiRepository;


@Service
public class ProductService {
    @Autowired  
    private ApiRepository repo;
    public List<Product> getProduct(){
        return repo.findAll();        
    }

    public String updateProduct(int product_id,Product pro){
        pro.setProduct_id(product_id);
        repo.saveAndFlush(pro);
        return "Product saved successfully";
    }
      
}
