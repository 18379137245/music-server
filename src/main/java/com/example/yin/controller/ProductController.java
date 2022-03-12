package com.example.yin.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.yin.domain.Product;

import com.example.yin.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

//控制层
@RestController
@RequestMapping(value = "/product",method = {RequestMethod.GET,RequestMethod.POST})
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceimpl;
    //查询所有
    @GetMapping("/queryAllProduct")
    public List<Product> queryAllProduct(){
        return productServiceimpl.queryAllProduct();
    }

    //根据Id查询记录
    @GetMapping("/queryProductByProduct_Id")
    @ResponseBody
    public List<Product> queryProductByProduct_Id(int product_id){

        return  productServiceimpl.queryProductByProduct_Id(product_id);
    }

    //查询记录
    @RequestMapping(value = "/queryProductBy",method = {RequestMethod.POST})
    public List<Product> queryProductBy(HttpServletRequest req){
        JSONObject jsonObject = new JSONObject();
        String product_id = req.getParameter("product_id").trim();
        String product_ename = req.getParameter("product_ename").trim();
        String product_cname = req.getParameter("product_cname").trim();
        String product_quantity = req.getParameter("product_quantity").trim();


        Product product = new Product();
        product.setProduct_id((Integer.parseInt(product_id)));
        product.setProduct_ename(product_ename);
        product.setProduct_cname(product_cname);
        product.setProduct_quantity(product_quantity);


        return productServiceimpl.queryProductBy(product);
//                                                 product_ename,
//                                                 product_cname,
//                                      z           product_quantity);

//        JSONObject jsonObject = new JSONObject();
//        int product_id=0;
//        String product_ename="";
//        String product_cname="";
//        int product_quantity=0;
//        if(req.getParameter("product_id") != ""){
//            product_id = Integer.parseInt(req.getParameter("product_id").trim());
//        }
//        if(req.getParameter("product_ename") != ""){
//            product_ename = req.getParameter("product_ename").trim();
//        }
//        if(req.getParameter("product_cname") != ""){
//            product_cname = req.getParameter("product_cname").trim();
//        }
//        if(req.getParameter("product_quantity") != ""){
//            product_quantity = Integer.parseInt(req.getParameter("product_quantity").trim());
//        }
//        return productServiceimpl.queryProductBy(product_id,
//                                                 product_ename,
//                                                 product_cname,
//                                                 product_quantity);
    }

    //添加表数据
    @RequestMapping(value = "/insertProduct",method = {RequestMethod.POST})
    public Object insertProduct(HttpServletRequest req){

        JSONObject jsonObject = new JSONObject();
        String product_id = req.getParameter("product_id").trim();
        String product_ename = req.getParameter("product_ename").trim();
        String product_cname = req.getParameter("product_cname").trim();
        String product_quantity = req.getParameter("product_quantity").trim();
        String borrow_date = req.getParameter("borrow_date").trim();
        String return_date = req.getParameter("return_date").trim();

        Product product = new Product();
        product.setProduct_id((Integer.parseInt(product_id)));
        product.setProduct_ename(product_ename);
        product.setProduct_cname(product_cname);
        product.setProduct_quantity(product_quantity);
        product.setBorrow_date(borrow_date);
        product.setReturn_date(return_date);
        product.setProduct_owner("dxy");

        int a = productServiceimpl.insertProduct(product);

        if (a>=1) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "添加成功");
            return jsonObject;
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "添加失败");
            return jsonObject;
        }
    }
    //修改表数据
    @RequestMapping(value = "/updateProduct",method = {RequestMethod.PUT})
    public Object updateProduct(HttpServletRequest req){
        JSONObject jsonObject = new JSONObject();
        String product_id = req.getParameter("product_id").trim();

//        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
//
//        Date date = sdf.parse( req.getParameter("date"));
        String product_ename = req.getParameter("product_ename").trim();
        String product_cname = req.getParameter("product_cname").trim();
        String product_quantity = req.getParameter("product_quantity").trim();
        String borrow_date = req.getParameter("borrow_date").trim();
        String return_date = req.getParameter("return_date").trim();
//        String site = req.getParameter("site").trim();
//        String postcode = req.getParameter("postcode").trim();
//        TableTwo tableTwo = new TableTwo();
//        tableTwo.setUserid(userid);
////        tableTwo.setDate(date);
//        tableTwo.setUsername(username);
//        tableTwo.setProvince(province);
//        tableTwo.setCity(city);
//        tableTwo.setSite(site);
//        tableTwo.setPostcode(postcode);
        Product product = new Product();
        product.setProduct_id((Integer.parseInt(product_id)));
        product.setProduct_ename(product_ename);
        product.setProduct_cname(product_cname);
        product.setProduct_quantity(product_quantity);
        product.setBorrow_date(borrow_date);
        product.setReturn_date(return_date);

        int a = productServiceimpl.updateProduct(product);

        if (a>=1) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "修改成功");
            return jsonObject;
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "修改失败");
            return jsonObject;
        }
    }

    //删除表数据
    @RequestMapping(value = "/deleteProduct",method = RequestMethod.DELETE)
    public int deleteProduct(int product_id){
        return productServiceimpl.deleteProduct(product_id);
    }
}