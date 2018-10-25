/**
 * Copyright (C),2015-2018
 * FileNmae: Role
 * Author:   Administrator
 * Date:     2018/10/24 15:42
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma.vo;

/**
 *Role
 *TODO(描述类的作用)
 *@author 陈泽群
 *@date 2018/10/24 15:42
 */
public class Role {
    private Integer roleID;
    private String roleName;

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
