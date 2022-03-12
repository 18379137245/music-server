package com.example.yin.service.impl;

import com.example.yin.dao.SongListMapper;
import com.example.yin.dao.TableTwoMapper;
import com.example.yin.domain.Song;
import com.example.yin.domain.SongList;
import com.example.yin.domain.TableTwo;
import com.example.yin.service.SongService;
import com.example.yin.service.TableTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class TableTwoServiceImpl implements TableTwoService{
    @Autowired
    private TableTwoMapper tableTwoMapper;

    @Override
    public boolean deleteTableTwoList(Integer userid) {
        return tableTwoMapper.deleteTableTwoList(userid) >0 ?true:false;
    }
    @Override
    public List<TableTwo> allList()
    {
        return tableTwoMapper.allList();
    }

    @Override
    public List<TableTwo> allList2(String userid)
    {
        System.out.println(userid);
        return tableTwoMapper.allList2(userid);

    }

    @Override
    public boolean addTableList(TableTwo tableTwo)
    {
        return tableTwoMapper.insertSelective(tableTwo) > 0?true:false;
    }
    @Override
    public boolean updateTableTwoMsg(TableTwo tableTwo) {
        return tableTwoMapper.updateTableTwoMsg(tableTwo) >0 ?true:false;
    }
}
