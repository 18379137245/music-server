package com.example.yin.dao;
import com.example.yin.domain.TableTwo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableTwoMapper {

    int deleteTableTwoList(Integer userid);

    int updateTableTwoMsg(TableTwo tableTwo);

    List<TableTwo> allList();

    List<TableTwo> allList2(@Param("userid") String userid);

    int insertSelective(@Param("tableTwo") TableTwo tableTwo);

    List<TableTwo> querybyid (String id);
}
