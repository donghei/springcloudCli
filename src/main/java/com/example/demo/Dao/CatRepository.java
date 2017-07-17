package com.example.demo.Dao;

import com.example.demo.model.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2017/7/17/017.
 */
public interface CatRepository extends CrudRepository<Cat,Integer> {
}
