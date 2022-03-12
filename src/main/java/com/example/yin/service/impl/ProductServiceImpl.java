package com.example.yin.service.impl;

import com.example.yin.dao.ProductMapper;
import com.example.yin.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//服务层
@Service
public class ProductServiceImpl {

    @Autowired
    ProductMapper productMapper;

    //查询所有
    public List<Product> queryAllProduct() {
        return productMapper.queryAllProduct();
    }

    //根据Id查询记录
    public List<Product> queryProductByProduct_Id(int product_id){
        return productMapper.queryProductByProduct_Id(product_id);
    }

    public List<Product> queryProductBy(Product product) {
        int product_id=product.getProduct_id();
        String product_ename=product.getProduct_ename();
        String product_cname=product.getProduct_cname();
        String product_quantity=product.getProduct_quantity();

        return  productMapper.queryProductBy(product_id,
                                             product_ename,
                                             product_cname,
                                             product_quantity);
    }

    //添加表数据
    public int insertProduct(Product product){
        int maxProductId = productMapper.maxProductId() +1;
        product.setProduct_id(maxProductId);

        int a = productMapper.insertProduct(product);
        return a;
    }

    //修改表数据
    public int updateProduct(Product product){
        return productMapper.updateProduct(product);
    }

    //删除表数据
    public int deleteProduct(int product_id){
        return productMapper.deleteProduct(product_id);
    }
}