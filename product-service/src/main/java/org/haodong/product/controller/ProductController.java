package org.haodong.product.controller;

import org.apache.ibatis.annotations.Param;
import org.haodong.dto.ProductDto;
import org.haodong.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.util.List;

@RestController
public class ProductController {
    @Value("{appName}")
    private String appName;

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/info")
    public String info(){
        String name = ManagementFactory.getRuntimeMXBean().getName();
        return "商品：" + name + " 进程：" + Thread.currentThread().getName();
    }

    @GetMapping("/products")
    public List<ProductDto> findAllProducts() {
        List<ProductDto> products = productMapper.findAllProducts();
        return products;
    }

    @GetMapping("/products/{id}")
    public ProductDto findProductsById(@PathVariable("id") int id) {
        ProductDto product = productMapper.findProductById(id);
        return product;
    }
}
