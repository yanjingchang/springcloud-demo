package com.demo.feign;

import com.demo.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @ClassName: FeignProviderClient
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/8 - 15:00
 * @Vesion: 1.0
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student/index")
    public String index();
    @GetMapping("/student/findall")
    public Collection<Student> findAll();
    @GetMapping("/student/findbyid/{id}")
    public Student findById(@PathVariable("id")long id);
    @PostMapping("/student/save")
    public void save(@RequestBody Student student);
    @PutMapping("/student/update")
    public void update(@RequestBody Student student);
    @DeleteMapping("/student/delete/{id}")
    public void deleteById(@PathVariable("id")long id);
}
