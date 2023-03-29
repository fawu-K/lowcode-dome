package com.dome.vo;


import com.kang.common.vo.ITableVo;
import lombok.Data;

import java.io.Serializable;

/**
 * 该类为自定义的数据表视图类，通过继承TableVo类以供代码生成器使用
 *
 * @author K.faWu
 * @program LowCode-dome
 * @date 2023-01-06 13:56
 **/

@Data
public class UserTableVo extends ITableVo implements Serializable {

    private String test;

    @Override
    public String toString() {
        return "UserTableVo{" +
                "test='" + test + '\'' +
                '}';
    }
}
