package com.example.yin.controller;

import com.example.yin.YinMusicApplicationTests;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest()
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class Test1 {
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        System.out.println("---------------start---------------");
        System.out.println("================end================");
    }

    @Test
    @Transactional
    @Rollback()
    public void save() throws Exception {
//        String json"{dasd}";
//执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
        mockMvc.perform(MockMvcRequestBuilders
                .post("/XXX/save")
//                .content(json.getBytes()) //传json参数
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .header("Authorization","Bearer ********-****-****-****-************")
        )
                .andExpect(MockMvcResultMatchers.status().isOk());
//                .andDo(print());
    }

}
