/**
 * Copyright (C),2015-2018
 * FileNmae: test
 * Author:   Administrator
 * Date:     2018/10/22 15:54
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package test;

import com.youma.Dao.UserDao;
import com.youma.Dao.roleDao;
import com.youma.Util.sqlSessionfactoryUtil;
import com.youma.vo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * test
 * TODO(描述类的作用)
 *
 * @author 陈泽群
 * @date 2018/10/22 15:54
 */
public class test {
    public static void main(String[] args) {

        SqlSession sqlSession = sqlSessionfactoryUtil.getSqlSession();
        roleDao roleDao = sqlSession.getMapper(roleDao.class);
    /*    Role role = new Role();

        role.setRoleName("角色");
        List<Role> roles = roleDao.findAlls();
        roles.forEach((x) -> System.out.println(x.toString()));*/
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        // Configuration configuration = new Configuration();
        // // SqlSessionFactory sqlSessionFactory=configuration.o
        // SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(configuration);
/*        User user = new User();
        user.setUserName("测试10.23");
        user.setUserPassword("10081");
        System.out.println(userDao.userAdd(user));
        sqlSession.commit();
        User user1 = new User();
        user1.setUserId(40);
        // userDao.userDel(38);
        user1.setUserPassword("25326");
        // userDao.userUpdate(user1);
        */
        List<User> list = userDao.userAll(0,5);
        for (User user2 : list) {
            System.out.println(user2.toString());
        }
        /*User user1 = new User();
        user1.setUserName("role");
        List<User> list = userDao.userFinds(user1);
        if (list == null) {
            System.out.println("没有查询结果");
        }
        for (User user2 : list) {
            System.out.println(user2.toString());
        }*/
       /* User user2 = userDao.userFind(35);
        System.out.println(user2.toString());*/
        // System.out.println(userDao.userCount());
       /* int[] a = {5320, 6830};
        System.out.println(a[0] + " " + a[1]);
        change(a);
        System.out.println(a[0] + " " + a[1]);*/
    }

    public static void change(int a[]) {
        a[0] = a[0] ^ a[1];
        a[1] = a[0] ^ a[1];
        a[0] = a[0] ^ a[1];
    }
}
