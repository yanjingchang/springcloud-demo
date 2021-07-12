package com.demo.controller;

import com.demo.feign.FeignProviderClient;
import com.demo.pojo.Student;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @ClassName: HystrixHandler
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/8 - 15:32
 * @Vesion: 1.0
 */
@RequestMapping("/hystrix")
@RestController
public class HystrixHandler {
    @Resource
    private FeignProviderClient feignProviderClient;

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

    @GetMapping("/findall")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }
    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable("id")long id){
        return feignProviderClient.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        feignProviderClient.save(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        feignProviderClient.update(student);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id")long id){
        feignProviderClient.deleteById(id);
    }
}
