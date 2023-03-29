package com.dome.property;

import com.dome.vo.UserTableVo;
import com.kang.common.vo.ITableVo;
import com.kang.freeMarker.config.TableVoProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 自定义的tablevo属性封装类
 *
 * @author K.faWu
 * @program lowcode-dome
 * @date 2023-03-29 16:36
 **/
@Slf4j
@Component
public class TestTableVoProperty extends TableVoProperty {
    @Override
    public void setProperty(ITableVo itableVo, String tableName, String packageName) {
        super.setProperty(itableVo, tableName, packageName);
        log.debug("调用自定义的参数封装方法");
        UserTableVo userTableVo = (UserTableVo)itableVo;
        userTableVo.setTest("这是自定义的属性，并通过自定义的setProperty方法进行赋值");
    }
}
