package com.shm.service;

import java.util.List;

import com.shm.pojo.Catelog;

/**
 * Created by lenovo on 2017/5/9.
 */
public interface CatelogService {
    public List<Catelog> getAllCatelog();
    public int getCount(Catelog catelog);
    Catelog selectByPrimaryKey(Integer id);
    int updateByPrimaryKey(Catelog record);
    int updateCatelogNum(Integer id,Integer number);
}
