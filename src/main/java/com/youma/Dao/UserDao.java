package com.youma.Dao;

import com.youma.vo.User;

import java.util.List;

/**
 * UserDao
 * TODO(描述类的作用)
 *
 * @author 陈泽群
 * @date 2018/10/22 16:13
 */
public interface UserDao {

    public int userAdd(User user);

    public List<User> userAll(int a,int b);

    public List<User> userFinds(User user);

    public int userUpdate(User user);

    public int userDel(int id);
    public int userDelgt(int id);

    public User userFind(int id);

    public int userCount();
}
