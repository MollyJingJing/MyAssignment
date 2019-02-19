package com.example.demo;

import com.example.demo.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 启动该测试类产生emploee表
 * 注意配置数据库用户名密码
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateTable {
    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    public void contextLoads() {
		employeeMapper.createTable();
    }
}
