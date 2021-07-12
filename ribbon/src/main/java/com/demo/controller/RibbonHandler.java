package com.demo.controller;

import com.demo.pojo.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @ClassName: RibbonHandler
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 18:30
 * @Vesion: 1.0
 */
@RequestMapping("/ribbon")
@RestController
public class RibbonHandler {
    @Resource
    private RestTemplate restTemplate;

    //负载均衡测试
    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }

    @GetMapping("/findall")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://provider/student/findall",Collection.class);
    }
    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable("id")long id){
       return restTemplate.getForObject("http://provider/student/findbyid/{id}",Student.class,id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://provider/student/save",student,Student.class);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://provider/student/update",student);
    }
    @DeleteMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable("id")long id){
        restTemplate.delete("http://provider/student/delete/{id}",id);
    }
}
