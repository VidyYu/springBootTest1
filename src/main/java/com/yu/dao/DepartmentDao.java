package com.yu.dao;

import com.yu.pojo.Deppartment;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {
    //模拟数据库中的数据
    private static Map<Integer, Deppartment> departments =null;
    static {
        departments = new HashMap<Integer,Deppartment>();
        departments.put(101,new Deppartment(101,"教学部"));
        departments.put(102,new Deppartment(102,"市场部"));
        departments.put(103,new Deppartment(103,"运营部"));
        departments.put(104,new Deppartment(104,"教研部"));
        departments.put(105,new Deppartment(105,"销售部"));
    }

    //获得所有部门信息
    public Collection<Deppartment> getDepartments()
    {
        return departments.values();
    }

    public Deppartment getDepartmentById(Integer id)
    {
        return departments.get(id);

    }

}
