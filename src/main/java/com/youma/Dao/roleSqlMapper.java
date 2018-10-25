/**
 * Copyright (C),2015-2018
 * FileNmae: roleSqlMapper
 * Author:   Administrator
 * Date:     2018/10/24 15:29
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma.Dao;

import com.youma.vo.Role;
import org.apache.ibatis.jdbc.SQL;

/**
 * roleSqlMapper
 * TODO(描述类的作用)
 *
 * @author 陈泽群
 * @date 2018/10/24 15:29
 */
public class roleSqlMapper {
    public String SelectByid() {
        return new SQL() {
            {
                SELECT("roleID,roleName");
                FROM("role");
            }
        }.toString();
    }

    public String SelectParams(Role role) {
        return new SQL() {
            {
                SELECT("roleID,roleName");
                FROM("role");
                if (role.getRoleID() != null) {
                    WHERE("roleid=#{roleid}");
                }
                if (role.getRoleName() != null) {
                    WHERE("roleName like concat('%',#{roleName},'%')");
                }

            }
        }.toString();
    }
}
