/**
 * Copyright (C),2015-2018
 * FileNmae: roleDao
 * Author:   Administrator
 * Date:     2018/10/24 15:41
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma.Dao;

import com.youma.vo.Role;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * roleDao
 * TODO(描述类的作用)
 *
 * @author 陈泽群
 * @date 2018/10/24 15:41
 */
public interface roleDao {
    @SelectProvider(type = roleSqlMapper.class, method = "SelectByid")
    public List<Role> findAlls();

    @SelectProvider(type = roleSqlMapper.class, method = "SelectParams")
    public List<Role> findAll(Role role);
}
