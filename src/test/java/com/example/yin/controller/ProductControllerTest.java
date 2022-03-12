package com.example.yin.controller;

import com.example.yin.YinMusicApplicationTests;
import com.example.yin.domain.Product;
import com.example.yin.service.impl.ProductServiceImpl;
import junit.framework.TestCase;
import net.minidev.json.JSONUtil;
import org.apache.catalina.connector.Request;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
public class ProductControllerTest extends TestCase {

//    private  Logger log = (Logger) LoggerFactory.getLogger(ProductServiceImpl.class);
    private Logger log = Logger.getLogger(ProductServiceImpl.class);

    @Autowired
    private MockMvc mockMvc;
    private MockHttpServletRequest request;


    @Before
    public void before(){
        log.info("测试开始");
    }

    @Test
    public void testQueryAllProduct() throws Exception {
//执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
        mockMvc.perform(MockMvcRequestBuilders
                .get("http://localhost:8888/product/queryAllProduct")
//                .content() //传json参数
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .header("Authorization","Bearer ********-****-****-****-************")
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());

//        log.info(mockMvc.queryAllProduct());
    }
    @Test
    public void testQueryProductByProduct_Id() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders
                        .get("http://localhost:8888/product/queryProductByProduct_Id")
//                .content()
                        .param("product_id","2")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .header("Authorization","Bearer ********-****-****-****-************")
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
//        log.info(productServiceimpl.queryProductByProduct_Id(2));
    }

    @Test
    public void testQueryProductBy() throws Exception{

        request = new MockHttpServletRequest();

        Product product = new Product();
        product.setProduct_id(1);
        product.setProduct_cname("fra");
        product.setProduct_ename("gdds");
        product.setProduct_quantity("FAS");

//        JSONUtil.convertToX();

        mockMvc.perform(MockMvcRequestBuilders
                        .get("http://localhost:8888/product/queryProductBy")
//                .content()
//                        .param("product", )
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .header("Authorization","Bearer ********-****-****-****-************")
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());

//        mockMvc.perform(MockMvcRequestBuilders.post(url)
//                .accept(MediaType.APPLICATION_JSON)
//                .param("userId", "3"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(model().attributeExists("name"))
//                .andReturn();
    }

    @Test
    public void testInsertProduct() {

        Product product = new Product();
        product.setProduct_id((Integer.parseInt("14")));
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
//        int a = productServiceimpl.insertProduct(product);
       // log.info(a);
    }

    public void testUpdateProduct() {
    }

    @Test
    public void testDeleteProduct() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                        .delete("http://localhost:8888/product/deleteProduct")
//                .content()
                        .param("product_id","21")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .header("Authorization","Bearer ********-****-****-****-************")
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }
    @After
    public void after(){
        log.info("测试结束");
    }
}