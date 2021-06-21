package com.ahut.api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author hanzijian
 * @description:
 * @create 2021-05-21 15:04
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long id; // 主键
    private String deptName; // 部门名称
    private String dbSource;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
