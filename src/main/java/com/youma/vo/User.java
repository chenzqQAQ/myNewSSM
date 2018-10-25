/**
 * Copyright (C),2015-2018
 * FileNmae: User
 * Author:   Administrator
 * Date:     2018/10/22 16:09
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma.vo;

/**
 * User
 * TODO(描述类的作用)
 *
 * @author 陈泽群
 * @date 2018/10/22 16:09
 */
public class User {
    private int userId;
    private String userName;
    private String userPassword;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return String.format("用户id%d用户名%s用户密码%s", getUserId(), getUserName(), getUserPassword());
    }
}
