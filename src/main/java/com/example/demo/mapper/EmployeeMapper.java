package com.example.demo.mapper;

import com.example.demo.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sy
 * @since 2019-02-17
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    List<Employee> findAll();

    void createTable();

    List<Employee> findByEmailAndsalary(@Param("email") String email, @Param("salary") Double salary);

    Long countAll();
}
