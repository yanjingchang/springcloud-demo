package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Student
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 16:02
 * @Vesion: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private char gender;
}
