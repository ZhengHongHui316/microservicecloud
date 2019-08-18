package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author zhh
 * @Date 2019/7/18 19:46
 * @Version 1.0
 **/
@AllArgsConstructor //全参构造函数
@NoArgsConstructor  //空参构造函数
@Data               //get set
@Accessors(chain=true) //链式
public class Dept implements Serializable{  //必须序列化
    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }
}
