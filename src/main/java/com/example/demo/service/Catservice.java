package com.example.demo.service;

import com.example.demo.Dao.CatRepository;
import com.example.demo.model.Cat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/17/017.
 */
@Service
public class Catservice {

    @Resource
    private CatRepository catRepository;

    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }

    //删除数据》
    @Transactional
    public void delete(int id){
        catRepository.delete(id);
    }

    //查询数据.
    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }
}
