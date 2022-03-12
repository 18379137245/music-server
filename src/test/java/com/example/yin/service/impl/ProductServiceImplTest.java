package com.example.yin.service.impl;

import com.example.yin.domain.Product;
import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest extends TestCase {

    private Logger log = Logger.getLogger(ProductServiceImpl.class);
    @Resource
    ProductServiceImpl productServiceimpl =  new ProductServiceImpl();

    @Before
    public void before(){
        log.info("测试开始");
    }

    @Test
    public void testQueryAllProduct() {
        log.info(productServiceimpl.queryAllProduct());
    }
    @Test
    public void testQueryProductByProduct_Id() {

        log.info(productServiceimpl.queryProductByProduct_Id(2));
    }

    @Test
    public void testQueryProductBy() {
        Product product = new Product();
        product.setProduct_id((Integer.parseInt("14")));
        product.setProduct_ename("");
        product.setProduct_cname("");
        product.setProduct_quantity("");
        product.setBorrow_date("");
        product.setReturn_date("");
        product.setProduct_owner("");
        log.info(product.getProduct_id());
        log.info(product.getProduct_cname());
        log.info(product.getProduct_ename());
        log.info(product.getProduct_quantity());
        log.info(product.getProduct_owner());
        log.info(product.getBorrow_date());
        log.info(product.getReturn_date());
        log.info(productServiceimpl.queryProductBy(product));
    }

    @Test
    public void testQueryProductBy2() {
        Product product = new Product();
        product.setProduct_id((Integer.parseInt("14")));
        product.setProduct_ename("");
        product.setProduct_cname("");
        product.setProduct_quantity("");
        product.setBorrow_date("asd");
        product.setReturn_date("asd");
        product.setProduct_owner("");
        log.info(product.getProduct_id());
        log.info(product.getProduct_cname());
        log.info(product.getProduct_ename());
        log.info(product.getProduct_quantity());
        log.info(product.getProduct_owner());
        log.info(product.getBorrow_date());
        log.info(product.getReturn_date());
        log.info(productServiceimpl.queryProductBy(product));
    }
    @Test
    public void testQueryProductBy3() {
        Product product = new Product();
        product.setProduct_id((Integer.parseInt("14")));
        product.setProduct_ename("");
        product.setProduct_cname("sda");
        product.setProduct_quantity("");
        product.setBorrow_date("asd");
        product.setReturn_date("asd");
        product.setProduct_owner("");
        log.info(product.getProduct_id());
        log.info(product.getProduct_cname());
        log.info(product.getProduct_ename());
        log.info(product.getProduct_quantity());
        log.info(product.getProduct_owner());
        log.info(product.getBorrow_date());
        log.info(product.getReturn_date());
        log.info(productServiceimpl.queryProductBy(product));
    }

    @Test
    public void testInsertProduct() {

        Product product = new Product();
        product.setProduct_id((Integer.parseInt("56")));
        product.setProduct_ename("asd");
        product.setProduct_cname("dad");
        product.setProduct_quantity("sdad");
        product.setBorrow_date("asdad");
        product.setReturn_date("sada");
        product.setProduct_owner("dxy");
        log.info(product.getProduct_id());
        log.info(product.getProduct_cname());
        log.info(product.getProduct_ename());
        log.info(product.getProduct_quantity());
        log.info(product.getProduct_owner());
        log.info(product.getBorrow_date());
        log.info(product.getReturn_date());
        int a = productServiceimpl.insertProduct(product);
        log.info(a);
    }

    @Test
    public void testInsertProduct2() {
        Product product = new Product();
        product.setProduct_id((Integer.parseInt("56")));
        product.setProduct_ename("asd");
        product.setProduct_cname("dad");
        product.setProduct_quantity("sdad");
        product.setBorrow_date("asdad");
        product.setReturn_date("sada");
        product.setProduct_owner("dxy");
        log.info(product.getProduct_id());
        log.info(product.getProduct_cname());
        log.info(product.getProduct_ename());
        log.info(product.getProduct_quantity());
        log.info(product.getProduct_owner());
        log.info(product.getBorrow_date());
        log.info(product.getReturn_date());
        int a = productServiceimpl.insertProduct(product);
        log.info(a);
    }
    @Test
    public void testUpdateProduct() {
        Product product = new Product();
        product.setProduct_id((Integer.parseInt("56")));
        product.setProduct_ename("asd");
        product.setProduct_cname("ASDd");
        product.setProduct_quantity("sdaASd");
        product.setBorrow_date("asdad");
        product.setReturn_date("sada");
        product.setProduct_owner("dxy");
        log.info(product.getProduct_id());
        log.info(product.getProduct_cname());
        log.info(product.getProduct_ename());
        log.info(product.getProduct_quantity());
        log.info(product.getProduct_owner());
        log.info(product.getBorrow_date());
        log.info(product.getReturn_date());
        int a = productServiceimpl.updateProduct(product);
        log.info(a);
    }

    @Test
    public void testDeleteProduct() {
        log.info(productServiceimpl.deleteProduct(111));
    }
    @After
    public void after(){
        log.info("测试结束");
    }
}