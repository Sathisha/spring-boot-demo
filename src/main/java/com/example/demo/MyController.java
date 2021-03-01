package com.example.demo;

import com.example.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    DataService dataServices;
    private Emp emp;


    @RequestMapping("/hello")
    public String sayHello(@RequestParam(required = false, defaultValue = "myName")  String name){
        System.out.println("name = " + name);
        return "Hello world! " + name;
    }


    @PostMapping("/add-emp")
    public  @ResponseBody String createEmp(@RequestBody Emp emp){

        System.out.println("in createEmp");
        System.out.println("emp = " + emp);


        Emp emp1 = dataServices.save(emp);


        return "Success";
    }

    @RequestMapping("/get-all")
    public @ResponseBody List<Emp> getAll(){

        List<Emp> all = (List<Emp>) dataServices.findAll();
        all.forEach(System.out::println);
        return all;

    }

    @DeleteMapping("/delete")
    public @ResponseBody String deleteEmp(@RequestParam int empId){

        System.out.println("empId = " + empId);
        Iterable<Emp> emp = dataServices.findAllById(Collections.singleton(empId));
        emp.forEach(System.out::println);
        emp.forEach(dataServices::delete);
        System.out.println("deleted");

        return "Success";
    }

    @RequestMapping("/searchByDept")
    public @ResponseBody List<Emp> searchByDept(@RequestParam String dept){

        List<Emp> byDept = dataServices.findByDept(dept);
        byDept.forEach(System.out::println);

        return byDept;

    }

}
