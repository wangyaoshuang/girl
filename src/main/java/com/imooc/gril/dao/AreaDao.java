package com.imooc.gril.dao;

import com.imooc.gril.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> queryArea();
    int insertArea(Area area);
    int updateArea(Area area);
    int  deleteArea(int areaId);
}
