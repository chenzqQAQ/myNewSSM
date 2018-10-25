/**
 * Copyright (C),2015-2018
 * FileNmae: test1
 * Author:   Administrator
 * Date:     2018/10/23 10:42
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */

import com.youma.Dao.UserDao;
import com.youma.Util.sqlSessionfactoryUtil;
import com.youma.vo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

/**
 * test1
 * TODO(描述类的作用)
 *
 * @author 陈泽群
 * @date 2018/10/23 10:42
 */
public class test1 {
    @Test
    public void testAdd() {
        SqlSession sqlSession = sqlSessionfactoryUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUserName("测试");
        user.setUserPassword("aaaa");
        Assert.assertEquals(1, userDao.userAdd(user));
    }

}
