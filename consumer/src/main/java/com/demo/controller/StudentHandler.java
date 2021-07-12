package com.demo.controller;

import com.demo.pojo.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @ClassName: StudentHandler
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 16:18
 * @Vesion: 1.0
 */
@RequestMapping("/consumer")
@RestController
public class StudentHandler {
    //业务方法中通过RestTemplate来调用provider的相关服务
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/findall")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://localhost:8010/student/findall",Collection.class);
    }

    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable("id")long id){
        return restTemplate.getForObject("http://localhost:8010/student/findbyid/{id}",Student.class,id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,Student.class);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id")long id){
        restTemplate.delete("http://localhost:8010/student/delete/{id}",id);
    }
}
