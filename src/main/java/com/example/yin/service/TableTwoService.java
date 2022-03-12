package com.example.yin.service;

import com.example.yin.domain.Song;
import com.example.yin.domain.SongList;
import com.example.yin.domain.TableTwo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TableTwoService {

    boolean deleteTableTwoList(Integer userid);

    List<TableTwo> allList();

    List<TableTwo> allList2(String userid);

    boolean updateTableTwoMsg(TableTwo tableTwo);

   // int insertSelective(TableTwo record);
    boolean addTableList (TableTwo tableTwo);
}
