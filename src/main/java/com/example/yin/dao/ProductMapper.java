package com.example.yin.dao;

import com.example.yin.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//数据操作层
@Mapper
public interface ProductMapper {

    //查询所有
    List<Product> queryAllProduct();

    //根据Id查询记录
    List<Product> queryProductByProduct_Id(@Param("product_id") int product_id);

    //根据Id查询记录 @Param("userid") String userid
    List<Product> queryProductBy(@Param("product_id") int product_id,
                                 @Param("product_ename") String product_ename,
                                 @Param("product_cname") String product_cname,
                                 @Param("product_quantity") String product_quantity);

    //添加表数据
    public int insertProduct(Product product);

    //修改表数据
    public int updateProduct(Product product);

    //删除表数据
    public int deleteProduct(int product_id);

    //查找最大的id
    public int maxProductId();

}