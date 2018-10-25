/**
 * Copyright (C),2015-2018
 * FileNmae: sqlSessionfactoryUtil
 * Author:   Administrator
 * Date:     2018/10/23 11:32
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * sqlSessionfactoryUtil
 * TODO(描述类的作用)
 *
 * @author 陈泽群
 * @date 2018/10/23 11:32
 */
public class sqlSessionfactoryUtil {
    static String resource = "conf.xml";
    static InputStream inputStream = null;
    static SqlSessionFactory factory;

    static {
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(inputStream);
    }

    public static SqlSession getSqlSession() {
        return factory.openSession();
    }
}
