package com.example.yin.service;

import com.example.yin.domain.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {

    //查询所有
    List<Product> queryAllProduct();

    //根据Id查询记录
    List<Product> queryProductByProduct_Id(int product_id);

    //根据Id查询记录 @Param("userid") String userid
    List<Product> queryProductBy(int product_id,
                                 String product_ename,
                                 String product_cname,
                                 int product_quantity);

    //添加表数据
    public int insertProduct(Product product);

    //修改表数据
    public int updateProduct(Product product);

    //删除表数据
    public int deleteProduct(int product_id);




}