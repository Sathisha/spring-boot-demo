package com.example.demo.service;

import com.example.demo.Emp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DataService extends CrudRepository<Emp, Integer> {

    List<Emp> findByDept(String dept);
}
