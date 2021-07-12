package com.demo.controller;

import com.demo.pojo.Student;
import com.demo.repositoy.StudentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @ClassName: StudentHandler
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 15:06
 * @Vesion: 1.0
 */
@RequestMapping("/student")
@RestController
public class StudentHandler {

    @Resource
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }


    @GetMapping("/findall")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }
    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable("id")long id){
        return studentRepository.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveorupdate(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveorupdate(student);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id")long id){
        studentRepository.deleteById(id);
    }



}
