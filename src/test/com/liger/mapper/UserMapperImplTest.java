package com.liger.mapper;

import com.liger.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UserMapperImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>八月 14, 2017</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class UserMapperImplTest {

    @Autowired
    private UserMapper userMapper;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: queryUserById(Long  )
     */
    @Test
    public void testQueryUserById() throws Exception {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

    /**
     * Method: queryUserAll()
     */
    @Test
    public void testQueryUserAll() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryUserAll2()
     */
    @Test
    public void testQueryUserAll2() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: insertUser(User user)
     */
    @Test
    public void testInsertUser() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateUser(User user)
     */
    @Test
    public void testUpdateUser() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: deleteUser(Long id)
     */
    @Test
    public void testDeleteUser() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: login(String username, String address)
     */
    @Test
    public void testLogin() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryUserList(String name)
     */
    @Test
    public void testQueryUserList() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryUserListByNameOrSex(String name, String age)
     */
    @Test
    public void testQueryUserListByNameOrSex() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryUserListByNameAndSex(String name, String age)
     */
    @Test
    public void testQueryUserListByNameAndSex() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateUserNull(User user)
     */
    @Test
    public void testUpdateUserNull() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: ueryUserListByIds(Integer[] ids)
     */
    @Test
    public void testUeryUserListByIds() throws Exception {
//TODO: Test goes here... 
    }


} 
