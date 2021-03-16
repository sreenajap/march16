package com.infy.product;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.infosys.fa4project.product.entity.Product;
import com.infosys.fa4project.product.repository.ProductRepository;
import com.infosys.fa4project.product.service.ProductService;
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ProductApplicationTests {

	@InjectMocks
	ProductService service=new ProductService();
	
	
	
	@Mock
	ProductRepository repo;
	
	@Test
    public void getAllProducts() throws Exception{
        List<Product> expected=new ArrayList<>();
        Product prod =new Product();
        prod.setProdId(1);
        prod.setBrand("Alisha");
        prod.setCategory("Clothing");
        prod.setDescription("Key Features of Womens Cycling Shorts Cotton Lycra Navy");
        prod.setImage("http://img5a.flixcart.com/image/short/u/4/a/altht-3p-21-alisha-38-original-imaeh2d5vm5zbtgg.jpeg");
        prod.setPrice(500.00f);
        prod.setProductName("Alisha Solid Womens cycling Shorts");
        prod.setRating(9);
        prod.setSellerId(7);
        prod.setStock(50);
        prod.setSubCategory("womens Clothing");
        expected.add(prod);
        
        
        Mockito.when(repo.findAll()).thenReturn(expected);
       
      assertEquals(1,service.getAllProducts().size());
        
        
    }

}
