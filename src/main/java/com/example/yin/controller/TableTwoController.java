package com.example.yin.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.yin.domain.SongList;
import com.example.yin.domain.TableTwo;
import com.example.yin.service.TableTwoService;
import com.example.yin.service.impl.SongListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TableTwoController {
    @Autowired
    private TableTwoService tableTwoService;

    @RequestMapping(value = "/TableList", method = RequestMethod.GET)
    public Object TableList()
    {
        return tableTwoService.allList();
    }

    @RequestMapping(value = "/TableList2", method = RequestMethod.GET)
    public Object TableList2(HttpServletRequest req) {
        String id = req.getParameter("id");
        return tableTwoService.allList2(id);
    }

    //    删除歌单
    @RequestMapping(value = "/Table/delete", method = RequestMethod.GET)
    public Object deleteTableTwoList(HttpServletRequest req) {
        String id = req.getParameter("id");
        return tableTwoService.deleteTableTwoList(Integer.parseInt(id));
    }
    //    添加歌单
    @ResponseBody
    @RequestMapping(value = "/Table/add", method = RequestMethod.GET)
    public Object addTableTwo(HttpServletRequest req) throws ParseException {
        JSONObject jsonObject = new JSONObject();
        String userid = req.getParameter("userid").trim();

        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

        Date date = sdf.parse( req.getParameter("date"));
        String username = req.getParameter("username").trim();
        String province = req.getParameter("province").trim();
        String city = req.getParameter("city").trim();
        String site = req.getParameter("site").trim();
        String postcode = req.getParameter("postcode").trim();
        TableTwo tableTwo = new TableTwo();
        tableTwo.setUserid(userid);
        tableTwo.setDate(date);
        tableTwo.setUsername(username);
        tableTwo.setProvince(province);
        tableTwo.setCity(city);
        tableTwo.setSite(site);
        tableTwo.setPostcode(postcode);

        boolean res = tableTwoService.addTableList(tableTwo);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "添加成功");
            return jsonObject;
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "添加失败");
            return jsonObject;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/Table/update", method = RequestMethod.POST)
    public Object updateTableTwoMsg(HttpServletRequest req){
        JSONObject jsonObject = new JSONObject();
        String userid = req.getParameter("userid").trim();

        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

        Date date = null;
        try {
            date = sdf.parse( req.getParameter("date"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String username = req.getParameter("username").trim();
        String province = req.getParameter("province").trim();
        String city = req.getParameter("city").trim();
        String site = req.getParameter("site").trim();
        String postcode = req.getParameter("postcode").trim();
        TableTwo tableTwo = new TableTwo();
        tableTwo.setUserid(userid);
        tableTwo.setDate(date);
        tableTwo.setUsername(username);
        tableTwo.setProvince(province);
        tableTwo.setCity(city);
        tableTwo.setSite(site);
        tableTwo.setPostcode(postcode);
       // boolean res = tableTwoService.addTableList(tableTwo);
        boolean res = tableTwoService.updateTableTwoMsg(tableTwo);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "修改成功");
            return jsonObject;
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "修改失败");
            return jsonObject;
        }
    }
}
