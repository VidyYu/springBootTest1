package com.yu.dao;

import com.yu.pojo.Deppartment;
import com.yu.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees =null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees = new HashMap<Integer,Employee>();
        employees.put(1001,new Employee(1001,"AA","123@qq.com",1,new Deppartment(101,"教学部")));
        employees.put(1002,new Employee(1002,"BB","123@qq.com",0,new Deppartment(102,"市场部")));
        employees.put(1003,new Employee(1003,"CC","123@qq.com",1,new Deppartment(103,"运营部")));
        employees.put(1004,new Employee(1004,"DD","123@qq.com",0,new Deppartment(104,"教研部")));
    }

    //C
    private static Integer initId = 1006;
    public void add(Employee employee){
        if(employee.getId() == null)
            employee.setId(initId++);
        employee.setDeppartment(departmentDao.getDepartmentById(employee.getDeppartment().getId()));
        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    public void delete(Integer id){
        employees.remove(id);
    }
}
